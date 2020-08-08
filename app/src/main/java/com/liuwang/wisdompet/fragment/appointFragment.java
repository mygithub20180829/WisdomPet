package com.liuwang.wisdompet.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.liuwang.wisdompet.R;
import com.liuwang.wisdompet.util.TypefaceUtil;

public class appointFragment extends Fragment {

    private LinearLayout ShoppingMenu,PickUPMenu,MemberMenu,ShowView;
    private TextView appoint_title;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.appoint_fragment,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        InitSetting();
        InitEvent(this.getActivity());
    }

    private void InitSetting() {
        ShoppingMenu = getActivity().findViewById(R.id.menu_shopping);
        PickUPMenu = getActivity().findViewById(R.id.menu_pickup);
        MemberMenu = getActivity().findViewById(R.id.menu_member);
        ShowView = getActivity().findViewById(R.id.show_view);
        appoint_title = getActivity().findViewById(R.id.text_appoint_1);
    }

    private void InitEvent(Context mContext) {
        TypefaceUtil tfUtil = new TypefaceUtil(mContext, "fonts/aa.ttf");
        tfUtil.setTypeface(appoint_title,false);
        ShoppingMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        PickUPMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        MemberMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
