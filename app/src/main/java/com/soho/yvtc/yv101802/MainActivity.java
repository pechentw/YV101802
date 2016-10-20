package com.soho.yvtc.yv101802;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v)
    {
        EditText ed = (EditText) findViewById(R.id.editText);
        EditText ed2 = (EditText) findViewById(R.id.editText2);

        Intent it = new Intent(MainActivity.this, Main2Activity.class);
        String str = ed.getText().toString();
//        it.putExtra("mydata", str);
//        str = ed2.getText().toString();
//        it.putExtra("mynumber", str);
        Bundle b = new Bundle();
        b.putString("mydata",str);
        str = ed2.getText().toString();
        b.putString("mynumber",str);

        startActivity(it);
    }
}
