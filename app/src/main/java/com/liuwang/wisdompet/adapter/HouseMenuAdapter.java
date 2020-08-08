package com.liuwang.wisdompet.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.liuwang.wisdompet.R;

public class HouseMenuAdapter extends RecyclerView.Adapter<HouseMenuViewHolder> {

    @NonNull
    @Override
    public HouseMenuViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull HouseMenuViewHolder houseMenuViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

class HouseMenuViewHolder extends RecyclerView.ViewHolder {
    public ImageView mImgMenuIcon;
    public TextView mTxtMenuName;

    public HouseMenuViewHolder(View itemView) {
        super(itemView);
//        mImgMenuIcon= (ImageView) itemView.findViewById(R.id.img_menu_icon_find);
//        mTxtMenuName= (TextView) itemView.findViewById(R.id.txt_menu_name_find);

    }
}
