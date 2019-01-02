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

public class Main15Activity extends AppCompatActivity {

    private ListView listView;
    private ListAdapter listAdapter;
    private TextView mTextMessage;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

        listView = (ListView) findViewById(R.id.listView);

        BottomNavigationView navigation1 = (BottomNavigationView)findViewById(R.id.navigation);
        navigation1.setSelectedItemId(R.id.navigation_home);
        navigation1.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        Intent intent3 = new Intent();
                        intent3.setClass(Main15Activity.this,ChooseActivity.class);
                        startActivity(intent3);
                        break;
                    case R.id.navigation_dashboard:
                        Intent intent6 = new Intent();
                        intent6.setClass(Main15Activity.this,MapsActivity.class);
                        startActivity(intent6);
                        break;
                    case R.id.navigation_notifications:
                        Intent intent5 = new Intent();
                        intent5.setClass(Main15Activity.this,AboutActivity.class);
                        startActivity(intent5);
                        break;
                }
                return true;
            }
        });

        List<HashMap<String , String>> list = new ArrayList<>();

        String[] str1 = new String[]{"藍草長出的循環經濟","注連繩","皮革手環DIY","柴柴胸針/迷你相框"};
        String[] str2 = new String[]{"主辦：品樂東海","主辦：This Place 分享空間","主辦：工藝之夢－好玩藝設計講堂","主辦：目目手作"};
        String[] str3 = new String[]{"時間：12/3 19:00 – 21:00","時間：1/20 14:00 – 17:00","時間：1/20 16:00 – 18:00","時間：1/26 9:00 – 12:30"};
        String[] str4 = new String[]{"報名：https://ppt.cc/fZFhUx","報名：http://bit.ly/2SyDSwO","報名：http://bit.ly/2Swa83F","報名：http://bit.ly/2SwairN"};

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