package com.malkomich.kotlinsample.ui.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.malkomich.kotlinsample.ForecastAsyncTask;
import com.malkomich.kotlinsample.OnResultListener;
import com.malkomich.kotlinsample.R;
import com.malkomich.kotlinsample.domain.model.JavaForecastList;
import com.malkomich.kotlinsample.ui.adapters.JavaForecastAdapter;

public class JavaMainActivity extends AppCompatActivity implements OnResultListener {

    private RecyclerView forecast_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null)
                    .show();
            }
        });

        forecast_list = (RecyclerView) findViewById(R.id.forecast_list);
        forecast_list.setLayoutManager(new LinearLayoutManager(this));

        new ForecastAsyncTask(this).execute("47007");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onResult(JavaForecastList items) {
        forecast_list.setAdapter(new JavaForecastAdapter(items));
    }
}
