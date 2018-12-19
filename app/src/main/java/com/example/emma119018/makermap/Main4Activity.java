package com.example.emma119018.makermap;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main4Activity extends AppCompatActivity {

    private ListView listView;
    private ListAdapter listAdapter;
    private TextView mTextMessage;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        listView = (ListView) findViewById(R.id.listView);

        BottomNavigationView navigation1 = (BottomNavigationView)findViewById(R.id.navigation);
        navigation1.setSelectedItemId(R.id.navigation_home);
        navigation1.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        Intent intent3 = new Intent();
                        intent3.setClass(Main4Activity.this,ChooseActivity.class);
                        startActivity(intent3);
                        break;
                    case R.id.navigation_dashboard:
                        Intent intent6 = new Intent();
                        intent6.setClass(Main4Activity.this,MapsActivity.class);
                        startActivity(intent6);
                        break;
                    case R.id.navigation_notifications:
                        Intent intent5 = new Intent();
                        intent5.setClass(Main4Activity.this,AboutActivity.class);
                        startActivity(intent5);
                        break;
                }
                return true;
            }
        });

        List<HashMap<String , String>> list = new ArrayList<>();

        String[] str1 = new String[]{"RESTful 物聯網平台實作體驗","IoT 雲端自動澆花系統實作","手做個人化雷雕小夜燈"};
        String[] str2 = new String[]{"主辦：台灣立子雲","主辦：T客邦創客基地","主辦：MakerPRO自造達人社群聚落"};
        String[] str3 = new String[]{"時間：12/14 13:30 – 16:30","時間：12/15 9:30 – 17:30","時間：12/16 9:30 –  16:30"};
        String[] str4 = new String[]{"報名："+"https://ppt.cc/fr7Uqx","報名："+"https://ppt.cc/fyMV4x","報名："+"https://makerpro.cc/"};

        for(int i = 0 ; i < str1.length ; i++){
            HashMap<String , String> hashMap = new HashMap<>();
            hashMap.put("str1" , str1[i]);
            hashMap.put("str2" , str2[i]);
            hashMap.put("str3" , str3[i]);
            hashMap.put("str4" , str4[i]);
            list.add(hashMap);
        }
        ListAdapter listAdapter = new SimpleAdapter(
                this,
                list,
                R.layout.layout,
                new String[]{"str1" , "str2","str3","str4"} ,
                new int[]{R.id.str1 ,R.id.str2, R.id.str3,R.id.str4});

        listView.setAdapter(listAdapter);
    }

    public void onNavigationItemReselected(@NonNull MenuItem item) {

    }
}