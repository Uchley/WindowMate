package com.example.windowmatemk2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.RadioGroup;
import android.widget.TextView;

public class rulewe extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    private RadioGroup group_klamka, group_dol, group_plecy;
    private ImageView image_dol, image_klamka, image_plecy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rulewe);

        image_dol = findViewById(R.id.imagedol);
        image_klamka = findViewById(R.id.imageklamka);
        image_plecy = findViewById(R.id.imageplecy);

        ImageView backIcon = findViewById(R.id.back_icon);
        ImageView menuIcon = findViewById(R.id.menu_icon);
        TextView toolbarText = findViewById(R.id.toolbar_title);

        group_klamka = findViewById(R.id.group_klamka);
        group_dol = findViewById(R.id.group_dol);
        group_plecy = findViewById(R.id.group_plecy);

        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                switch (v.getId()) {
                    case R.id.back_icon:
                        i = new Intent(rulewe.this, ru.class);
                        startActivity(i);
                        break;
                }
            }
        });

        toolbarText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                switch (v.getId()) {
                    case R.id.toolbar_title:
                        i = new Intent(rulewe.this, MainActivity.class);
                        startActivity(i);
                        break;
                }
            }
        });

        menuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                switch (v.getId()) {
                    case R.id.menu_icon:
                        PopupMenu popup = new PopupMenu(rulewe.this, v);
                        popup.setOnMenuItemClickListener(rulewe.this);
                        popup.inflate(R.menu.popup_menu);
                        popup.show();
                }
            }
        });

        group_klamka.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.kl1:
                        image_klamka.setImageDrawable(getResources().getDrawable(R.drawable.k190l));
                        break;

                    case R.id.kl2:
                        image_klamka.setImageDrawable(getResources().getDrawable(R.drawable.k235l));
                        break;

                    case R.id.kl3:
                        image_klamka.setImageDrawable(getResources().getDrawable(R.drawable.k433l));
                        break;

                    case R.id.kl4:
                        image_klamka.setImageDrawable(getResources().getDrawable(R.drawable.k533l));
                        break;

                    case R.id.kl5:
                        image_klamka.setImageDrawable(getResources().getDrawable(R.drawable.k583l));
                        break;

                    case R.id.kl6:
                        image_klamka.setImageDrawable(getResources().getDrawable(R.drawable.k1020czerwl));
                        break;

                    case R.id.kl7:
                        image_klamka.setImageDrawable(getResources().getDrawable(R.drawable.k1020czarl));
                        break;

                }
            }
        });

        group_dol.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.d1:
                        image_dol.setImageDrawable(getResources().getDrawable(R.drawable.drul1));
                        break;

                    case R.id.d2:
                        image_dol.setImageDrawable(getResources().getDrawable(R.drawable.drul2));
                        break;

                    case R.id.d3:
                        image_dol.setImageDrawable(getResources().getDrawable(R.drawable.drul3));
                        break;

                    case R.id.d4:
                        image_dol.setImageDrawable(getResources().getDrawable(R.drawable.drul4));
                        break;

                    case R.id.d5:
                        image_dol.setImageDrawable(getResources().getDrawable(R.drawable.drul5));
                        break;

                }
            }
        });

        group_plecy.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.p1:
                        image_plecy.setImageDrawable(getResources().getDrawable(R.drawable.p1l));
                        break;

                    case R.id.p2:
                        image_plecy.setImageDrawable(getResources().getDrawable(R.drawable.p2l));
                        break;

                    case R.id.p3:
                        image_plecy.setImageDrawable(getResources().getDrawable(R.drawable.p3l));
                        break;

                    case R.id.p4:
                        image_plecy.setImageDrawable(getResources().getDrawable(R.drawable.p4l));
                        break;

                    case R.id.p5:
                        image_plecy.setImageDrawable(getResources().getDrawable(R.drawable.p5l));
                        break;

                    case R.id.p6:
                        image_plecy.setImageDrawable(getResources().getDrawable(R.drawable.p6l));
                        break;

                    case R.id.p7:
                        image_plecy.setImageDrawable(getResources().getDrawable(R.drawable.p7l));
                        break;


                }
            }
        });
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