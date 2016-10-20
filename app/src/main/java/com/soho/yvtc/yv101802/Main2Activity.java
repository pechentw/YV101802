package com.soho.yvtc.yv101802;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tv3 = (TextView) findViewById(R.id.textView3);
        TextView tv2 = (TextView) findViewById(R.id.textView2);
        Intent it = getIntent();
        String str = it.getStringExtra("mydata");
//        Bundle b = it.getExtras();
//        String str = b.getString("mydata");

        tv3.setText(str);
        str = it.getStringExtra("mynumber");
//        str = b.getString("mynumber");


        tv2.setText(str);
    }
}
