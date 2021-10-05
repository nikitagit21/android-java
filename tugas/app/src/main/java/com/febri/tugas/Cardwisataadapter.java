package com.febri.tugas;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class Cardwisataadapter extends RecyclerView.Adapter<Cardwisataadapter.CardViewHolder> {
   private ArrayList<Wisata>listwisata;
   public Cardwisataadapter(ArrayList<Wisata>list){
       this.listwisata=list;
   }
    @NonNull
    @Override
    public Cardwisataadapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card_wisata, viewGroup, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final Cardwisataadapter.CardViewHolder holder, int position) {
    final Wisata wis=listwisata.get(position);
            Glide.with(holder.itemView.getContext())
                    .load(wis.getPhoto())
                    .apply(new RequestOptions().override(350,550))
                    .into(holder.imggambar);
            holder.tvNama.setText((wis.getNama()));
            holder.tvdetail.setText(wis.getDetai());

            holder.btn_detail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(holder.itemView.getContext(),"Detail "+listwisata.get(holder.getAdapterPosition()).getNama(),Toast.LENGTH_SHORT).show();
                    holder.itemView.getContext().startActivity(new Intent(holder.itemView.getContext(), DetailActivity.class)
                            .putExtra("nama", wis.getNama())
                            .putExtra("deskripsi", wis.getDetai())
                            .putExtra("gambar", wis.getPhoto()));

                }
            });

    }

    @Override
    public int getItemCount() {
        return listwisata.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder{
        public ImageView imggambar;
        TextView tvNama,tvdetail;
        CardView btn_detail;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imggambar=itemView.findViewById(R.id.img_item_foto);
            tvNama=itemView.findViewById(R.id.tv_item_name);
            tvdetail=itemView.findViewById(R.id.tv_item_detail);
            btn_detail=itemView.findViewById(R.id.cardview);
        }
    }
}
