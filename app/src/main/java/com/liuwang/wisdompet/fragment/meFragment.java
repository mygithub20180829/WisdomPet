package com.liuwang.wisdompet.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.liuwang.wisdompet.R;
import com.liuwang.wisdompet.activity.LoginActivity;
import com.liuwang.wisdompet.activity.RegisterActivity;

public class meFragment extends Fragment {
    private Button login,register;
    private LinearLayout my_pallet,wechat,alipay;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.me_fragment,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        InitSetting();
        InitEvent();
    }

    private void InitSetting(){
        login=getActivity().findViewById(R.id.login);
        register=getActivity().findViewById(R.id.register);
        my_pallet=getActivity().findViewById(R.id.my_pallet);
        wechat=getActivity().findViewById(R.id.wechat);
        alipay=getActivity().findViewById(R.id.alipay);
    }

    private void InitEvent(){
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), RegisterActivity.class);
                startActivity(intent);
            }
        });
        my_pallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        wechat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), RegisterActivity.class);
                startActivity(intent);
            }
        });
        alipay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
