package com.example.gavin.web;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edit;
    Button button;
    WebView browser;
    String link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit = (EditText) findViewById(R.id.edittext);
        button = (Button) findViewById(R.id.button);

        browser = (WebView) findViewById(R.id.webview);
        browser.setWebViewClient(new Browser());

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                link = edit.getText().toString();

                browser.getSettings().setLoadsImagesAutomatically(true);
                browser.getSettings().setJavaScriptEnabled(true);
                browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                browser.loadUrl(link);
            }

        });

    }
}
