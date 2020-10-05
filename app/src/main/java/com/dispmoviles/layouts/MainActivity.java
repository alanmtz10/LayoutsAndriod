package com.dispmoviles.layouts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeActivity(View v) {

        int viewID = v.getId();

        Intent newActivity = new Intent();

        switch (viewID) {
            case R.id.btnLinearLH:
                newActivity.setClass(this, LinearLayoutH.class);
                break;
            case R.id.btnLinearLV:
                newActivity.setClass(this, LinearLayoutV.class);
                break;
            case R.id.btnTableLayout:
                newActivity.setClass(this, TableLayout.class);
                break;
            case R.id.btnFrameLayout:
                newActivity.setClass(this, FrameLayout.class);
                break;
        }

        startActivity(newActivity);

    }
}
