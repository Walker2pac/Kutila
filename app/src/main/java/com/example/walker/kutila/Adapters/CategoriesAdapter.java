package com.example.walker.kutila.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.walker.kutila.Entities.Category;
import com.example.walker.kutila.R;

import java.util.List;

/**
 * Created by walker on 18.11.2017.
 */

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.MyViewHolder>{

    private Context mContext;
    private List<Category> categoryList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView titleRu, titleEng;
        public ImageView thumbnail;

        public MyViewHolder(View view) {
            super(view);
            titleRu = (TextView) view.findViewById(R.id.titleRu);
            titleEng = (TextView) view.findViewById(R.id.titleEng);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
        }
    }


    public CategoriesAdapter(Context mContext, List<Category> categoryList) {
        this.mContext = mContext;
        this.categoryList = categoryList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_view, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Category category = categoryList.get(position);
        holder.titleRu.setText(category.getTitleRu());
        holder.titleEng.setText(category.getTitleEng());

        // loading thumbnail using Glide library
        Glide.with(mContext).load(category.getThumbnail()).into(holder.thumbnail);
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }
}
