package com.example.listgrid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<list> list;

    public Adapter(List<com.example.listgrid.list> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.data, null);
        ViewHolder vh = new ViewHolder (view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        list item = list.get(position);
        holder.judul.setText(item.getJudul());
        holder.subjudul.setText(item.getSubjudul());
        Glide.with(holder.imageView.getContext()).load(item.getImage()).into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView judul, subjudul;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.item_image);
            judul = itemView.findViewById(R.id.title);
            subjudul = itemView.findViewById(R.id.sub_title);
        }
    }
}
