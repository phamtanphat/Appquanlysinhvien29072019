package com.example.appquanlysinhvien.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appquanlysinhvien.R;
import com.example.appquanlysinhvien.model.Sinhvien;

import java.util.ArrayList;
import java.util.Collections;

public class SinhvienAdapter extends RecyclerView.Adapter<SinhvienAdapter.Holder> {

    private ArrayList<Sinhvien> msinhviens;

    public SinhvienAdapter(ArrayList<Sinhvien> msinhviens) {
        this.msinhviens = msinhviens;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_sinhvien, null);
        return new Holder(view);
    }

    @Deprecated
    public void addSinhvien(@NonNull Sinhvien sinhvien) {
        msinhviens.add(sinhvien);
        notifyDataSetChanged();
    }
    public void addSinhvien2(@NonNull Sinhvien sinhvien) {
        msinhviens.add(sinhvien);
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        Sinhvien sinhvien = msinhviens.get(position);
        holder.txtTen.setText("Tên : " + sinhvien.getTen());
        holder.txtLop.setText("Lớp : " + sinhvien.getLop());
        holder.txtDiachi.setText("Địa chỉ : " + sinhvien.getDiachi());
    }

    @Override
    public int getItemCount() {
        return msinhviens != null ? msinhviens.size() : 0;
    }

    class Holder extends RecyclerView.ViewHolder {
        TextView txtTen, txtLop, txtDiachi;
        Button btnXoa;

        public Holder(@NonNull final View itemView) {
            super(itemView);
            txtDiachi = itemView.findViewById(R.id.textviewDiachi);
            txtTen = itemView.findViewById(R.id.textviewTen);
            txtLop = itemView.findViewById(R.id.textviewLop);
            btnXoa = itemView.findViewById(R.id.buttonXoa);
            btnXoa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    msinhviens.remove(getLayoutPosition());
                    notifyDataSetChanged();
                }
            });
        }
    }
}
