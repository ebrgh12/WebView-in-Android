package com.example.gavin.web;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by gavin on 1/28/2018.
 */

public class Browser extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url){
        view.loadUrl(url);
        return true;
    }

}
