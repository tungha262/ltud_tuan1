package com.example.myapplication.tuan1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.R;

public class Tuan1MainActivity extends AppCompatActivity {
    EditText txt1, txt2;

    Button bt1;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tuan1_main);
        txt1 = findViewById(R.id.demo1);
        txt2 = findViewById(R.id.demo2);
        bt1 = findViewById(R.id.demo3);
        tv1 = findViewById(R.id.demo4);
        bt1.setOnClickListener(v->{
            //goi ham tinh tong
            tinhTong();
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    // dinh nghia ham tinh tong
    private void tinhTong() {
        // lay du lieu nhap vao tu Edittex1
        String str1 = txt1.getText().toString();
        float so1 = Float.parseFloat(str1); // chuyen du lieu sang so
        String str2 = txt2.getText().toString();
        float so2 = Float.parseFloat(str2);
        float tong = so1+so2;

        tv1.setText(String.valueOf(tong));
    }
}