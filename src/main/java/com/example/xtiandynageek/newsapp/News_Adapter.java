package com.example.xtiandynageek.newsapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Xtian Dynageek on 3/24/2018.
 */

public class News_Adapter extends RecyclerView.Adapter <RecyclerView.ViewHolder>{

    private List<News_Template> news_list;
    private LayoutInflater inflater;

    private final int textOnlynews = 1;
    private final  int notTextOnly = 0;



    public News_Adapter(List<News_Template> news_list, LayoutInflater inflater) {
        this.news_list = news_list;
        this.inflater = inflater;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        RecyclerView.ViewHolder viewHolder = null;
        inflater = LayoutInflater.from(parent.getContext());

        /*
        its time to check the view that was returned
         */

        switch (viewType){

            case textOnlynews:

                View textNews = inflater.inflate(R.layout.layout_1, parent, false);

                viewHolder = new TextOnlyNews(textNews);

                 break;

            case notTextOnly:

                View captionNews = inflater.inflate(R.layout.layout_2, parent, false);
                viewHolder = new NewsWithCaption(captionNews);


                break;

            default:



        }




        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {


        switch (holder.getItemViewType()){

            case textOnlynews:

                TextOnlyNews textOnlyNews = (TextOnlyNews) holder;

                textOnlyNews.setDescription(news_list.get(position).getNewsMessage());
                break;

            case notTextOnly:

                NewsWithCaption newsWithCaption = (NewsWithCaption) holder;

                newsWithCaption.setDescription(news_list.get(position).getNewsMessage());

             break;



            default:
        }


    }

    @Override
    public int getItemCount() {
        return news_list.size();
    }


    @Override
    public int getItemViewType(int position) {

        if (news_list.get(position).getIs_text_only()){

            //the particular news post is text only

            return  textOnlynews;

        }else if (!(news_list.get(position).getIs_text_only())){

            //the particular news post has caption and des

            return notTextOnly;

        }


        return -1;
    }
}

/**
 * create the two view holder classes for the layouts
 */

class  TextOnlyNews extends  RecyclerView.ViewHolder{

    private TextView description;

    public TextOnlyNews(View itemView) {
        super(itemView);
        description = itemView.findViewById(R.id.layout1_textView); // this is the text view from the news only layout
    }
    public void  setDescription(String des) {

         description.setText(des);

    }

}

class  NewsWithCaption extends RecyclerView.ViewHolder{

    private TextView description;

    public NewsWithCaption(View itemView) {
        super(itemView);
        description = itemView.findViewById(R.id.layout2_textView); // this is the text view from the second new layout

    }


    public void  setDescription(String des) {

        description.setText(des);

    }
}


















