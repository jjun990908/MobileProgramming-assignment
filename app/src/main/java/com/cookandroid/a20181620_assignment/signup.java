package com.cookandroid.a20181620_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.cookandroid.a20181620_assignment.MainActivity.listid;
import static com.cookandroid.a20181620_assignment.MainActivity.listpassword;

public class signup extends AppCompatActivity {

    private EditText editPassword, editId, editName, editPhone, editAddress;
    private String inPassword, yesorno;
    private Button btnCheckPassword, btnDone, btnCheckId;
    private RadioGroup rg;
    private RadioButton rb;
    boolean passwordOk = false;
    boolean idOk = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        setTitle("회원가입");

        editId = (EditText) findViewById(R.id.editTextId2);
        editPassword = (EditText) findViewById(R.id.editTextPassword2);
        editName = (EditText) findViewById(R.id.editTextName);
        editPhone = (EditText) findViewById(R.id.editTextPhone);
        editAddress = (EditText) findViewById(R.id.editTextAddress);
        btnCheckId = (Button) findViewById(R.id.btnCheckId);
        btnCheckPassword = (Button) findViewById(R.id.btnCheckPassword);
        btnDone = (Button) findViewById((R.id.btnDone));
        rg = (RadioGroup) findViewById(R.id.rg);

        btnCheckPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signup.this, signup.class);
                intent.putExtra("password",editPassword.getText().toString());
                inPassword = intent.getStringExtra("password");
                if (inPassword.length()>=8){
                    Toast.makeText(signup.this, "비밀번호로 적합합니다.", Toast.LENGTH_SHORT).show();
                    passwordOk = true;
                }
                else if(inPassword.length()<8){
                    Toast.makeText(signup.this, "비밀번호가 너무 짧습니다.", Toast.LENGTH_SHORT).show();
                    passwordOk = false;
                }
            }
        });

        btnCheckId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0; i<listid.size();i++){
                    if(editId.getText().toString().equals(listid.get(i))){
                        Toast.makeText(signup.this, "아이디가 이미 존재합니다.", Toast.LENGTH_SHORT).show();
                        idOk = false;
                    }
                    else{
                        Toast.makeText(signup.this, "아이디로 만들 수 있습니다.", Toast.LENGTH_SHORT).show();
                        idOk = true;
                    }
                }
                editId.getText().toString();
            }
        });



        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = rg.getCheckedRadioButtonId();
                rb = (RadioButton) findViewById(id);
                if(editId.getText().toString().length()==0){
                    Toast.makeText(signup.this, "아이디를 입력하세요!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!idOk){
                    Toast.makeText(signup.this, "아이디 중복 확인을 해주세요!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(editPassword.getText().toString().length()==0){
                    Toast.makeText(signup.this, "비밀번호를 입력하세요!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!passwordOk){
                    Toast.makeText(signup.this, "비밀번호 규칙 확인을 해주세요!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(editName.getText().toString().length()==0){
                    Toast.makeText(signup.this, "이름을 입력하세요!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(editPhone.getText().toString().length()==0){
                    Toast.makeText(signup.this, "전화번호를 입력하세요!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(editAddress.getText().toString().length()==0){
                    Toast.makeText(signup.this, "주소를 입력하세요!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(rb.getText().toString().equals("아니오")){
                    Toast.makeText(signup.this, "약관에 동의해 주세요!", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if(rb.getText().toString().equals("예")){
                    Toast.makeText(signup.this, "회원가입 성공!", Toast.LENGTH_SHORT).show();
                    listid.add(editId.getText().toString());
                    listpassword.add(editPassword.getText().toString());
                    finish();
                    return;
                }
            }
        });
    }
}
