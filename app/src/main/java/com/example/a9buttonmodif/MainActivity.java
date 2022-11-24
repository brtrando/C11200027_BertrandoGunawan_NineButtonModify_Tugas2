package com.example.a9buttonmodif;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button b,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private String nama [] = {"Andy","Brandon","Charlie","Devin","Eric","Fiona","George","Helena","Irving",
    "Jonathan","Kayla","Lily","Maria","Nando","Owen","Patrick"};
    int i,i2,i3,i4,i5,i6,i7,i8,i9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b1.setText(nama[0]);
        b2.setText(nama[1]);
        b3.setText(nama[2]);
        b4.setText(nama[3]);
        b5.setText(nama[4]);
        b6.setText(nama[5]);
        b7.setText(nama[6]);
        b8.setText(nama[7]);
        b9.setText(nama[8]);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                i = r.nextInt(16-1)+1;
                i2 = r.nextInt(16-1)+1;
                i3 = r.nextInt(16-1)+1;
                i4 = r.nextInt(16-1)+1;
                i5 = r.nextInt(16-1)+1;
                i6 = r.nextInt(16-1)+1;
                i7 = r.nextInt(16-1)+1;
                i8 = r.nextInt(16-1)+1;
                i9 = r.nextInt(16-1)+1;
                b1.setText(String.valueOf(nama[i]));
                b2.setText(String.valueOf(nama[i2]));
                b3.setText(String.valueOf(nama[i3]));
                b4.setText(String.valueOf(nama[i4]));
                b5.setText(String.valueOf(nama[i5]));
                b6.setText(String.valueOf(nama[i6]));
                b7.setText(String.valueOf(nama[i7]));
                b8.setText(String.valueOf(nama[i8]));
                b9.setText(String.valueOf(nama[i9]));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                i = r.nextInt(16-1)+1;
                i2 = r.nextInt(16-1)+1;
                i3 = r.nextInt(16-1)+1;
                i4 = r.nextInt(16-1)+1;
                i5 = r.nextInt(16-1)+1;
                i6 = r.nextInt(16-1)+1;
                i7 = r.nextInt(16-1)+1;
                i8 = r.nextInt(16-1)+1;
                i9 = r.nextInt(16-1)+1;
                b1.setText(String.valueOf(nama[i]));
                b2.setText(String.valueOf(nama[i2]));
                b3.setText(String.valueOf(nama[i3]));
                b4.setText(String.valueOf(nama[i4]));
                b5.setText(String.valueOf(nama[i5]));
                b6.setText(String.valueOf(nama[i6]));
                b7.setText(String.valueOf(nama[i7]));
                b8.setText(String.valueOf(nama[i8]));
                b9.setText(String.valueOf(nama[i9]));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                i = r.nextInt(16-1)+1;
                i2 = r.nextInt(16-1)+1;
                i3 = r.nextInt(16-1)+1;
                i4 = r.nextInt(16-1)+1;
                i5 = r.nextInt(16-1)+1;
                i6 = r.nextInt(16-1)+1;
                i7 = r.nextInt(16-1)+1;
                i8 = r.nextInt(16-1)+1;
                i9 = r.nextInt(16-1)+1;
                b1.setText(String.valueOf(nama[i]));
                b2.setText(String.valueOf(nama[i2]));
                b3.setText(String.valueOf(nama[i3]));
                b4.setText(String.valueOf(nama[i4]));
                b5.setText(String.valueOf(nama[i5]));
                b6.setText(String.valueOf(nama[i6]));
                b7.setText(String.valueOf(nama[i7]));
                b8.setText(String.valueOf(nama[i8]));
                b9.setText(String.valueOf(nama[i9]));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                i = r.nextInt(16-1)+1;
                i2 = r.nextInt(16-1)+1;
                i3 = r.nextInt(16-1)+1;
                i4 = r.nextInt(16-1)+1;
                i5 = r.nextInt(16-1)+1;
                i6 = r.nextInt(16-1)+1;
                i7 = r.nextInt(16-1)+1;
                i8 = r.nextInt(16-1)+1;
                i9 = r.nextInt(16-1)+1;
                b1.setText(String.valueOf(nama[i]));
                b2.setText(String.valueOf(nama[i2]));
                b3.setText(String.valueOf(nama[i3]));
                b4.setText(String.valueOf(nama[i4]));
                b5.setText(String.valueOf(nama[i5]));
                b6.setText(String.valueOf(nama[i6]));
                b7.setText(String.valueOf(nama[i7]));
                b8.setText(String.valueOf(nama[i8]));
                b9.setText(String.valueOf(nama[i9]));
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                i = r.nextInt(16-1)+1;
                i2 = r.nextInt(16-1)+1;
                i3 = r.nextInt(16-1)+1;
                i4 = r.nextInt(16-1)+1;
                i5 = r.nextInt(16-1)+1;
                i6 = r.nextInt(16-1)+1;
                i7 = r.nextInt(16-1)+1;
                i8 = r.nextInt(16-1)+1;
                i9 = r.nextInt(16-1)+1;
                b1.setText(String.valueOf(nama[i]));
                b2.setText(String.valueOf(nama[i2]));
                b3.setText(String.valueOf(nama[i3]));
                b4.setText(String.valueOf(nama[i4]));
                b5.setText(String.valueOf(nama[i5]));
                b6.setText(String.valueOf(nama[i6]));
                b7.setText(String.valueOf(nama[i7]));
                b8.setText(String.valueOf(nama[i8]));
                b9.setText(String.valueOf(nama[i9]));
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                i = r.nextInt(16-1)+1;
                i2 = r.nextInt(16-1)+1;
                i3 = r.nextInt(16-1)+1;
                i4 = r.nextInt(16-1)+1;
                i5 = r.nextInt(16-1)+1;
                i6 = r.nextInt(16-1)+1;
                i7 = r.nextInt(16-1)+1;
                i8 = r.nextInt(16-1)+1;
                i9 = r.nextInt(16-1)+1;
                b1.setText(String.valueOf(nama[i]));
                b2.setText(String.valueOf(nama[i2]));
                b3.setText(String.valueOf(nama[i3]));
                b4.setText(String.valueOf(nama[i4]));
                b5.setText(String.valueOf(nama[i5]));
                b6.setText(String.valueOf(nama[i6]));
                b7.setText(String.valueOf(nama[i7]));
                b8.setText(String.valueOf(nama[i8]));
                b9.setText(String.valueOf(nama[i9]));
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                i = r.nextInt(16-1)+1;
                i2 = r.nextInt(16-1)+1;
                i3 = r.nextInt(16-1)+1;
                i4 = r.nextInt(16-1)+1;
                i5 = r.nextInt(16-1)+1;
                i6 = r.nextInt(16-1)+1;
                i7 = r.nextInt(16-1)+1;
                i8 = r.nextInt(16-1)+1;
                i9 = r.nextInt(16-1)+1;
                b1.setText(String.valueOf(nama[i]));
                b2.setText(String.valueOf(nama[i2]));
                b3.setText(String.valueOf(nama[i3]));
                b4.setText(String.valueOf(nama[i4]));
                b5.setText(String.valueOf(nama[i5]));
                b6.setText(String.valueOf(nama[i6]));
                b7.setText(String.valueOf(nama[i7]));
                b8.setText(String.valueOf(nama[i8]));
                b9.setText(String.valueOf(nama[i9]));
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                i = r.nextInt(16-1)+1;
                i2 = r.nextInt(16-1)+1;
                i3 = r.nextInt(16-1)+1;
                i4 = r.nextInt(16-1)+1;
                i5 = r.nextInt(16-1)+1;
                i6 = r.nextInt(16-1)+1;
                i7 = r.nextInt(16-1)+1;
                i8 = r.nextInt(16-1)+1;
                i9 = r.nextInt(16-1)+1;
                b1.setText(String.valueOf(nama[i]));
                b2.setText(String.valueOf(nama[i2]));
                b3.setText(String.valueOf(nama[i3]));
                b4.setText(String.valueOf(nama[i4]));
                b5.setText(String.valueOf(nama[i5]));
                b6.setText(String.valueOf(nama[i6]));
                b7.setText(String.valueOf(nama[i7]));
                b8.setText(String.valueOf(nama[i8]));
                b9.setText(String.valueOf(nama[i9]));
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                i = r.nextInt(16-1)+1;
                i2 = r.nextInt(16-1)+1;
                i3 = r.nextInt(16-1)+1;
                i4 = r.nextInt(16-1)+1;
                i5 = r.nextInt(16-1)+1;
                i6 = r.nextInt(16-1)+1;
                i7 = r.nextInt(16-1)+1;
                i8 = r.nextInt(16-1)+1;
                i9 = r.nextInt(16-1)+1;
                b1.setText(String.valueOf(nama[i]));
                b2.setText(String.valueOf(nama[i2]));
                b3.setText(String.valueOf(nama[i3]));
                b4.setText(String.valueOf(nama[i4]));
                b5.setText(String.valueOf(nama[i5]));
                b6.setText(String.valueOf(nama[i6]));
                b7.setText(String.valueOf(nama[i7]));
                b8.setText(String.valueOf(nama[i8]));
                b9.setText(String.valueOf(nama[i9]));
            }
        });
    }
}