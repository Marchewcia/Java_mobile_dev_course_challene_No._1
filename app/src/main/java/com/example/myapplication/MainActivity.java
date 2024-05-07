package com.example.myapplication;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayData(View view) {
        EditText fName = findViewById(R.id.firstName);
        EditText lName = findViewById(R.id.lastName);
        EditText email = findViewById(R.id.email);
        TextView fNameShow = findViewById(R.id.firstNameShow);
        TextView lNameShow = findViewById(R.id.lastNameShow);
        TextView emailShow = findViewById(R.id.emailShow);
        fNameShow.setText("First Name: " + fName.getText().toString());
        lNameShow.setText("Last Name: " + lName.getText().toString());
        emailShow.setText("Email: " + email.getText().toString());
    }
}
