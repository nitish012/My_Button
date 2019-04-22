package com.example.my_button;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.Manifest.*;
import static android.Manifest.permission.*;
import static android.content.pm.PackageManager.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickme=(Button)findViewById(R.id.button);
        clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+ "9891480374"));
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com"));
                //Intent intent =new Intent(Intent.ACTION_CALL);
              //  intent.setData(Uri.parse("tel:"+98));
               // intent.setData(Uri.parse("tel:9891480374"));
               // if (PERMISSION_GRANTED != ActivityCompat.checkSelfPermission(MainActivity.this,
                  //      CALL_PHONE)) {
                    //return;}
                    startActivity(intent);

            }
        });


    }
}



