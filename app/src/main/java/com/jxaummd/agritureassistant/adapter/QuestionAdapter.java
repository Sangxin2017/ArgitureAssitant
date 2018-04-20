package com.jxaummd.agritureassistant.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jxaummd.agritureassistant.MainActivity;
import com.jxaummd.module_library.R;
import com.jxaummd.module_library.bean.Question;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class QuestionAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Question> questionList;

    public QuestionAdapter(List<Question> questionList) {
        this.questionList = questionList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d("-----------------",viewType+"");
        View view ;
        RecyclerView.ViewHolder  viewHolder = null;
        if(viewType==0){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.app_homepage_ads_page,parent,false);
            viewHolder = new ViewHolder1(view);
        }else {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.app_homepage_ques_item, parent, false);
            viewHolder = new ViewHolder2(view);
        }
        
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

            if(position==0){

            }else {
                ViewHolder2  viewHolder2 = (ViewHolder2) holder;
                Glide.with(MainActivity.activity).load(questionList.get(position).getUserImage()).into(viewHolder2.mainHomepageQuesItemUserUserImage);
                Glide.with(MainActivity.activity).load(questionList.get(position).getQueImage1()).into(viewHolder2.appHomepageQuesItemContentImage1);
                Glide.with(MainActivity.activity).load(questionList.get(position).getQuesImage2()).into(viewHolder2.appHomepageQuesItemContentImage2);
                Glide.with(MainActivity.activity).load(questionList.get(position).getQuesImage3()).into(viewHolder2.appHomepageQuesItemContentImage3);

            }
    }

    @Override
    public int getItemViewType(int position) {
        if(position==0){
            return 0;
        }else {
            return  1;

        }
    }



    @Override
    public int getItemCount() {
        return questionList.size();
    }

    public class ViewHolder1 extends RecyclerView.ViewHolder {

        public ViewHolder1(View itemView) {
            super(itemView);
        }
    }


    //问答的item
    public class ViewHolder2 extends RecyclerView.ViewHolder {


        CircleImageView mainHomepageQuesItemUserUserImage;
        TextView appHomepageQuesItemUserName;
        TextView appHomepageQuesItemUserTime;
        TextView appHomepageQuesItemUserPlaceTv;
       // @butterknife.BindView(R.id.imageView)
        ImageView imageView;


        TextView appHomepageQuesItemContentQuesTv;
        ImageView appHomepageQuesItemContentImage1;
        ImageView appHomepageQuesItemContentImage2;
        ImageView appHomepageQuesItemContentImage3;


        ImageView appHomepageQuesItemBottomActivityImage;
        TextView appHomepageQuesItemBottomActivityTv;
        ImageView appHomepageQuesItemBottomCommentImage;
//        @butterknife.BindView(R.id.app_homepage_ques_item_bottom_activity_tv)
        TextView appHomepageQuesItemBottomCommentTv;


        public ViewHolder2(View itemView) {
            super(itemView);
            //用户头像
            mainHomepageQuesItemUserUserImage=itemView.findViewById(R.id.main_homepage_ques_item_user_user_image);
            appHomepageQuesItemUserName=itemView.findViewById(R.id.app_homepage_ques_item_user_name);
            appHomepageQuesItemUserTime=itemView.findViewById(R.id.app_homepage_ques_item_user_time);
            appHomepageQuesItemUserPlaceTv=itemView.findViewById(R.id.app_homepage_ques_item_user_place_tv);

            //内容
            appHomepageQuesItemContentQuesTv=itemView.findViewById(R.id.app_homepage_ques_item_content_ques_tv);
            appHomepageQuesItemContentImage1=itemView.findViewById(R.id.app_homepage_ques_item_content_image1);
            appHomepageQuesItemContentImage2=itemView.findViewById(R.id.app_homepage_ques_item_content_image2);
            appHomepageQuesItemContentImage3=itemView.findViewById(R.id.app_homepage_ques_item_content_image3);
            //底部
            appHomepageQuesItemBottomActivityImage=itemView.findViewById(R.id.app_homepage_ques_item_bottom_activity_image);
            appHomepageQuesItemBottomActivityTv=itemView.findViewById(R.id.app_homepage_ques_item_bottom_activity_tv);
            appHomepageQuesItemBottomCommentImage=itemView.findViewById(R.id.app_homepage_ques_item_bottom_comment_image);
            appHomepageQuesItemBottomCommentTv=itemView.findViewById(R.id.app_homepage_ques_item_bottom_comment_tv);

        }
    }
}
