package com.example.emma119018.makermap;

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

public class Main2Activity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemReselectedListener{

    private ListView listView;
    private ListAdapter listAdapter;
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override

        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    return true;
                case R.id.navigation_dashboard:
                    Intent Map =new Intent(Main2Activity.this,MapsActivity.class);
                    startActivity(Map);
                    break;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            finish();
            return true;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = (ListView) findViewById(R.id.listView);

        List<HashMap<String , String>> list = new ArrayList<>();

        String[] str1 = new String[]{"手作皮革輕鬆小品","【南投創客基地】熱昇華轉印機基礎研習課程"};
        String[] str2 = new String[]{"主辦：知沐蹓躂趣","主辦：北訓電腦附設職業訓練中心"};
        String[] str3 = new String[]{"時間：10:30~15:00","時間： 18:30~21:30"};

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


        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    public void onNavigationItemReselected(@NonNull MenuItem item) {

    }
}
