package com.example.appquanlysinhvien.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.appquanlysinhvien.R;

public class MainActivity extends AppCompatActivity {

    EditText edtTen,edtLop,edtDiachi;
    Button btnHuy,btnThem;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapview();
        // Recyclerview :
//            * Hiển thị
//                + Tên sinh viên
//                + Lớp
//                + Địa chỉ
//           * Chức năng
//                + Button cho xóa sinh viên
    }

    private void mapview() {
        edtTen = findViewById(R.id.edittextTen);
        edtDiachi = findViewById(R.id.edittextDiachi);
        edtLop = findViewById(R.id.edittextLop);
        btnHuy = findViewById(R.id.buttonCancel);
        btnThem = findViewById(R.id.buttonAdd);
        recyclerView = findViewById(R.id.recyclerviewSinhvien);
    }
}