package com.example.emma119018.makermap;

import android.support.annotation.NonNull;
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

public class Main3Activity extends AppCompatActivity {

    private ListView listView;
    private ListAdapter listAdapter;
    private TextView mTextMessage;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        listView = (ListView) findViewById(R.id.listView);

        List<HashMap<String , String>> list = new ArrayList<>();

        String[] str1 = new String[]{"【創客萊吧 MakerLab】小型智慧農場與ROS綜合實務應用"};
        String[] str2 = new String[]{"主辦：創客萊吧 MakerLab"};
        String[] str3 = new String[]{"時間：7/7 9:00 – 7/8 16:00"};

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