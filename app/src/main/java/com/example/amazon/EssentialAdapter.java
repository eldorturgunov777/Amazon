package com.example.amazon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Eldor Turgunov on 24.05.2022.
 * Amazon
 * eldorturgunov777@gmail.com
 */
public class EssentialAdapter extends RecyclerView.Adapter<EssentialAdapter.EssentialViewHolder> {
    Context context;
    ArrayList<Essential> items = new ArrayList<Essential>();

    public EssentialAdapter(Context context, ArrayList<Essential> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public EssentialViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_feed_essential, parent, false);
        return new EssentialViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EssentialViewHolder holder, int position) {
        Essential data = items.get(position);
        holder.iv_image.setImageResource(data.getImg());
        holder.tv_title.setText(data.getTitle());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class EssentialViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_image;
        TextView tv_title;

        public EssentialViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_image = itemView.findViewById(R.id.iv_image);
            tv_title = itemView.findViewById(R.id.tv_title);
        }
    }
}
