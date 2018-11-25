package com.example.emma119018.makermap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ChooseActivity extends AppCompatActivity {
    private ListView listView;
    private ListAdapter listAdapter;
    private TextView mTextMessage;
    private Button im1;
    private Button im2;
    private Button im3;





    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        mTextMessage = (TextView) findViewById(R.id.message);
        final BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setSelectedItemId(R.id.navigation_home);

        Button button=(Button)findViewById(R.id.north);
        Button button1=(Button)findViewById(R.id.center);
        Button button2=(Button)findViewById(R.id.south);

        BottomNavigationView navigation1 = (BottomNavigationView)findViewById(R.id.navigation);
        navigation1.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        return true;
                    case R.id.navigation_dashboard:
                         Intent intent6 = new Intent();
                         intent6.setClass(ChooseActivity.this,MapsActivity.class);
                         startActivity(intent6);
                        return true;
                    case R.id.navigation_notifications:
                        Intent intent5 = new Intent();
                        intent5.setClass(ChooseActivity.this,AboutActivity.class);
                        startActivity(intent5);
                        return true;
                        }
                        return false;
                }
            });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(ChooseActivity.this,MainActivity.class);
                startActivity(intent);
            }

        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent();
                intent1.setClass(ChooseActivity.this,Main2Activity.class);
                startActivity(intent1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent();
                intent2.setClass(ChooseActivity.this,Main3Activity.class);
                startActivity(intent2);
            }
        });
        im1 = (Button)findViewById(R.id.im1);
        im2 = (Button)findViewById(R.id.im2);
        im3 = (Button)findViewById(R.id.im3);

        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in3 = new Intent();
                in3.setClass(ChooseActivity.this,Main4Activity.class);
                startActivity(in3);
            }
        });
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in4 = new Intent();
                in4.setClass(ChooseActivity.this,Main5Activity.class);
                startActivity(in4);
            }
        });
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in5 = new Intent();
                in5.setClass(ChooseActivity.this,Main6Activity.class);
                startActivity(in5);
            }
        });

    }


    public void onNavigationItemReselected(@NonNull MenuItem item) {

    }

}