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
import android.widget.CheckBox;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
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
        final CheckBox rb1 = (CheckBox) findViewById(R.id.rb1);
        final CheckBox rb2 = (CheckBox) findViewById(R.id.rb2);
        final CheckBox rb3 = (CheckBox) findViewById(R.id.rb3);

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
                    if ( rb1.isChecked()){
                        Intent intent = new Intent();
                        intent.setClass(ChooseActivity.this, Main4Activity.class);
                        startActivity(intent);
                        if ( rb2.isChecked() ) {
                            Intent intent1 = new Intent();
                            intent1.setClass(ChooseActivity.this, Main9Activity.class);
                            startActivity(intent1);
                            if ( rb3.isChecked() ){
                                Intent intent2 = new Intent();
                                intent2.setClass(ChooseActivity.this, MainActivity.class);
                                startActivity(intent2);
                            }
                        }
                    }else if (rb2.isChecked()){
                        Intent intent = new Intent();
                        intent.setClass(ChooseActivity.this, Main7Activity.class);
                        startActivity(intent);
                        if (rb3.isChecked()){
                            Intent intent3 = new Intent();
                            intent3.setClass(ChooseActivity.this, Main10Activity.class);
                            startActivity(intent3);
                        }
                    }else if (rb3.isChecked()) {
                        Intent intent = new Intent();
                        intent.setClass(ChooseActivity.this, Main8Activity.class);
                        startActivity(intent);
                        if (rb1.isChecked()) {
                            Intent intent4 = new Intent();
                            intent4.setClass(ChooseActivity.this, Main11Activity.class);
                            startActivity(intent4);
                        }
                    }else{
                        Intent intent = new Intent();
                        intent.setClass(ChooseActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                }
            });
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if ( rb1.isChecked()){
                        Intent intent = new Intent();
                        intent.setClass(ChooseActivity.this, Main5Activity.class);
                        startActivity(intent);
                        if ( rb2.isChecked() ) {
                            Intent intent1 = new Intent();
                            intent1.setClass(ChooseActivity.this, Main14Activity.class);
                            startActivity(intent1);
                            if ( rb3.isChecked() ){
                                Intent intent2 = new Intent();
                                intent2.setClass(ChooseActivity.this, Main2Activity.class);
                                startActivity(intent2);
                            }
                        }
                    }else if (rb2.isChecked()){
                        Intent intent = new Intent();
                        intent.setClass(ChooseActivity.this, Main12Activity.class);
                        startActivity(intent);
                        if (rb3.isChecked()){
                            Intent intent3 = new Intent();
                            intent3.setClass(ChooseActivity.this, Main15Activity.class);
                            startActivity(intent3);
                        }
                    }else if (rb3.isChecked()) {
                        Intent intent = new Intent();
                        intent.setClass(ChooseActivity.this, Main13Activity.class);
                        startActivity(intent);
                    if (rb1.isChecked()) {
                        Intent intent4 = new Intent();
                        intent4.setClass(ChooseActivity.this, Main16Activity.class);
                        startActivity(intent4);
                        }
                    }else{
                        Intent intent = new Intent();
                        intent.setClass(ChooseActivity.this, Main2Activity.class);
                        startActivity(intent);
                    }
                }
            });
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if ( rb1.isChecked()){
                        Intent intent = new Intent();
                        intent.setClass(ChooseActivity.this, Main6Activity.class);
                        startActivity(intent);
                        if ( rb2.isChecked() ) {
                            Intent intent1 = new Intent();
                            intent1.setClass(ChooseActivity.this, Main19Activity.class);
                            startActivity(intent1);
                            if ( rb3.isChecked() ){
                                Intent intent2 = new Intent();
                                intent2.setClass(ChooseActivity.this, Main3Activity.class);
                                startActivity(intent2);
                            }
                        }
                    }else if (rb2.isChecked()){
                        Intent intent = new Intent();
                        intent.setClass(ChooseActivity.this, Main17Activity.class);
                        startActivity(intent);
                        if (rb3.isChecked()){
                            Intent intent3 = new Intent();
                            intent3.setClass(ChooseActivity.this, Main20Activity.class);
                            startActivity(intent3);
                        }
                    }else if (rb3.isChecked()) {
                        Intent intent = new Intent();
                        intent.setClass(ChooseActivity.this, Main18Activity.class);
                        startActivity(intent);
                        if (rb1.isChecked()) {
                            Intent intent4 = new Intent();
                            intent4.setClass(ChooseActivity.this, Main21Activity.class);
                            startActivity(intent4);
                        }
                    }else{
                        Intent intent = new Intent();
                        intent.setClass(ChooseActivity.this, Main3Activity.class);
                        startActivity(intent);
                    }
                }
            });
    }
    }