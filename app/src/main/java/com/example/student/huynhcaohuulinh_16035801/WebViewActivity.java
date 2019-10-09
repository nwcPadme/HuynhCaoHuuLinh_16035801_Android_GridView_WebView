package com.example.student.huynhcaohuulinh_16035801;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;


public class WebViewActivity extends AppCompatActivity {
    WebView webView;
    String address =  "http://google.com";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        webView = findViewById(R.id.webview);

        address = getIntent().getExtras().getString("url");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(address);


    }
}
