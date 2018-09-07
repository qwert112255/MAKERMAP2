package com.example.emma119018.makermap;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import static com.example.emma119018.makermap.R.id.navigation;
import static com.example.emma119018.makermap.R.id.navigation_home;

public class AboutActivity extends AppCompatActivity {

    private ImageButton myImagebutton;
    private ImageButton myImagebutton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        myImagebutton = (ImageButton)findViewById(R.id.imageButton2);
        myImagebutton2 = (ImageButton)findViewById(R.id.imageButton3);

        final BottomNavigationView navigation1 = (BottomNavigationView)findViewById(R.id.navigation);
        navigation1.setSelectedItemId(R.id.navigation_notifications);
        navigation1.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        Intent intent3 = new Intent();
                        intent3.setClass(AboutActivity.this,ChooseActivity.class);
                        startActivity(intent3);
                        return true;
                    case R.id.navigation_dashboard:
                        Intent intent6 = new Intent();
                        intent6.setClass(AboutActivity.this,MapsActivity.class);
                        startActivity(intent6);
                        return true;
                    case R.id.navigation_notifications:
                        return true;
                }
                return false;
            }
        });

        myImagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:emma119018@gmail.com"));
                intent.putExtra(Intent.EXTRA_SUBJECT,"客服信件");
                intent.putExtra(Intent.EXTRA_TEXT,"APP出問題了");
                startActivity(intent);
            }
        });

        myImagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:0906569980"));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                }
        });
    }

}
