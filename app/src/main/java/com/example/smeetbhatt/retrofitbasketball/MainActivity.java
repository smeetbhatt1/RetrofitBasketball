package com.example.smeetbhatt.retrofitbasketball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("BASEURL", "     ddddd");
    }

    public void setLakers(View view) {

        Intent i = new Intent(getApplicationContext(),ListActivity.class);
        i.putExtra("type","lakers");
        startActivity(i);
    }

    public void setCleveland(View view) {

        Intent i = new Intent(getApplicationContext(),ListActivity.class);
        i.putExtra("type","cleveland");
        startActivity(i);
    }
}
