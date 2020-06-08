package com.example.call;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent();

        i.setPackage("com.google.android.apps.tachyon");

        i.setAction("com.google.android.apps.tachyon.action.REGISTER");

        i.setAction("com.google.android.apps.tachyon.action.INVITE");

        i.setAction("com.google.android.apps.tachyon.action.CALL");

        i.setData(Uri.parse("tel:4388066603"));

        startActivity(i);
    }
}
