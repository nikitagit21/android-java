package com.febri.tugas;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListWisataAdapter extends RecyclerView.Adapter<ListWisataAdapter.ListViewHolder>{
private ArrayList<Wisata>listwisata;
    private int position;

    public ListWisataAdapter(ArrayList<Wisata>list){
    this.listwisata=list;
}
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_wisata, viewGroup, false);
        return  new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
    final Wisata wis=listwisata.get(position);
        Glide.with(holder.itemView.getContext())
                .load(wis.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imggambar);
        holder.tvnama.setText(wis.getNama());
        holder.tvdetail.setText(wis.getDetai());
        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.itemView.getContext().startActivity(new Intent(holder.itemView.getContext(), DetailActivity.class).putExtra("nama", wis.getNama()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listwisata.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvnama, tvdetail;
        ImageView imggambar;
        CardView btnDetail;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imggambar=itemView.findViewById(R.id.img_item_photo);
            tvnama=itemView.findViewById(R.id.tv_item_name);
            tvdetail=itemView.findViewById(R.id.tv_item_detail);
            btnDetail=itemView.findViewById(R.id.cardview);
        }
    }
}
