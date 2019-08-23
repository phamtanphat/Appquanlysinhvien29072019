package com.example.appquanlysinhvien.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
        event();
    }

    private void event() {
        btnHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtLop.setText("");
                edtTen.setText("");
                edtDiachi.setText("");
            }
        });
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ten = edtTen.getText().toString().trim();
                String lop = edtLop.getText().toString().trim();
                String diachi = edtDiachi.getText().toString().trim();

                if (ten.length() <= 0 || lop.length() <= 0 || diachi.length()<= 0){
                    Toast.makeText(MainActivity.this, "Bạn nhập thiếu thông tin", Toast.LENGTH_SHORT).show();
                    return;
                }
                sinhvienAdapter.addSinhvien(new Sinhvien(ten,lop,diachi));

            }
        });
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
