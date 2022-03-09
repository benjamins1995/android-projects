package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    static int count = 0;


    public void loginAccess(View view) {
        TextView myTextView = findViewById(R.id.myTextView);
        TextView myTextView2 = findViewById(R.id.myTextView2);
        TextView myTextView3 = findViewById(R.id.myTextView3);
        EditText myEditText1 = findViewById(R.id.myEditText1);
        EditText myEditText2 = findViewById(R.id.myEditText2);
        int cout =0;

        if (myEditText1.getText().toString().isEmpty())
            Toast.makeText(MainActivity.this, "Please Enter a email Address", Toast.LENGTH_LONG).show();
        if (myEditText2.getText().toString().isEmpty())
            Toast.makeText(MainActivity.this, "Please Enter Password ", Toast.LENGTH_LONG).show();

        String email = myEditText1.getText().toString();
        String password = myEditText2.getText().toString();


        String backFromOne = myEditText1(email);
        if (backFromOne.equals("Email Succeeded")) {
            myTextView2.setTextColor(Color.GREEN);
           cout++;

        }else
            myTextView2.setTextColor(Color.RED);


        String backFromTwo = myEditText2(password);
        if (backFromTwo.equals("Password Succeeded")) {
            myTextView3.setTextColor(Color.GREEN);
            cout++;

        }else
            myTextView3.setTextColor(Color.RED);

        String myTextViewSS = (cout == 2) ? "Login Successfull" : "Login failed";

        if (myTextViewSS.equals("Login Successfull")) {
            myTextView.setText(myTextViewSS);
            myTextView.animate().scaleX(2).scaleY(2).setDuration(5000);
        }else
            myTextView.setText(myTextViewSS);


    }


    public String myEditText1(String email) {
        TextView myTextView = findViewById(R.id.myTextView);
        String equal = email.equals("benjaminsaadon@gmail.com") ? "Email Succeeded" : "Email failed";

        if (equal.equals("Email Succeeded")) {
            Toast.makeText(MainActivity.this, equal, Toast.LENGTH_SHORT).show();
            return equal;
        } else
            Toast.makeText(MainActivity.this, equal, Toast.LENGTH_SHORT).show();
        return equal;
    }



    public String myEditText2(String password) {

        TextView myTextView = findViewById(R.id.myTextView);
        String equal = password.equals("123") ? "Password Succeeded" : "Password failed";

        if (equal.equals("Password Succeeded")) {
            Toast.makeText(MainActivity.this, equal, Toast.LENGTH_SHORT).show();
            return equal;
        } else
            Toast.makeText(MainActivity.this, equal, Toast.LENGTH_SHORT).show();
        return equal;
    }

}



