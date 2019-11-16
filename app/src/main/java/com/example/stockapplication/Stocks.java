package com.example.stockapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Stocks extends AppCompatActivity {
RecyclerView recyclerView;
StocksAdapter adapter;
String[] stockNames={"Tata","Reliance","Microsoft","Apple"};
float[] stockValues={1,2,3,4};
Integer[] stocksOwned={2,4,1,7};
String[] label={"Stock name","Stock price","Number of stocks owned"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stocks_xml);
        TextView t1=findViewById(R.id.t1);
        TextView t2=findViewById(R.id.t2);
        TextView t3=findViewById(R.id.t3);
        t1.setText(label[0]);
        t2.setText(label[1]);
        t3.setText(label[2]);

recyclerView=findViewById(R.id.recyclerView);
adapter=new StocksAdapter(stockNames,stockValues,stocksOwned);
recyclerView.setAdapter(adapter);
recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public void show(View view) {
        Toast.makeText(getApplicationContext(),"pressed",Toast.LENGTH_LONG).show();
    }
}
