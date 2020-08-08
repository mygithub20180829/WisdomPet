package com.liuwang.wisdompet.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.liuwang.wisdompet.R;
import com.liuwang.wisdompet.util.TypefaceUtil;

public class searchFragment extends Fragment {

    Button button;
    protected TextView search_title;
    protected Context mContext;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.search_fragment,container,false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mContext=getActivity();
        search_title=getActivity().findViewById(R.id.wisdom_search_text);
        TypefaceUtil tfUtil = new TypefaceUtil(mContext, "fonts/aa.ttf");
        tfUtil.setTypeface(search_title,false);
    }
}
