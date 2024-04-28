package com.example.home;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;


public class NgoListFragment extends Fragment {

    ImageButton btn;
    TextView name;
    TextView desc;
    TextView addr;
    TextView motive;

    EditText et_name;
    EditText et_des;
    EditText et_add;
    EditText et_motive;

    Button btn1;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ngo_list, container, false);
        btn = view.findViewById(R.id.plus);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //popup coming up
                name=view.findViewById(R.id.name1);
                desc=view.findViewById(R.id.des1);
                addr=view.findViewById(R.id.add1);
                motive=view.findViewById(R.id.motive1);

                final Dialog dialog = new Dialog(getActivity());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.fragment_registration);





                et_name=dialog.findViewById(R.id.group3);
                et_des=dialog.findViewById(R.id.group4);
                et_add=dialog.findViewById(R.id.group6);
                et_motive=dialog.findViewById(R.id.group9);



                btn1=dialog.findViewById(R.id.group10);

                btn1.setOnClickListener(view -> {
                    String Sname = et_name.getText().toString();
                    String Sadd1 = et_des.getText().toString();
                    String Sadd2 = et_add.getText().toString();
                    String Sadd3 = et_motive.getText().toString();

                    name.setText(Sname);
                    desc.setText(Sadd1);
                    addr.setText(Sadd2);
                    motive.setText(Sadd3);
                    dialog.dismiss();
                });

                dialog.show();
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
                dialog.getWindow().setGravity(Gravity.BOTTOM);            }
        });



        return view;
    }

}