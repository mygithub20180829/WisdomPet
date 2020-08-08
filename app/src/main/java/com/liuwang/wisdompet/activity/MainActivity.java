package com.liuwang.wisdompet.activity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.liuwang.wisdompet.DBhelper;
import com.liuwang.wisdompet.R;
import com.liuwang.wisdompet.fragment.appointFragment;
import com.liuwang.wisdompet.fragment.classFragment;
import com.liuwang.wisdompet.fragment.houseFragment;
import com.liuwang.wisdompet.fragment.meFragment;
import com.liuwang.wisdompet.fragment.searchFragment;
import com.liuwang.wisdompet.util.TypefaceUtil;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected LinearLayout mMenuHouse;
    protected LinearLayout mMenuAppoint;
    protected LinearLayout mMenuClass;
    protected LinearLayout mMenuSearch;
    protected LinearLayout mMenuMe;

    protected ImageView house,appoint,_class,search,me;

    protected TextView wisdom_house,wisdom_appoint,wisdom_class,wisdom_search,wisdom_me;

    protected houseFragment mHouseFragment=new houseFragment();  //智慧社区
    protected classFragment mClassFragment=new classFragment();    //智慧课堂
    protected appointFragment mAppointFragment=new appointFragment(); //智慧预约
    protected searchFragment mSearchFragment=new searchFragment();     //智慧搜索
    protected meFragment mMeFragment=new meFragment();     //我的智宠



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBhelper loginSqlite=new DBhelper(this,"login.db",null,1);
        SQLiteDatabase db=loginSqlite.getReadableDatabase();

        initView(MainActivity.this);

        //获取管理类
        this.getSupportFragmentManager().beginTransaction()     //开启事务
                .add(R.id.container_content,mHouseFragment)
                .add(R.id.container_content,mClassFragment)
                .hide(mClassFragment)
                .add(R.id.container_content,mAppointFragment)
                .hide(mAppointFragment)
                .add(R.id.container_content,mSearchFragment)
                .hide(mSearchFragment)
                .add(R.id.container_content,mMeFragment)
                .hide(mMeFragment)                          //事务添加  默认：显示首页，隐藏其他页面
                .commit();                                              //提交
    }

    /**
     * 初始化视图
     */
    public void initView(Context mContext){
        mMenuHouse=findViewById(R.id.menu_house);
        mMenuAppoint=findViewById(R.id.menu_appoint);
        mMenuClass=findViewById(R.id.menu_class);
        mMenuSearch=findViewById(R.id.menu_search);
        mMenuMe=this.findViewById(R.id.menu_me);

        house=findViewById(R.id.house);
        appoint=findViewById(R.id.appoint);
        _class=findViewById(R.id._class);
        search=findViewById(R.id.search);
        me=findViewById(R.id.me);

        wisdom_house=findViewById(R.id.wisdom_house);
        wisdom_appoint=findViewById(R.id.wisdom_appoint);
        wisdom_class=findViewById(R.id.wisdom_class);
        wisdom_search=findViewById(R.id.wisdom_search);
        wisdom_me=findViewById(R.id.wisdom_me);

        TypefaceUtil tfUtil = new TypefaceUtil(mContext, "fonts/aa.ttf");
        tfUtil.setTypeface(wisdom_house,false);
        tfUtil.setTypeface(wisdom_appoint,false);
        tfUtil.setTypeface(wisdom_class,false);
        tfUtil.setTypeface(wisdom_search,false);
        tfUtil.setTypeface(wisdom_me,false);


        mMenuHouse.setOnClickListener(this);
        mMenuAppoint.setOnClickListener(this);
        mMenuClass.setOnClickListener(this);
        mMenuSearch.setOnClickListener(this);
        mMenuMe.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.menu_house:        //首页
                //获取管理类
                this.getSupportFragmentManager().beginTransaction()     //开启事务
                        .show(mHouseFragment)
                        .hide(mClassFragment)
                        .hide(mAppointFragment)
                        .hide(mSearchFragment)
                        .hide(mMeFragment)                          //事务添加  默认：显示首页，隐藏其他页面
                        .commit();
                //提交
//                house.setImageResource(R.mipmap.house_2);
//                appoint.setImageResource(R.mipmap.appoint_1);
//                _class.setImageResource(R.mipmap.class_1);
//                search.setImageResource(R.mipmap.search_1);
//                me.setImageResource(R.mipmap.me_1);

                wisdom_house.setTextColor(Color.parseColor("#00ff00"));
                wisdom_appoint.setTextColor(Color.parseColor("#000000"));
                wisdom_search.setTextColor(Color.parseColor("#000000"));
                wisdom_class.setTextColor(Color.parseColor("#000000"));
                wisdom_me.setTextColor(Color.parseColor("#000000"));
                break;
            case R.id.menu_appoint:        //发现
                //获取管理类
                this.getSupportFragmentManager().beginTransaction()     //开启事务
                        .hide(mHouseFragment)
                        .hide(mClassFragment)
                        .show(mAppointFragment)
                        .hide(mSearchFragment)
                        .hide(mMeFragment)                          //事务添加  默认：显示首页，隐藏其他页面
                        .commit();//提交
//                house.setImageResource(R.mipmap.house_1);
//                appoint.setImageResource(R.mipmap.appoint_2);
//                _class.setImageResource(R.mipmap.class_1);
//                search.setImageResource(R.mipmap.search_1);
//                me.setImageResource(R.mipmap.me_1);

                wisdom_house.setTextColor(Color.parseColor("#000000"));
                wisdom_appoint.setTextColor(Color.parseColor("#55557f"));
                wisdom_search.setTextColor(Color.parseColor("#000000"));
                wisdom_class.setTextColor(Color.parseColor("#000000"));
                wisdom_me.setTextColor(Color.parseColor("#000000"));
                break;
            case R.id.menu_class:        //发现
                //获取管理类
                this.getSupportFragmentManager().beginTransaction()     //开启事务
                        .hide(mHouseFragment)
                        .show(mClassFragment)
                        .hide(mAppointFragment)
                        .hide(mSearchFragment)
                        .hide(mMeFragment)                          //事务添加  默认：显示首页，隐藏其他页面
                        .commit();//提交
//                house.setImageResource(R.mipmap.house_1);
//                appoint.setImageResource(R.mipmap.appoint_1);
//                _class.setImageResource(R.mipmap.class_2);
//                search.setImageResource(R.mipmap.search_1);
//                me.setImageResource(R.mipmap.me_1);

                wisdom_house.setTextColor(Color.parseColor("#000000"));
                wisdom_appoint.setTextColor(Color.parseColor("#000000"));
                wisdom_search.setTextColor(Color.parseColor("#000000"));
                wisdom_class.setTextColor(Color.parseColor("#ff5500"));
                wisdom_me.setTextColor(Color.parseColor("#000000"));
                break;
            case R.id.menu_search:        //发现
                //获取管理类
                this.getSupportFragmentManager().beginTransaction()     //开启事务
                        .hide(mHouseFragment)
                        .hide(mClassFragment)
                        .hide(mAppointFragment)
                        .show(mSearchFragment)
                        .hide(mMeFragment)                          //事务添加  默认：显示首页，隐藏其他页面
                        .commit();                                              //提交
//                house.setImageResource(R.mipmap.house_1);
//                appoint.setImageResource(R.mipmap.appoint_1);
//                _class.setImageResource(R.mipmap.class_1);
//                search.setImageResource(R.mipmap.search_2);
//                me.setImageResource(R.mipmap.me_1);

                wisdom_house.setTextColor(Color.parseColor("#000000"));
                wisdom_appoint.setTextColor(Color.parseColor("#000000"));
                wisdom_search.setTextColor(Color.parseColor("#0d8f86"));
                wisdom_class.setTextColor(Color.parseColor("#000000"));
                wisdom_me.setTextColor(Color.parseColor("#000000"));
                break;
            case R.id.menu_me:          //我的
                //获取管理类
                this.getSupportFragmentManager().beginTransaction()     //开启事务
                        .hide(mHouseFragment)
                        .hide(mClassFragment)
                        .hide(mAppointFragment)
                        .hide(mSearchFragment)
                        .show(mMeFragment)                          //事务添加  默认：显示首页，隐藏其他页面
                        .commit();                                              //提交
//                house.setImageResource(R.mipmap.house_1);
//                appoint.setImageResource(R.mipmap.appoint_1);
//                _class.setImageResource(R.mipmap.class_1);
//                search.setImageResource(R.mipmap.search_1);
//                me.setImageResource(R.mipmap.me_2);

                wisdom_house.setTextColor(Color.parseColor("#000000"));
                wisdom_appoint.setTextColor(Color.parseColor("#000000"));
                wisdom_search.setTextColor(Color.parseColor("#000000"));
                wisdom_class.setTextColor(Color.parseColor("#000000"));
                wisdom_me.setTextColor(Color.parseColor("#bd0731"));
                break;
        }
    }
}
