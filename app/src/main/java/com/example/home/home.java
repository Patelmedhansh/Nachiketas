package com.example.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.home.ui.home.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class home extends AppCompatActivity {
    BottomNavigationView navigationView;
    ImageButton button1;
    ImageButton button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        replaceFragemt(new main());

        navigationView = findViewById(R.id.group_25);
        button1=findViewById(R.id.group_32);
        button2=findViewById(R.id.group_1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, account.class);
                startActivity(intent);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (home.this,pages.class);
                startActivity(intent);
            }
        });


        navigationView.setOnItemSelectedListener(item -> {



            if (item.getItemId()==R.id.navigation_home){
                replaceFragemt(new main());
            } else if (item.getItemId()==R.id.navigation_dashboard) {
                 replaceFragemt(new NgoListFragment());
            } else if (item.getItemId()==R.id.navigation_notifications) {
                replaceFragemt(new cart());
            } else {
                replaceFragemt(new main());
            }

            return true;
        });


    }private void replaceFragemt(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame , fragment);
        fragmentTransaction.commit();
    }
}

