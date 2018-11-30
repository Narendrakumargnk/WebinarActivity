package com.example.narendra.webinaractivity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button activity_button,internal_button,external_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity_button= (Button) findViewById(R.id.activity);
        internal_button=(Button)findViewById(R.id.internalintent);
        external_button=(Button)findViewById(R.id.externalintent);
        activity_button.setOnClickListener(this);
        internal_button.setOnClickListener(this);
        external_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId() /*to get clicked view id**/) {
            case R.id.activity:
                Intent intent = new Intent(this, ActivityFlow.class);
                startActivity(intent);
                break;
            case R.id.internalintent:
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.inurture.co.in/"));
                        //"http://google.com"));
                startActivity(intent1);
                break;

            case R.id.externalintent:
                Intent intent2=new Intent(MainActivity.this, IntentTest.class);
                startActivity(intent2);
                break;

        }
    }
}
