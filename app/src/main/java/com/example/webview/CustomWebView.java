package com.example.webview;

import android.content.Context;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.WebView;

import androidx.annotation.NonNull;

public class CustomWebView extends WebView {

    public CustomWebView(@NonNull Context context) {
        super(context);
    }

    @Override
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        return new BaseInputConnection(this, false);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        boolean dispatchFirst = super.dispatchKeyEvent(event);
        if (event.getAction() == KeyEvent.ACTION_UP)
            switch (event.getKeyCode()) {
                case KeyEvent.KEYCODE_BACK:
                    Log.d("Arezoo", "dispatchKeyEvent");
                    Log.d("Arezoo", dispatchFirst + "");
                    break;
            }
        return dispatchFirst;
    }
}
