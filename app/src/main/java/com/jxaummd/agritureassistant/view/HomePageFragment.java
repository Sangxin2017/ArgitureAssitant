package com.jxaummd.agritureassistant.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.jxaummd.agritureassistant.MainActivity;
import com.jxaummd.agritureassistant.R;
import com.jxaummd.agritureassistant.adapter.QuestionAdapter;
import com.jxaummd.module_library.bean.Question;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by sangx on 2018/2/20.
 */

public class HomePageFragment extends Fragment {


    @BindView(R.id.app_main_title_homepage_weather)
    ImageView appMainTitleHomepageWeather;
    @BindView(R.id.main_homepage_tablayout)
    TabLayout mainHomepageTablayout;
    @BindView(R.id.app_homepage_fragment_ques_recyclerview)
    RecyclerView appHomepageFragmentQuesRecyclerview;


    private List<Question>  list  = new ArrayList<>();



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.app_homepage_fragment_layout, container, false);
        unbinder = ButterKnife.bind(this, view);
        initTab();
        initList();

        return view;
    }

    private void initList() {

        list.add(new Question("http://imgsrc.baidu.com/baike/pic/item/e850352ac65c1038bcba9c0eb9119313b17e8932.jpg","sangxin","3分钟前","南昌","","","","",1,1));

        list.add(new Question("http://imgsrc.baidu.com/baike/pic/item/e850352ac65c1038bcba9c0eb9119313b17e8932.jpg","sangxin","3分钟前","南昌","","http://imgsrc.baidu.com/baike/pic/item/e850352ac65c1038bcba9c0eb9119313b17e8932.jpg","https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1523085905535&di=7f0d137146f96448514fd4edd4e8c47e&imgtype=0&src=http%3A%2F%2Fpic.58pic.com%2F58pic%2F13%2F11%2F70%2F98B58PIC6Nm_1024.jpg","http://imgsrc.baidu.com/baike/pic/item/e850352ac65c1038bcba9c0eb9119313b17e8932.jpg",1,1));




        QuestionAdapter  questionAdapter = new QuestionAdapter(list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.activity,LinearLayoutManager.VERTICAL,false);
        appHomepageFragmentQuesRecyclerview.setLayoutManager(linearLayoutManager);
        appHomepageFragmentQuesRecyclerview.setAdapter(questionAdapter);


    }

    private void initTab() {
        mainHomepageTablayout.addTab(mainHomepageTablayout.newTab().setText("问答").setTag(1));
        mainHomepageTablayout.addTab(mainHomepageTablayout.newTab().setText("关注").setTag(2));
        mainHomepageTablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int tag = (int) tab.getTag();

                if (tag == 1) {


                } else {


                }


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


}
