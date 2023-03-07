package com.example.barchart;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BarChart barChart = findViewById(R.id.barChart);

        ArrayList<BarEntry> visitors = new ArrayList<>();

        visitors.add(new BarEntry(2014, 220));
        visitors.add(new BarEntry(2015, 90));
        visitors.add(new BarEntry(2016, 84));
        visitors.add(new BarEntry(2017, 120));
        visitors.add(new BarEntry(2018, 420));
        visitors.add(new BarEntry(2019, 640));
        visitors.add(new BarEntry(2020, 20));
        visitors.add(new BarEntry(2021, 124));

        BarDataSet barDataSet = new BarDataSet(visitors, "Visitors");
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);

        BarData barData = new BarData(barDataSet);

        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setText("Bar Chart Nelson");

        barChart.animateY(2000);



    }
}