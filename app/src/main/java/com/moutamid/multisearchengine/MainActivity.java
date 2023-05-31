package com.moutamid.multisearchengine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.fxn.stash.Stash;
import com.moutamid.multisearchengine.databinding.ActivityMainBinding;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding b;

    String defaultLink = "http://www.searchabk.com/api/MemberApi/getFeed?id=13308001235&app=1&key=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        ViewPager pager = (ViewPager) findViewById(R.id.viewPager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

        b.dotsIndicator.setViewPager(pager);

        b.searchBtn.setOnClickListener(v -> {
            String text = b.searchEditText.getText().toString();

            if (text.isEmpty())
                return;

            try {
                URLEncoder.encode(text, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                text = "error";
                e.printStackTrace();
            }

            String finalLink = defaultLink + text;

            startActivity(new Intent(MainActivity.this, BrowserActivity.class)
                    .putExtra(Constants.PARAMS, finalLink));

        });

    }

    public void OnClickFragment(View view) {

        String link = "" + view.getTag().toString();
        String text = b.searchEditText.getText().toString();

        if (text.isEmpty())
            return;

        try {
            URLEncoder.encode(text, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            text = "error";
            e.printStackTrace();
        }

        String finalLink = link + text;

        startActivity(new Intent(MainActivity.this, BrowserActivity.class)
                .putExtra(Constants.PARAMS, finalLink));
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch (pos) {
                case 0:
                    return new OneFragment();
                case 1:
                    return new TwoFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 2;
        }
    }


}