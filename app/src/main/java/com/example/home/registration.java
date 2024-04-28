//package com.example.home;
//
//import android.content.Intent;
//import android.os.Bundle;
//
//import androidx.fragment.app.Fragment;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.EditText;
//
//
//public class registration extends Fragment {
//
//    EditText name;
//    EditText description;
//    EditText address;
//    EditText motive;
//
//    Button btn;
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        View view = inflater.inflate(R.layout.fragment_registration, container, false);
//        name= view.findViewById(R.id.group3);
//        description= view.findViewById(R.id.group4);
//        address = view.findViewById(R.id.group6);
//        motive= view.findViewById(R.id.group9);
//        btn = view.findViewById(R.id.group10);
//
//        String Sname = name.getText() != null ? name.getText().toString() : "";
//        String Sdesc = description.getText() != null ? description.getText().toString() : "";
//        String Sadd = address.getText() != null ? address.getText().toString() : "";
//        String Smot = motive.getText() != null ? motive.getText().toString() : "";
//        System.out.println(Sname);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getActivity(),ngolist.class);
//                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                intent.putExtra("name",Sname);
//                intent.putExtra("description",Sdesc);
//                intent.putExtra("address",Sadd);
//                intent.putExtra("motive",Smot);
//                startActivity(intent);
//            }
//        });
//        return view;
//
//    }
//}