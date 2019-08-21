package com.example.appquanlysinhvien.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appquanlysinhvien.R;

public class SinhvienAdapter extends RecyclerView.Adapter<SinhvienAdapter.Holder> {

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class Holder extends RecyclerView.ViewHolder{
        TextView txtTen,txtLop,txtDiachi;
        Button btnXoa;
        public Holder(@NonNull View itemView) {
            super(itemView);
            txtDiachi = itemView.findViewById(R.id.textviewDiachi);
            txtTen = itemView.findViewById(R.id.textviewTen);
            txtLop = itemView.findViewById(R.id.textviewLop);
            btnXoa = itemView.findViewById(R.id.buttonXoa);
        }
    }
}
