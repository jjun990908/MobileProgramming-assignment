package com.cookandroid.a20181620_assignment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class success extends AppCompatActivity {

    int answer;
    int wrong;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16;
    private ImageView img,img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.success);


        answer = (int)(Math.random()*16+1);
        wrong = (int)(Math.random()*16+1);
        img = (ImageView) findViewById(R.id.imageView);
        img2 = (ImageView) findViewById(R.id.imageView2);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btn10 = (Button) findViewById(R.id.button10);
        btn11 = (Button) findViewById(R.id.button11);
        btn12 = (Button) findViewById(R.id.button12);
        btn13 = (Button) findViewById(R.id.button13);
        btn14 = (Button) findViewById(R.id.button14);
        btn15 = (Button) findViewById(R.id.button15);
        btn16 = (Button) findViewById(R.id.button16);

        img.setVisibility(View.INVISIBLE);
        img2.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer == 1){
                    img2.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                if(wrong == 1){
                    img.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                else{
                    btn1.setEnabled(false);
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer == 2){
                    img2.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                if(wrong == 2){
                    img.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                else{
                    btn2.setEnabled(false);
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer == 3){
                    img2.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                if(wrong == 3){
                    img.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                else{
                    btn3.setEnabled(false);
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer == 4){
                    img2.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                if(wrong == 4){
                    img.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                else{
                    btn4.setEnabled(false);
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer == 5){
                    img2.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                if(wrong == 5){
                    img.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                else{
                    btn5.setEnabled(false);
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer == 6){
                    img2.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                if(wrong == 6){
                    img.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                else{
                    btn6.setEnabled(false);
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer == 7){
                    img2.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                if(wrong == 7){
                    img.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                else{
                    btn7.setEnabled(false);
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer == 8){
                    img2.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                if(wrong == 8){
                    img.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                else{
                    btn8.setEnabled(false);
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer == 9){
                    img2.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                if(wrong == 9){
                    img.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                else{
                    btn9.setEnabled(false);
                }
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer == 10){
                    img2.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                if(wrong == 10){
                    img.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                else{
                    btn10.setEnabled(false);
                }
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer == 11){
                    img2.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                if(wrong == 11){
                    img.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                else{
                    btn11.setEnabled(false);
                }
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer == 12){
                    img2.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                if(wrong == 12){
                    img.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                else{
                    btn12.setEnabled(false);
                }
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer == 13){
                    img2.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                if(wrong == 13){
                    img.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                else{
                    btn13.setEnabled(false);
                }
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer == 14){
                    img2.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                if(wrong == 14){
                    img.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                else{
                    btn14.setEnabled(false);
                }
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer == 15){
                    img2.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                if(wrong == 15){
                    img.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                else{
                    btn15.setEnabled(false);
                }
            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer == 16){
                    img2.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                if(wrong == 16){
                    img.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn6.setVisibility(View.INVISIBLE);
                    btn7.setVisibility(View.INVISIBLE);
                    btn8.setVisibility(View.INVISIBLE);
                    btn9.setVisibility(View.INVISIBLE);
                    btn10.setVisibility(View.INVISIBLE);
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                    btn16.setVisibility(View.INVISIBLE);
                }
                else{
                    btn16.setEnabled(false);
                }
            }
        });


    }

}
