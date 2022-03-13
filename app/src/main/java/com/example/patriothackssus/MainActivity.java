package com.example.patriothackssus;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import java.util.*;

public class MainActivity extends AppCompatActivity {
    PieChart pieChart;
    PieData pieData;
    PieDataSet pieDataSet;
    ArrayList pieEntries;
    ArrayList PieEntryLabels;
    int bottlecount = 0;
    int cancount = 0;
    int papercount = 0;
    TextView helloTextView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pieChart = findViewById(R.id.pieChart);
        getEntries();
        pieDataSet = new PieDataSet(pieEntries, "");
        pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieDataSet.setColors(ColorTemplate.JOYFUL_COLORS);
        pieDataSet.setSliceSpace(2f);
        pieDataSet.setValueTextColor(Color.WHITE);
        pieDataSet.setValueTextSize(10f);
        pieDataSet.setSliceSpace(5f);
        button = (Button) findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewActivity();
            }
        });
        helloTextView = (TextView) findViewById(R.id.textView10);
    }
    private void getEntries() {
        pieEntries = new ArrayList<>();
        pieEntries.add(new PieEntry(bottlecount, 0));
        pieEntries.add(new PieEntry(cancount, 1));
        pieEntries.add(new PieEntry(papercount, 2));

    }

    public void increasebottlecount(View view) {
        bottlecount++;
        pieEntries.set(0,bottlecount);
        pieChart.invalidate();
        helloTextView.setText(Integer.toString(bottlecount));
    }

    public void increaespapercount(View view) {
        papercount++;
        pieEntries.set(2,papercount);
        pieChart.setData(pieData);
        pieChart.invalidate();
        helloTextView.setText("" + papercount );
    }

    public void openNewActivity(){
        Intent intent = new Intent(this, SUCC.class);
        startActivity(intent);
    }

    public void increasecancount(View view) {
        cancount++;
        pieEntries.set(1,cancount);
        pieChart.setData(pieData);
        helloTextView.setText("" + cancount);
    }
}