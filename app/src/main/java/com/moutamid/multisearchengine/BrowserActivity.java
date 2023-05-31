package com.moutamid.multisearchengine;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.moutamid.multisearchengine.databinding.ActivityBrowserBinding;

public class BrowserActivity extends AppCompatActivity {

    private ActivityBrowserBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityBrowserBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        String url = getIntent().getStringExtra(Constants.PARAMS);

        b.topEditText.setText(url);

        b.webview.getSettings().setJavaScriptEnabled(true);
        b.webview.setWebViewClient(new YXWebViewClient());

        b.webview.loadUrl(url);

    }

    public class YXWebViewClient extends WebViewClient {

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            Log.i("Listener", "Start");

        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            Log.i("Listener", "Finish");
            b.topEditText.setText(url);

        }

    }


}