package com.cookandroid.a20181620_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List listid = new ArrayList();
    public static List listpassword = new ArrayList();
    private Button btnLogin, btnSignUp;
    private EditText inputId, inputPassword;
    private String id, password;
    private boolean idcheck = false;
    private boolean passwordcheck = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("20181620");

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnSignUp = (Button) findViewById(R.id.btnSignUp);
        inputId = (EditText) findViewById(R.id.editTextId1);
        inputPassword = (EditText) findViewById(R.id.editTextPassword1);

        listid.add("abc");
        listpassword.add("12345678");
        btnSignUp.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), signup.class);
                startActivity(intent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = inputId.getText().toString();
                password = inputPassword.getText().toString();

                if(inputId.getText().toString().length()==0){
                    Toast.makeText(MainActivity.this, "아이디를 입력하세요!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(inputPassword.getText().toString().length()==0){
                    Toast.makeText(MainActivity.this, "비밀번호를 입력하세요!", Toast.LENGTH_SHORT).show();
                    return;
                }

                for (int i=0;i< listid.size();i++){
                    if(id.equals(listid.get(i))){
                        idcheck = true;
                        if(password.equals(listpassword.get(i))){
                            passwordcheck = true;
                        }
                        break;
                    }
                    idcheck = false;
                    passwordcheck = false;
                }

                if(idcheck && passwordcheck){
                    Intent intent = new Intent(getApplicationContext(), success.class);
                    startActivity(intent);
                }
                else if(!idcheck||!passwordcheck) {
                    Toast.makeText(MainActivity.this, "아이디 및 비밀번호가 없거나 틀립니다!", Toast.LENGTH_SHORT).show();
                    return;
                }


            }
        });
    }

}
