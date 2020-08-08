package com.liuwang.wisdompet.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.liuwang.wisdompet.R;
import com.liuwang.wisdompet.adapter.FindListViewAdapter;
import com.liuwang.wisdompet.util.TypefaceUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class houseFragment extends Fragment {
    protected List<Map<String, Object>> list;
    protected ListView listView;
    protected TextView house_title;
    protected Context mContext;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.house_fragment,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        list = new ArrayList<>();

        mContext=getActivity();
        house_title=getActivity().findViewById(R.id.wisdom_house_text);
        TypefaceUtil tfUtil = new TypefaceUtil(mContext, "fonts/aa.ttf");
        tfUtil.setTypeface(house_title,false);

        Map<String, Object> map = new HashMap<>();
        map.put("house_turtle", "切勿盲目放生巴西龟");
        map.put("house_turtle_where", "来源：美丽中国");
        map.put("house_turtle_scan", "839932");
        map.put("house_turtle_zan", "16");
        map.put("house_dog", "家养宠物请你一宠到底");
        map.put("house_dog_where", "来源：家居生活");
        map.put("house_dog_scan", "28621");
        map.put("house_dog_zan", "47");
        map.put("house_dogs", "从东莞去广州仅需半个小时");
        map.put("house_dogs_where", "来源：羊城攻略");
        map.put("house_dogs_scan", "10526");
        map.put("house_dogs_zan", "23");
        list.add(map);

        listView= getView().findViewById(R.id.lst_hot_infos);
        FindListViewAdapter adapter=new FindListViewAdapter(getActivity(),list);
        listView.setAdapter(adapter);
    }
}
