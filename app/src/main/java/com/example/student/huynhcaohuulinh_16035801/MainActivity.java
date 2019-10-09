package com.example.student.huynhcaohuulinh_16035801;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<LinkObject> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridview);

        createExampleData();
        Adapter adapter = new Adapter(MainActivity.this, R.layout.gridview_layout, list);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String url = list.get(i).getUrl();

                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra("url", url);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"Mo trang web: " + url, Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void createExampleData(){
        LinkObject google = new LinkObject("Google", R.drawable.google, "http://google.com");
        LinkObject facebook = new LinkObject("Facebook", R.drawable.facebook, "http://facebook.com");
        LinkObject twitter = new LinkObject("Twitter", R.drawable.twiter, "http://twitter.com");
        LinkObject github = new LinkObject("Github", R.drawable.github, "http://github.com");
        LinkObject iuh = new LinkObject("IUH", R.drawable.iuh, "http://iuh.edu.vn");
        LinkObject stackoverflow = new LinkObject("StackOverflow", R.drawable.stackoverflow, "http://stackoverflow.com");
        LinkObject medium = new LinkObject("Medium", R.drawable.medium, "http://medium.com");
        LinkObject zalo = new LinkObject("Zalo", R.drawable.zalo, "http://zalo.me");

        list.add(google);
        list.add(twitter);
        list.add(github);
        list.add(facebook);
        list.add(iuh);
        list.add(stackoverflow);
        list.add(medium);
        list.add(zalo);
        list.add(facebook);
        list.add(iuh);
        list.add(iuh);
        list.add(iuh);
    }
}
