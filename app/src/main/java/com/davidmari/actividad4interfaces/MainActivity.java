package com.davidmari.actividad4interfaces;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnLongClickListener;


public class MainActivity extends AppCompatActivity {

    private CheckBox cb;
    private TextView tv, hide;
    private RatingBar rb;
    private TextView punt;
    private FrameLayout frame;
    private Button b1, b2;
    private boolean background = true;
    private boolean buttonColor = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb = (CheckBox) findViewById(R.id.checkBox);
        tv = (TextView) findViewById(R.id.hidden_text);
        hide = (TextView) findViewById(R.id.long_press);
        rb = (RatingBar) findViewById(R.id.stars);
        punt = (TextView) findViewById(R.id.rating);
        frame = (FrameLayout) findViewById(R.id.rating_layout);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        final Toast t = Toast.makeText(this, "Hola. Soy una notificación", Toast.LENGTH_SHORT);

        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                punt.setText("[" + rating + "/5]");
            }
        });

        hide.setOnLongClickListener(new OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                t.show();
                return false;
            }
        });
    }

    public void checkBox(View v) {
        if (cb.isChecked()) {
            tv.setVisibility(View.VISIBLE);
        } else {
            tv.setVisibility(View.INVISIBLE);
        }
    }

    public void changeBackground(View v) {
        if(background==true){
            b1.setText("Fondo Blanco");
            frame.setBackgroundColor(ContextCompat.getColor(getBaseContext(),R.color.red));
        }else if(background==false){
            b1.setText("Fondo Rojo");
            frame.setBackgroundColor(ContextCompat.getColor(getBaseContext(),R.color.white));
        }
        background=!background;
    }

    public void buttonColor(View v) {
        if(buttonColor==true){
            b2.setText("Letras Negras");
            b2.setTextColor(ContextCompat.getColor(getBaseContext(),R.color.red));
        }else if(buttonColor==false){
            b2.setText("Letras Rojas");
            b2.setTextColor(ContextCompat.getColor(getBaseContext(),R.color.black));
        }
        buttonColor=!buttonColor;
    }

}