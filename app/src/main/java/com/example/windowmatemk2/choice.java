package com.example.windowmatemk2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

public class choice extends AppCompatActivity implements View.OnClickListener, PopupMenu.OnMenuItemClickListener {

    public CardView card1, card2, card3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        card1 = (CardView) findViewById(R.id.r);
        card2 = (CardView) findViewById(R.id.ru);
        card3 = (CardView) findViewById(R.id.sr);

        ImageView backIcon = findViewById(R.id.back_icon);
        ImageView menuIcon = findViewById(R.id.menu_icon);
        TextView toolbarText = findViewById(R.id.toolbar_title);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);

        backIcon.setOnClickListener(this);
        menuIcon.setOnClickListener(this);
        toolbarText.setOnClickListener(this);


    }

    @Override

    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.ru :
                i = new Intent(this, ru.class);
                startActivity(i);
                break;

            case R.id.r :
                i = new Intent(this, rozw.class);
                startActivity(i);
                break;

            case R.id.sr :
                i = new Intent(this, sr.class);
                startActivity(i);
                break;

            case R.id.toolbar_title:
                i = new Intent(this, choice.class);
                startActivity(i);
                break;

            /*case R.id.menu_icon:
                PopupMenu popup = new PopupMenu(this, v);
                popup.setOnMenuItemClickListener(this);
                popup.inflate(R.menu.popup_menu);
                popup.show();*/

            case R.id.back_icon:
                i = new Intent(choice.this, MainActivity.class);
                startActivity(i);
                break;
        }
    }


    @Override
    public boolean onMenuItemClick(MenuItem item) {
        Intent i;

        switch(item.getItemId()) {
            case R.id.nav_ru:
                i = new Intent(this, ru.class);
                startActivity(i);
                return true;

            case R.id.nav_r:
                i = new Intent(this, rozw.class);
                startActivity(i);
                return true;

            case R.id.nav_sr:
                i = new Intent(this, sr.class);
                startActivity(i);
                return true;
            default:
                return false;
        }

    }
}