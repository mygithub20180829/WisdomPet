package com.liuwang.wisdompet.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.liuwang.wisdompet.R;

import java.util.List;
import java.util.Map;

/**
 * Created by liuwang on 2019/8/5.
 */

public class FindListViewAdapter extends BaseAdapter {
    protected Context context;
    protected LayoutInflater inflater;
    protected List<Map<String, Object>> list;


    public FindListViewAdapter(Context context, List<Map<String, Object>> list){
        this.context=context;
        this.list=list;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        View view;
        if (convertView == null) {
            view = inflater.inflate(R.layout.find_listview, null);
            holder = new ViewHolder();

            holder.house_turtle= (TextView) view.findViewById(R.id.house_turtle);
            holder.house_turtle_where= (TextView) view.findViewById(R.id.house_turtle_where);
            holder.house_turtle_scan= (TextView) view.findViewById(R.id.house_turtle_scan);
            holder.house_turtle_zan= (TextView) view.findViewById(R.id.house_turtle_zan);

            holder.house_dog= (TextView) view.findViewById(R.id.house_dog);
            holder.house_dog_where= (TextView) view.findViewById(R.id.house_dog_where);
            holder.house_dog_scan= (TextView) view.findViewById(R.id.house_dog_scan);
            holder.house_dog_zan= (TextView) view.findViewById(R.id.house_dog_zan);

            holder.house_dogs= (TextView) view.findViewById(R.id.house_dogs);
            holder.house_dogs_where= (TextView) view.findViewById(R.id.house_dogs_where);
            holder.house_dogs_scan= (TextView) view.findViewById(R.id.house_dogs_scan);
            holder.house_dogs_zan= (TextView) view.findViewById(R.id.house_dogs_zan);

            view.setTag(holder);
        } else {
            view = convertView;
            holder = (ViewHolder) view.getTag();
        }
        holder.house_dogs.setText((String) list.get(position).get("house_dogs"));
        holder.house_dogs_where.setText((String) list.get(position).get("house_dogs_where"));
        holder.house_dogs_scan.setText((String) list.get(position).get("house_dogs_scan"));
        holder.house_dogs_zan.setText((String) list.get(position).get("house_dogs_zan"));

        holder.house_turtle.setText((String) list.get(position).get("house_turtle"));
        holder.house_turtle_where.setText((String) list.get(position).get("house_turtle_where"));
        holder.house_turtle_scan.setText((String) list.get(position).get("house_turtle_scan"));
        holder.house_turtle_zan.setText((String) list.get(position).get("house_turtle_zan"));

        holder.house_dog.setText((String) list.get(position).get("house_dog"));
        holder.house_dog_where.setText((String) list.get(position).get("house_dog_where"));
        holder.house_dog_scan.setText((String) list.get(position).get("house_dog_scan"));
        holder.house_dog_zan.setText((String) list.get(position).get("house_dog_zan"));
        return view;
    }
}

class ViewHolder {
    public TextView house_dogs,house_dogs_where,house_dogs_scan,house_dogs_zan,
            house_turtle,house_turtle_where,house_turtle_scan,house_turtle_zan,
            house_dog,house_dog_where,house_dog_scan,house_dog_zan;
}
