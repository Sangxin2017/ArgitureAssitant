package com.jxaummd.agritureassistant;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jxaummd.agritureassistant.User.SubmitMQ;
import com.jxaummd.agritureassistant.User.Userlable;
import com.jxaummd.agritureassistant.view.HomePageFragment;
import com.jxaummd.agritureassistant.view.MyselfPageFrangment;
import com.jxaummd.agritureassistant.view.SubmitQuestionFragment;
import com.jxaummd.module_library.MyFragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    @BindView(R.id.app_main_bottom_homepage_image)
    ImageView appMainBottomHomepageImage;
    @BindView(R.id.app_main_bottom_homepage_tv)
    TextView appMainBottomHomepageTv;
    @BindView(R.id.app_main_bottom_plus_image)
    ImageView appMainBottomPlusImage;
    @BindView(R.id.app_main_bottom_my_image)
    ImageView appMainBottomMyImage;
    @BindView(R.id.app_main_bottom_my_tv)
    TextView appMainBottomMyTv;
    @BindView(R.id.app_main_viewpage)
    ViewPager appMainViewpage;
    @BindView(R.id.app_main_bottom_homepage_layout)
    LinearLayout appMainBottomHomepageLayout;
    @BindView(R.id.app_main_bottom_plus_layout)
    LinearLayout appMainBottomPlusLayout;
    @BindView(R.id.app_main_bottom_my_layout)
    LinearLayout appMainBottomMyLayout;


    private boolean ischeckHomepage = true;
    private boolean ischeckMy = false;

    public static  Activity activity;


    //相关Fragment
    HomePageFragment  homePageFragment = new HomePageFragment();
    MyselfPageFrangment  myselfPageFrangment = new MyselfPageFrangment();
    SubmitQuestionFragment submitQuestionFragment = new SubmitQuestionFragment();

    List<Fragment> list = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
        activity=this;

    }

    private void initView() {
        list.add(homePageFragment);
    //    list.add(submitQuestionFragment);
        list.add(myselfPageFrangment);

        appMainViewpage.addOnPageChangeListener(this);
        appMainViewpage.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager(),list));
    }


    @OnClick({R.id.app_main_bottom_homepage_layout, R.id.app_main_bottom_plus_layout, R.id.app_main_bottom_my_layout})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.app_main_bottom_homepage_layout:
                // startActivity(new Intent(MainActivity.this, LoginUser.class));
                    changeButton(appMainBottomHomepageImage,R.drawable.app_main_bottom_homepage_click_icon,appMainBottomHomepageTv,"首页",getResources().getColor(R.color.app_main_bottom_click));
                    changeButton(appMainBottomMyImage,R.drawable.app_main_bottom_my_unclick_icon,appMainBottomMyTv,"我的",getResources().getColor(R.color.app_main_bottom_unclick));
                    appMainViewpage.setCurrentItem(0);
                break;
            case R.id.app_main_bottom_plus_layout:
                startActivity(new Intent(MainActivity.this, SubmitMQ.class));
                overridePendingTransition(R.anim.inter,R.anim.inter);
                break;
            case R.id.app_main_bottom_my_layout:

                    changeButton(appMainBottomHomepageImage,R.drawable.app_main_bottom_homepage_unclick_icon,appMainBottomHomepageTv,"首页",getResources().getColor(R.color.app_main_bottom_unclick));
                    changeButton(appMainBottomMyImage,R.drawable.app_main_bottom_my_click_icon,appMainBottomMyTv,"我的",getResources().getColor(R.color.app_main_bottom_click));
                appMainViewpage.setCurrentItem(1);

                break;
        }
    }


    void changeButton(ImageView imageView, int imageid, TextView textView, String text, @ColorInt int color) {
        imageView.setImageResource(imageid);
        textView.setText(text);
        textView.setTextColor(color);
    }



    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
            if(position==0){
                changeButton(appMainBottomHomepageImage,R.drawable.app_main_bottom_homepage_click_icon,appMainBottomHomepageTv,"首页",getResources().getColor(R.color.app_main_bottom_click));
                changeButton(appMainBottomMyImage,R.drawable.app_main_bottom_my_unclick_icon,appMainBottomMyTv,"我的",getResources().getColor(R.color.app_main_bottom_unclick));
            } else {
                changeButton(appMainBottomMyImage,R.drawable.app_main_bottom_my_click_icon,appMainBottomMyTv,"我的",getResources().getColor(R.color.app_main_bottom_unclick));
                changeButton(appMainBottomHomepageImage,R.drawable.app_main_bottom_homepage_unclick_icon,appMainBottomHomepageTv,"首页",getResources().getColor(R.color.app_main_bottom_unclick));
            }

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
