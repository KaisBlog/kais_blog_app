package com.kaisblog.de;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class KaisBlog extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kais_blog);

        webView = (WebView) findViewById(R.id.wvw_kaisblog);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://kais-blog.de");

    }
}
