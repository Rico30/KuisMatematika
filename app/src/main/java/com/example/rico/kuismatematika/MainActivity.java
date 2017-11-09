package com.example.rico.kuismatematika;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

import static java.lang.Math.random;

public class MainActivity extends AppCompatActivity {

    double ang1;
    double ang2;
    int op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnSB(View view) {
        EditText ed1 = (EditText)findViewById(R.id.edit1);
        EditText ed2 = (EditText)findViewById(R.id.edit2);
        EditText ed3 = (EditText)findViewById(R.id.editOpr);

        String[] arr = {"+", "-", "/", "*"};

        int rdm1;
        int rdm2;
        int rdm3;
        rdm1 = (int)(Math.random()*100+1);
        rdm2 = (int)(Math.random()*100+1);
        rdm3 = (int)(Math.random()*4);
        String e1 = String.valueOf(rdm1);
        String e2 = String.valueOf(rdm2);

        ed1.setText(e1);
        ed2.setText(e2);
        ed3.setText(arr[rdm3]);

        ang1 = rdm1;
        ang2 = rdm2;
        op = rdm3;
    }

    public void btnCJ(View view) {
        EditText inpJwb = (EditText)findViewById(R.id.inpJawab);
        TextView txtHasil = (TextView)findViewById(R.id.txtHasil);
        TextView jwbB = (TextView)findViewById(R.id.jBenar);
        TextView jwbS = (TextView)findViewById(R.id.jSalah);

        String Jwb = inpJwb.getText().toString();
        int ang3 = Integer.parseInt(Jwb);
        String in = String.valueOf(ang3);
        String[] bs = {"Jawaban Anda Benar", "Jawaban Anda Salah"};
        int rdm4;
        rdm4 = (int)(Math.random()*100);
        String e3 = String.valueOf(rdm4);

        if (op==0) {
            double hasil = ang1+ang2;
            String hsl = String.valueOf(hasil);

            if(ang3==hasil) {
                txtHasil.setText(bs[0]);
                jwbB.setText(hsl);
                jwbS.setText(e3);
            }
            else {
                txtHasil.setText(bs[1]);
                jwbB.setText(hsl);
                jwbS.setText(in);
            }
        }

        else if (op==1) {
            double hasil = ang1-ang2;
            String hsl = String.valueOf(hasil);

            if(ang3==hasil) {
                txtHasil.setText(bs[0]);
                jwbB.setText(hsl);
                jwbS.setText(e3);
            }
            else {
                txtHasil.setText(bs[1]);
                jwbB.setText(hsl);
                jwbS.setText(in);
            }
        }

        else if (op==2) {
            double hasil = ang1/ang2;
            String hsl = String.valueOf(hasil);

            if(ang3==hasil) {
                txtHasil.setText(bs[0]);
                jwbB.setText(hsl);
                jwbS.setText(e3);
            }
            else {
                txtHasil.setText(bs[1]);
                jwbB.setText(hsl);
                jwbS.setText(in);
            }
        }

        else if (op==3) {
            double hasil = ang1*ang2;
            String hsl = String.valueOf(hasil);

            if(ang3==hasil) {
                txtHasil.setText(bs[0]);
                jwbB.setText(hsl);
                jwbS.setText(e3);
            }
            else {
                txtHasil.setText(bs[1]);
                jwbB.setText(hsl);
                jwbS.setText(in);
            }
        }
    }
}
