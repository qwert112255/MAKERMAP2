package com.example.emma119018.makermap;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.text.util.LinkifyCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ListAdapter listAdapter;
    private TextView mTextMessage;
    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);

        BottomNavigationView navigation1 = (BottomNavigationView)findViewById(R.id.navigation);
        navigation1.setSelectedItemId(R.id.navigation_home);
        navigation1.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        Intent intent3 = new Intent();
                        intent3.setClass(MainActivity.this,ChooseActivity.class);
                        startActivity(intent3);
                        break;
                    case R.id.navigation_dashboard:
                        Intent intent6 = new Intent();
                        intent6.setClass(MainActivity.this,MapsActivity.class);
                        startActivity(intent6);
                        break;
                    case R.id.navigation_notifications:
                        Intent intent5 = new Intent();
                        intent5.setClass(MainActivity.this,AboutActivity.class);
                        startActivity(intent5);
                        break;
                }
                return true;
            }
        });

        List<HashMap<String , String>> list = new ArrayList<>();

        String[] str1 = new String[]{"手刻橡皮章 x 聖誕節卡片DIY","Python 學習地圖與攻略","Arduino四軸飛行器開發實作","Python姿態控制和影像處理特戰班"};
        String[] str2 = new String[]{"主辦：慕耕活茶研所","主辦：三創育成基金會","主辦：T客邦創客基地","主辦：中軟科技有限公司"};
        String[] str3 = new String[]{"時間：12/22 19:00 – 21:30","時間：1/4 19:30 – 21:30","時間：1/5 17:30 – 19:30","時間：1/5 13:00 – 17:00"};
        String[] str4 = new String[]{"報名：http://bit.ly/2SELOwk","報名：http://bit.ly/2Aqz3hS","報名：http://bit.ly/2Auau3J","報名：http://bit.ly/2ArNhiJ"};

        //Linkify.addLinks(str4,Linkify.WEB_URLS);

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
                new String[]{"str1","str2","str3","str4"} ,
                new int[]{R.id.str1 ,R.id.str2, R.id.str3,R.id.str4});

        listView.setAdapter(listAdapter);
    }

    public void onNavigationItemReselected(@NonNull MenuItem item) {

    }

}
