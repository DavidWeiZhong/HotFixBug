package com.example.lcit.hotfixbug;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.tencent.bugly.crashreport.CrashReport;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CrashReport.initCrashReport(getApplicationContext(), "6cc2fb3ee7", true);

    }

    public void btnclick(View view) {
        CrashReport.testJavaCrash();
    }
}
