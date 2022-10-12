package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText n1,n2,res;
Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=(EditText)findViewById(R.id.n1);
        n2=(EditText)findViewById(R.id.n2);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);

    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
          int nu1,nu2,sum;
          EditText res=(EditText) findViewById(R.id.res);
          nu1=Integer.parseInt(n1.getText().toString());
          nu2=Integer.parseInt(n2.getText().toString());
          sum=nu1+nu2;
          res.setText(Integer.toString(sum));
        }
    });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nu1,nu2,sum;
                EditText res=(EditText) findViewById(R.id.res);
                nu1=Integer.parseInt(n1.getText().toString());
                nu2=Integer.parseInt(n2.getText().toString());
                sum=nu1-nu2;
                res.setText(Integer.toString(sum));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nu1,nu2,sum;
                EditText res=(EditText) findViewById(R.id.res);
                nu1=Integer.parseInt(n1.getText().toString());
                nu2=Integer.parseInt(n2.getText().toString());
                sum=nu1*nu2;
                res.setText(Integer.toString(sum));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nu1,nu2,sum;
                EditText res=(EditText) findViewById(R.id.res);
                nu1=Integer.parseInt(n1.getText().toString());
                nu2=Integer.parseInt(n2.getText().toString());
                sum=nu1/nu2;
                res.setText(Integer.toString(sum));
            }
        });


    }
}
