package com.example.resume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.nio.charset.StandardCharsets;

public class SecondaryActivity extends AppCompatActivity {

    TextView name,dob,father,address,status,hobbies,language,religion,nation,email,contact,sex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        name=findViewById(R.id.name);
        dob=findViewById(R.id.dob);
        father=findViewById(R.id.father);
        address=findViewById(R.id.address);
        status=findViewById(R.id.status);
        hobbies=findViewById(R.id.hobbies);
        language=findViewById(R.id.language);
        religion=findViewById(R.id.religion);
        nation=findViewById(R.id.nation);
        email=findViewById(R.id.email);
        contact=findViewById(R.id.contact);
        sex=findViewById(R.id.sex);


        String Name = getIntent().getStringExtra("name");
        String Dob = getIntent().getStringExtra("dob");
        String Father = getIntent().getStringExtra("father");
        String Sex = getIntent().getStringExtra("sex");
        String Address = getIntent().getStringExtra("address");
        String Contact = getIntent().getStringExtra("contact");
        String Nation = getIntent().getStringExtra("nation");
        String Religion = getIntent().getStringExtra("religion");
        String Status = getIntent().getStringExtra("status");
        String Language = getIntent().getStringExtra("language");
        String Hobbies = getIntent().getStringExtra("hobbies");
        String Email = getIntent().getStringExtra("email");



        name.setText(""+Name);
        dob.setText(""+Dob);
        father.setText(""+Father);
        sex.setText(""+Sex);
        address.setText(""+Address);
        contact.setText(""+Contact);
        nation.setText(""+Nation);
        email.setText(""+Email);
        religion.setText(""+Religion);
        status.setText(""+Status);
        language.setText(""+Language);
        hobbies.setText(""+Hobbies);


    }
}