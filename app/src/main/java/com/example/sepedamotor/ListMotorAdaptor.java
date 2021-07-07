package com.example.sepedamotor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListMotorAdaptor extends RecyclerView.Adapter<ListMotorAdaptor.ListViewHolder> {
    private ArrayList<Motor> listMotor;

    private OnItemClickCallback onItemClickCallback ;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }


    public ListMotorAdaptor(ArrayList<Motor> list){
        this.listMotor = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_motor, parent, false);
        return new ListViewHolder(view)  ;
    }

    @Override
    public void onBindViewHolder(@NonNull ListMotorAdaptor.ListViewHolder holder, int position) {
        Motor motor = listMotor.get(position);
        Glide.with(holder.itemView.getContext())
                .load(motor.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);

        holder.tvName.setText(motor.getName());
        holder.tvHarga.setText(motor.getHarga());
        holder.tvDetail.setText(motor.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listMotor.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMotor.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
        TextView tvHarga;
        TextView tvDetail;

        ListViewHolder(View itemview) {
            super(itemview);
            imgPhoto = itemview.findViewById(R.id.item_row_motor);
            tvName = itemview.findViewById(R.id.tv_item_name);
            tvHarga = itemview.findViewById(R.id.tv_item_harga);
            tvDetail = itemview.findViewById(R.id.tv_item_detail);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Motor motor);
    }
}
