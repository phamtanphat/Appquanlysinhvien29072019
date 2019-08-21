package com.example.appquanlysinhvien.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.appquanlysinhvien.R;
import com.example.appquanlysinhvien.adapter.SinhvienAdapter;
import com.example.appquanlysinhvien.model.Sinhvien;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText edtTen,edtLop,edtDiachi;
    Button btnHuy,btnThem;
    RecyclerView recyclerView;
    SinhvienAdapter sinhvienAdapter;
    ArrayList<Sinhvien> msinhviens;
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
        init();
    }

    private void init() {
        msinhviens = new ArrayList<>();
        sinhvienAdapter = new SinhvienAdapter(msinhviens);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(sinhvienAdapter);
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
