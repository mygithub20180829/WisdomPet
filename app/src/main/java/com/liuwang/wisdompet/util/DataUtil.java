package com.liuwang.wisdompet.util;

import android.content.Context;
import android.widget.ImageView;


import com.liuwang.wisdompet.entity.Menu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuwang on 2019/8/4.
 */

public class DataUtil {

    public static List<ImageView> getHeaderAdInfo(Context context, int icons[]){
        List<ImageView> datas=new ArrayList<>();
        for (int i=0;i<icons.length;i++){
            ImageView icon=new ImageView(context);
            icon.setScaleType(ImageView.ScaleType.CENTER_CROP);
            icon.setImageResource(icons[i]);
            datas.add(icon);
        }
        return datas;
    }

    /**
     * 主菜单
     * @param icons
     * @param names
     * @return
     */
    public static List<Menu> getMainMenus(int icons[], String names[]){
        List<Menu> menus=new ArrayList<>();
        for (int i=0;i<icons.length;i++){
            Menu menu=new Menu(icons[i],names[i]);
            menus.add(menu);
        }
        return menus;
    }
}
