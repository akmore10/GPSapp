package com.example.gpsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Location;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ShowWayPointList extends AppCompatActivity {

    ListView showWayPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_way_point_list);
        showWayPoint = findViewById(R.id.lv_waypoints);
        MyApplication myApplication = (MyApplication)getApplicationContext();
        List<Location> savedLocation = myApplication.getMyLocations();

        showWayPoint.setAdapter(new ArrayAdapter<Location>(this, android.R.layout.simple_list_item_1,savedLocation));


    }
}