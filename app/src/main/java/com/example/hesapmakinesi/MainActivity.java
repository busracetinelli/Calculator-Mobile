package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText gecmis,giris;
Button topla,cikar,carp,bol,esit,temizle,c;
double sayi1,sayi2,sonuc;
String islem="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gecmis=findViewById(R.id.gecmis);
        giris=findViewById(R.id.giris);

        topla=findViewById(R.id.topla);
        cikar=findViewById(R.id.cikar);
        carp=findViewById(R.id.carp);
        bol=findViewById(R.id.bol);
        esit=findViewById(R.id.esit);
        temizle=findViewById(R.id.temizle);
        c=findViewById(R.id.C);

        topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi1=Double.parseDouble(giris.getText().toString());
                islem="+";
                giris.setText("");
            }
        });

        cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi1=Double.parseDouble(giris.getText().toString());
                islem="-";
                giris.setText("");
            }
        });

        carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi1=Double.parseDouble(giris.getText().toString());
                islem="x";
                giris.setText("");
            }
        });

        bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi1=Double.parseDouble(giris.getText().toString());
                islem="/";
                giris.setText("");
            }
        });

        esit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi2= Integer.parseInt(giris.getText().toString());

                switch (islem)
                {
                    case "+":
                        sonuc=sayi1+sayi2;
                        break;

                    case "-":
                        sonuc=sayi1-sayi2;
                        break;
                    case "x":
                        sonuc=sayi1*sayi2;
                        break;
                    case "/":
                        sonuc=sayi1/sayi2;
                        break;

                }
                giris.setText(""+sonuc);
                gecmis.setText(sayi1+" "+islem+" "+sayi2+" = "+sonuc+"\n"+gecmis.getText().toString());

            }
        });
        temizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gecmis.setText("");
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                giris.setText("");
            }
        });
    }
}