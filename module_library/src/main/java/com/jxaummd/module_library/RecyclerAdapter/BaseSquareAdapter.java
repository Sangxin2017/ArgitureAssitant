package com.jxaummd.module_library.RecyclerAdapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.jxaummd.module_library.MyApplication;
import com.jxaummd.module_library.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sangx on 2018/3/14.
 */

public class BaseSquareAdapter extends RecyclerView.Adapter<BaseSquareAdapter.ViewHolder>{
    private List<SetItem> list=new ArrayList<>();

    public  void addItem(int image,String title){
        list.add(new SetItem(image,title));
    }

    private Activity  activity  = null;
    private Class  cl = null;

    public Class getCl() {
        return cl;
    }

    public void setCl(Class cl) {
        this.cl = cl;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view
                 = LayoutInflater.from(parent.getContext()).inflate(R.layout.library_square_adpter_list_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;




    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        holder.buttonimage.setImageResource(list.get(position).getImage_id());
        holder.buttontext.setText(list.get(position).getTitle());
        switch (position){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                holder.buttonimage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        activity.startActivity(new Intent(activity,cl));
                    }
                });
                break;

        }



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView buttonimage;
        TextView buttontext;
        View buttonviewl;

        public ViewHolder(View itemView) {
            super(itemView);
            buttonimage=itemView.findViewById(R.id.square_adapter_list_item_image);
            buttontext=itemView.findViewById(R.id.square_adapter_list_item_text);
            buttonviewl=itemView;
        }
    }


    public class  SetItem {
        private int image_id;
        private String title;

        public SetItem(int image_id, String title) {
            this.image_id = image_id;
            this.title = title;
        }


        public int getImage_id() {
            return image_id;
        }

        public void setImage_id(int image_id) {
            this.image_id = image_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

}

