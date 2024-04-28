package com.example.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;

public class account extends AppCompatActivity {

    ImageButton btn;
    FirebaseAuth user;
    ImageButton vector;
    ImageButton vector2;
    ImageButton vector3;
    ImageButton vector4;
    ImageButton vector5;
    ImageButton profilebtn;
    ImageView profilepic;
    int SELECT_PICTURE = 200;
    Uri selectedImageUri;

    Button log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        vector = findViewById(R.id.vector);
        vector2 = findViewById(R.id.vector2);
        vector3 = findViewById(R.id.vector3);
        vector5 = findViewById(R.id.vector5);

        log = findViewById(R.id.group_10);

        user = FirebaseAuth.getInstance();

        profilebtn = findViewById(R.id.profilepic);

        profilebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageChooser();
            }
        });


        btn = findViewById(R.id.group_1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(account.this, pages.class);
                startActivity(intent);
            }
        });

        vector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(account.this, notification.class);
                startActivity(intent);
            }
        });

        vector2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(account.this, personalinfo.class);
                startActivity(intent);
            }
        });

        vector3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(account.this, security.class);
                startActivity(intent);
            }
        });



        vector5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(account.this, help.class);
                startActivity(intent);
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.signOut();
                Intent intent = new Intent(account.this, login.class);
                startActivity(intent);
            }
        });




    }

    void imageChooser() {


        // create an instance of the
        // intent of the type image
        Intent i = new Intent();
        i.setType("image/*");
        i.setAction(Intent.ACTION_GET_CONTENT);

        // pass the constant to compare it
        // with the returned requestCode
        startActivityForResult(Intent.createChooser(i, "Select Picture"), SELECT_PICTURE);

    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {

            // compare the resultCode with the
            // SELECT_PICTURE constant
            if (requestCode == SELECT_PICTURE) {
                // Get the url of the image from data
                selectedImageUri = data.getData();
                if (null != selectedImageUri) {
                    // update the preview image in the layout
                    //
                    // profilepic.setImageURI(selectedImageUri);
                }
            }
        }

    }
}