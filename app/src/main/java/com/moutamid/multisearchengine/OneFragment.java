package com.moutamid.multisearchengine;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.moutamid.multisearchengine.databinding.FragmentOneBinding;

public class OneFragment extends Fragment {
    String[] names = {
            "Google",
            "Bing",
            "Yahoo",
            "AOL",
            "Wikipedia",
            "Gramfind",
            "Amazon",
            "Qwant",
            "Startpage",
            "Yippy",
            "Onesearch",
            "Dictionary",
            "Ecosia",
            "Sogou",
            "Peekier",
            "eBay",
            "Walmart",
            "Pricesearcher",
            "Snapdeal",
            "Target",
            "Flipkart",
            "Alibaba",
            "Picsearch",
            "Imgur",
            "Photobucket",
            "Metager",
            "Dailymotion",
            "Videogram",
            "Pinterest",
            "500px",
            "We Heart It",
            "EyeEm",
            "DeviantArt",
            "iStockPhoto",
            "Quora",
            "Answers",
            "WikiHow",
            "WikiBooks",
            "eBooks",
            "Feedbooks",
            "JustFreeBooks",
            "Vimeo",
            "YouTube",
            "Reddit",
            "Tumblr",
            "Ask",
            "Twitter",
            "Facebook",
            "GitHub",
            "DuckDuckGo"
    };

    String[] links = {
            "https://www.google.com/search?q=",
            "",
            "https://search.yahoo.com/search?q=",
            "http://search.aol.com/aol/search?q=",
            "http://en.wikipedia.org/wiki/?search=",
            "https://www.gramfind.com/test.php?q=",
            "https://www.amazon.com/s?k=",
            "https://www.qwant.com/?q=",
            "https://www.startpage.com/do/metasearch.pl?q=",
            "https://yippy.com/search?query=",
            "https://www.onesearch.com/yhs/search;?p=",
            "https://www.dictionary.com/browse/",
            "https://www.ecosia.org/search?q=",
            "https://english.sogou.com/english?query=",
            "https://peekier.com/#!",
            "https://www.ebay.com/sch/i.html?_nkw=",
            "https://walmart.com/search/search-ng.do?search_query=",
            "https://www.pricesearcher.com/gb/search/?p=1&q=",
            "https://www.snapdeal.com/search?keyword=",
            "https://www.target.com/s?searchTerm=",
            "https://flipkart.com/search?q=",
            "https://www.alibaba.com/trade/search?SearchText=",
            "https://www.picsearch.com/index.cgi?q=",
            "https://imgur.com/search?q=",
            "https://photobucket.com/images/",
            "https://metager.org/meta/meta.ger3?eingabe=",
            "https://www.dailymotion.com/?search=",
            "https://www.videogram.com/search/?s=",
            "https://pinterest.com/search/pins/?q=",
            "https://500px.com/search?q=",
            "https://weheartit.com/search/entries?query=",
            "https://www.eyeem.com/search/pictures/iphone?q=",
            "https://www.deviantart.com/search?q=",
            "https://www.istockphoto.com/in/photos/",
            "https://www.quora.com/search?q=",
            "https://www.answers.com/search?q=",
            "https://www.wikihow.com/wikiHowTo?search=",
            "https://en.wikibooks.org/w/index.php?search=",
            "https://www.ebooks.com/en-in/searchapp/searchresults.net?term=",
            "https://feedbooks.com/search?query=",
            "https://www.justfreebooks.info/results.php?q=",
            "https://vimeo.com/search?q=",
            "https://www.youtube.com/results?search_query=",
            "https://www.reddit.com/search?q=",
            "https://www.tumblr.com/search/",
            "https://www.ask.com/web?q=",
            "https://twitter.com/search?q=",
            "https://www.facebook.com/public?query=",
            "https://github.com/search?q=",
            "https://duckduckgo.com/?q="
    };
    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        return view;
    }

}