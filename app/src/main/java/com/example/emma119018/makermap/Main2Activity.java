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
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

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
        listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new String[]
                {"","手作皮革輕鬆小品\n主辦：知沐蹓躂趣\n時間：10:30~15:00\n",
                        "【南投創客基地】熱昇華轉印機基礎研習課程\n主辦：南投創客基地\n時間： 18:30~21:30\n",
                        "【職前訓練免學費】平面製圖與3DsMAX的3D列印世界\n主辦：北訓電腦附設職業訓練中心\n時間：6/13~8/31\n",
                        "夏季浪漫盆花 - 晨間早餐課程\n主辦：蒔嚐 しばしば\n時間：9:30~12:00\n",
                        "【南科在地製造】模具製造 - 台南瑞浲企業參訪\n主辦：MakerPRO自造達人社群聚落\n時間：14:00~16:00\n",
                        "【2018南科[aɪ] 自造夢想嘉年華】MVP自造專案加速計畫Demo Day\n主辦：MakerPRO自造達人社群聚落\n時間：14:00~16:00\n"
                });
        listView.setAdapter(listAdapter);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
