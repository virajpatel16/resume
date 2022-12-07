package com.example.resume;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText
   edt_name,edt_dob,edt_father,edt_sex,edt_address,edt_email,edt_contact,edt_nation,edt_religion,edt_status,edt_language,edt_hobbies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn =findViewById(R.id.btn);
        edt_name=findViewById(R.id.edt_name);
        edt_dob=findViewById(R.id.edt_dob);
        edt_father=findViewById(R.id.edt_father);
        edt_sex=findViewById(R.id.edt_sex);
        edt_address=findViewById(R.id.edt_address);
        edt_email=findViewById(R.id.edt_email);
        edt_contact=findViewById(R.id.edt_contact);
        edt_nation=findViewById(R.id.edt_nation);
        edt_religion=findViewById(R.id.edt_religion);
        edt_status=findViewById(R.id.edt_status);
        edt_language=findViewById(R.id.edt_language);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=edt_name.getText().toString();
                String dob=edt_dob.getText().toString();
                String father=edt_father.getText().toString();
                String sex=edt_sex.getText().toString();
                String address=edt_address.getText().toString();
                String email=edt_email.getText().toString();
                String contact=edt_contact.getText().toString();
                String nation=edt_nation.getText().toString();
                String religion=edt_religion.getText().toString();
                String status=edt_status.getText().toString();
                String language=edt_language.getText().toString();


                Intent intent = new Intent(MainActivity.this,SecondaryActivity.class);
                intent.putExtra("name",name);
                intent.putExtra("dob",dob);
                intent.putExtra("father",father);
                intent.putExtra("sex",sex);
                intent.putExtra("address",address);
                intent.putExtra("email",email);
                intent.putExtra("contact",contact);
                intent.putExtra("nation",nation);
                intent.putExtra("religion",religion);
                intent.putExtra("status",status);
                intent.putExtra("language",language);
                startActivity(intent);

            }
        });
    }
}