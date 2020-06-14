package com.apphut.styleinput;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.erselankhan.styleinputedittext.StyleInputEditText;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    Button button;
    StyleInputEditText emailEditText, passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setListener();
    }

    private void initView() {
        button = findViewById(R.id.signIn);
        emailEditText = findViewById(R.id.email_address);
        passwordEditText = findViewById(R.id.password);
    }

    private void setListener() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getEditText().getText().toString();
                if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    emailEditText.setError(true);
                    emailEditText.getEditText().setError("Email address not correct .", null);
                } else {
                    emailEditText.setError(false);
                }
            }
        });
    }
}
