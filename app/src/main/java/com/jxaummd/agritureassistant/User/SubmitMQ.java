package com.jxaummd.agritureassistant.User;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.jxaummd.agritureassistant.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SubmitMQ extends AppCompatActivity {
    @BindView(R.id.imageView4)
    ImageView imageView4;
    @BindView(R.id.app_question_mood_btn)
    ImageView appQuestionMoodBtn;
    @BindView(R.id.app_question_question_btn)
    ImageView appQuestionQuestionBtn;
    @BindView(R.id.app_question_submit_cancle)
    ImageView appQuestionSubmitCancle;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_question_submit_chose);
        ButterKnife.bind(this);


    }

    @OnClick({R.id.app_question_mood_btn, R.id.app_question_question_btn, R.id.app_question_submit_cancle})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.app_question_mood_btn:

                break;
            case R.id.app_question_question_btn:
                break;
            case R.id.app_question_submit_cancle:
                Animation  animation = AnimationUtils.loadAnimation(this,R.anim.inter);
                appQuestionSubmitCancle.startAnimation(animation);
                finish();
                break;
        }
    }
}
