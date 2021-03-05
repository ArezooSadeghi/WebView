package com.example.webview;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.webview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);*/

        CustomWebView customWebView = new CustomWebView(getApplicationContext());
        setContentView(customWebView);
        customWebView.getSettings().setJavaScriptEnabled(true);
        customWebView.setWebViewClient(new WebViewClient());
        customWebView.loadUrl("http://sippacs.ir/mobileApp/?App=1");

       /* mBinding.webView.getSettings().setJavaScriptEnabled(true);
        mBinding.webView.setWebViewClient(new WebViewClient());
        mBinding.webView.loadUrl("http://sippacs.ir/mobileApp/?App=1");*/
    }

    /*@Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (mBinding.webView.canGoBack()) {
            mBinding.webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }*/

   /* @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        int keyAction = event.getAction();
        if (keyAction == KeyEvent.ACTION_UP) {
            int keyCode = event.getKeyCode();
            int keyUniCode = event.getUnicodeChar(event.getMetaState());
            char character = (char) keyUniCode;
            Toast.makeText(this, "myChar" + character, Toast.LENGTH_SHORT).show();
        }
        return super.dispatchKeyEvent(event);
    }*/
}