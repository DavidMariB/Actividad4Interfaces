package com.davidmari.actividad4interfaces;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox cb;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb = (CheckBox) findViewById(R.id.checkBox);
        tv = (TextView) findViewById(R.id.hidden_text);

    }

    public void checkBox(View v){
        if(cb.isChecked()){
            tv.setVisibility(View.VISIBLE);
        }else{
            tv.setVisibility(View.INVISIBLE);
        }
    }

    public void elToast(){
        Toast t = Toast.makeText(this,"EL TOAST, EL PUTO TOAST",Toast.LENGTH_SHORT);
        t.show();
    }
}
