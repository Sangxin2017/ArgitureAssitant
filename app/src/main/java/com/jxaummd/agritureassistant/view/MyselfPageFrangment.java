package com.jxaummd.agritureassistant.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jxaummd.agritureassistant.MainActivity;
import com.jxaummd.agritureassistant.R;
import com.jxaummd.agritureassistant.User.Userlable;
import com.jxaummd.module_library.RecyclerAdapter.BaseSquareAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * Created by sangx on 2018/2/20.
 */

public class MyselfPageFrangment extends Fragment {
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.app_myself_set_recycler)
    RecyclerView appMyselfSetRecycler;
    Unbinder unbinder;


    private BaseSquareAdapter  baseSquareAdapter ;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.app_myself_fragment_layout, container, false);
        unbinder = ButterKnife.bind(this, view);
        initList();

        return view;
    }

    private void initList() {
        baseSquareAdapter = new BaseSquareAdapter();
        baseSquareAdapter.setActivity(MainActivity.activity);
        baseSquareAdapter.setCl(Userlable.class);
        baseSquareAdapter.addItem(R.drawable.app_my_mycenter_expert_icon,"申请专家");
        baseSquareAdapter.addItem(R.drawable.app_my_mycenter_question_icon,"我的问答");
        baseSquareAdapter.addItem(R.drawable.app_my_mycenter_attention_icon,"我的关注");
        baseSquareAdapter.addItem(R.drawable.app_my_mycenter_message_icon,"消息中心");
        baseSquareAdapter.addItem(R.drawable.app_my_mycenter_active_icon,"我的标签");
        baseSquareAdapter.addItem(R.drawable.app_my_mycenter_set_icon,"设置中心");
        appMyselfSetRecycler.setLayoutManager(new GridLayoutManager(MainActivity.activity,3,GridLayoutManager.VERTICAL,false));
        appMyselfSetRecycler.setAdapter(baseSquareAdapter);

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
