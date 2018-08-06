package com.example.emma119018.makermap;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class AboutActivity extends AppCompatActivity {

    private ImageButton myImagebutton;
    private ImageButton myImagebutton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        myImagebutton = (ImageButton)findViewById(R.id.imageButton2);
        myImagebutton2 = (ImageButton)findViewById(R.id.imageButton3);

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
