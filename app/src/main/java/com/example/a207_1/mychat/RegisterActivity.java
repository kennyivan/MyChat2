package com.example.a207_1.mychat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {


    User user;
    EditText et_nama,et_email,et_telepon;
    Button bt_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        et_nama = (EditText) findViewById(R.id.et_nama);
        et_email = (EditText) findViewById(R.id.et_email);
        et_telepon = (EditText) findViewById(R.id.et_telepon);
        bt_register = (Button) findViewById(R.id.bt_register);

        bt_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user = new User();
                user.setNama(et_nama.getText().toString());
                user.setTelepon(et_telepon.getText().toString());
                user.setEmail(et_email.getText().toString());
                user.register();
            }
        });
    }
}
