package com.vogella.android.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CreateUserActivity extends AppCompatActivity {

    boolean male = true;
    String gender = "male";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);
        final RadioGroup radioGroup = findViewById(R.id.gender);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group,int checkedId){
                switch (checkedId) {
                    case R.id.male:
                        male = true;
                        break;
                    case R.id.female:
                        male = false;
                        break;
                }
            }
        });
    }

    public void onClick(View view) {
        EditText input = findViewById(R.id.username);
        String string = input.getText().toString();
        if (!male) {
            gender = "female";
        }

        Toast.makeText(this, "User " + string + " created. \nGender is " + gender + ".", Toast.LENGTH_LONG).show();
    }
}

