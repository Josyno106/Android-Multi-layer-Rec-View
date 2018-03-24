package com.example.xtiandynageek.newsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView newsContainer; // this is the recycler view from xml



    private List<News_Template> news_List = new ArrayList<>();
    private News_Adapter news_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        newsContainer = findViewById(R.id.parent_container);
        newsContainer.setLayoutManager(new LinearLayoutManager(this)); //set the manager for the recycler view


        news_List.add(new News_Template("-this is the goal of this tutorial, to show you how to present different content for your app in different" +
                " layout formats using the same recycler view as a container……\n",true));
        news_List.add(new News_Template("hello news with text and caption",false));
        news_List.add(new News_Template("this is the goal of this tutorial, to show you how to present different content for your app in different layout " +
                "formats using the same recycler view as a container……\n",true));

        news_List.add(new News_Template("hello news with text and caption 2",false));


        news_adapter = new News_Adapter(news_List, (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE));



        newsContainer.setAdapter(news_adapter);  // after setting the adapter's data, which is the news_list, then we set it to be the recycler view adapter

        newsContainer.setHasFixedSize(true);






    }
}
