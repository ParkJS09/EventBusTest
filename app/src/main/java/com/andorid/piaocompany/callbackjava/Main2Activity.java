package com.andorid.piaocompany.callbackjava;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import org.greenrobot.eventbus.EventBus;


public class Main2Activity extends AppCompatActivity {

    private Button btn_callbacktest, btn_callBackTest2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        btn_callbacktest = findViewById(R.id.btn_callBackTest);
        btn_callBackTest2 = findViewById(R.id.btn_callBackTest2);
        btn_callbacktest.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                EventBus.getDefault().post(new EventTest("TEST"));
            }
        });

        btn_callBackTest2.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                EventBus.getDefault().post(new EventTest2("TEST"));
            }
        });
    }

}
