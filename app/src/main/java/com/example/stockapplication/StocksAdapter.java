package com.example.stockapplication;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

public class StocksAdapter extends Adapter<StocksAdapter.MyViewHolder> {
    private String[] stocks;
    private float[] values;
    private Integer[] owned;
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.stock_list,parent,false);
        Log.e("called","create");
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
holder.mStockName.setText(stocks[position]);
holder.mStockValue.setText(String.format("%s", values[position]));
holder.mStocksOwned.setText(String.format("%s", owned[position]));
        Log.e("called","bind");

    }
    @Override
    public int getItemCount() {
        return stocks.length;
    }
StocksAdapter(String[] stockNames,float[] stockValues,Integer[] stocksOwned){
        stocks=stockNames;
        values=stockValues;
        owned=stocksOwned;
}
    static class MyViewHolder extends RecyclerView.ViewHolder{
         TextView mStockName;
        TextView mStockValue;
         TextView mStocksOwned;
         MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mStockName=itemView.findViewById(R.id.stockName);
            mStockValue=itemView.findViewById(R.id.stockValue);
            mStocksOwned=itemView.findViewById(R.id.stocksOwned);
        }
    }
}
