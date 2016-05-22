package com.malkomich.kotlinsample.ui.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.malkomich.kotlinsample.domain.model.JavaForecast;
import com.malkomich.kotlinsample.domain.model.JavaForecastList;

/**
 * Created by malkomich on 21/05/2016.
 */
public class JavaForecastAdapter extends RecyclerView.Adapter<JavaForecastAdapter.ViewHolder> {

    private JavaForecastList items;

    public JavaForecastAdapter(JavaForecastList items) {
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(new TextView(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        JavaForecast forecast = items.getDailyForecast().get(position);
        holder.getTextView().setText(
            forecast.getDate() + " - " + forecast.getDescription() + " - " + forecast.getHigh() + "/" +
                forecast.getLow());
    }

    @Override
    public int getItemCount() {
        return items.getDailyForecast().size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.textView = (TextView) itemView;
        }

        public TextView getTextView() {
            return textView;
        }

        public void setTextView(TextView textView) {
            this.textView = textView;
        }

    }

}
