package com.jxaummd.agritureassistant.User;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.jxaummd.agritureassistant.MainActivity;
import com.jxaummd.module_library.MyApplication;
import com.jxaummd.agritureassistant.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginUser extends AppCompatActivity {
    @BindView(R.id.app_login_logo_image)
    ImageView appLoginLogoImage;
    @BindView(R.id.app_login_username_et)
    EditText appLoginUsernameEt;
    @BindView(R.id.app_login_password_et)
    EditText appLoginPasswordEt;
    @BindView(R.id.app_login_button)
    Button appLoginButton;
    @BindView(R.id.app_login_register_tv)
    TextView appLoginRegisterTv;
    @BindView(R.id.app_login_forget_password_tv)
    TextView appLoginForgetPasswordTv;

    private String username = null;    //用户名
    private  String  password = null;   //密码


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_activity_login);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.app_login_button, R.id.app_login_register_tv, R.id.app_login_forget_password_tv})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.app_login_button:

                if(!appLoginUsernameEt.getText().toString().trim().equals("")){
                    startActivity(new Intent(LoginUser.this, MainActivity.class));
                    finish();
                }else {
                    MyApplication.MyToast("请输入用户名和密码");

                }
                break;
            case R.id.app_login_register_tv:
                startActivity(new Intent(LoginUser.this, MainActivity.class));
                finish();

                break;
            case R.id.app_login_forget_password_tv:
                startActivity(new Intent(LoginUser.this, MainActivity.class));
                finish();

                break;
        }
    }
}
