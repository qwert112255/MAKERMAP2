package com.example.emma119018.makermap;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.location.LocationManager;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.CameraUpdateFactory;
import android.util.Log;

public class Main2Activity extends AppCompatActivity{

    private ListView listView;
    private ListAdapter listAdapter;
    private TextView mTextMessage;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = (ListView) findViewById(R.id.listView);

        List<HashMap<String , String>> list = new ArrayList<>();

        String[] str1 = new String[]{"ARVR實境商城"};
        String[] str2 = new String[]{"主辦：台中創客基地"};
        String[] str3 = new String[]{"時間：9/15 09:30 –  17:00"};

        for(int i = 0 ; i < str1.length ; i++){
            HashMap<String , String> hashMap = new HashMap<>();
            hashMap.put("str1" , str1[i]);
            hashMap.put("str2" , str2[i]);
            hashMap.put("str3" , str3[i]);
            list.add(hashMap);
        }
        ListAdapter listAdapter = new SimpleAdapter(
                this,
                list,
                R.layout.layout,
                new String[]{"str1" , "str2","str3"} ,
                new int[]{R.id.str1 ,R.id.str2, R.id.str3});

        listView.setAdapter(listAdapter);
    }

    public void onNavigationItemReselected(@NonNull MenuItem item) {

    }
}
