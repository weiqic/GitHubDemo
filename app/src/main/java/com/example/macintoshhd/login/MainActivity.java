package com.example.macintoshhd.login;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button buttonLogon;
    private TextView textViewMessage;
    private EditText editTextPassword;
    private EditText editTextLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link my objects
        buttonLogon = (Button) findViewById(R.id.buttonLogon);
        textViewMessage = (TextView) findViewById(R.id.textViewMessage);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextLogin = (EditText) findViewById(R.id.editTextLogin);

        //Activate click on my button
        buttonLogon.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if  ((editTextLogin.getText().toString().equals("Ross")) && (editTextPassword.getText().toString().equals("to426")))
            textViewMessage.setText("Login Successful");
        else
            textViewMessage.setText("Login Failed");



    }
}
