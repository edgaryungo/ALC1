package com.example.alc1;

import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebViewClient;
import android.webkit.WebView;
import android.webkit.WebResourceRequest;

public class AlcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alc);

        WebView mywebview = new WebView(this);
        setContentView(mywebview);
        mywebview.loadUrl("http://andela.com/alc/");
        mywebview.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });

    }

}
