package com.example.android.bacchusguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A MapFragment {@link Fragment} subclass.
 */
public class MapFragment extends Fragment {

    public MapFragment() {
        // Required empty public constructor
    }

    //The details fragment showing the contents of a selected item
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate (R.layout.map_fragment, container, false);

        //The details fragment showing the WebView
        WebView webView = (WebView) rootView.findViewById (R.id.web_view);
        WebSettings settings = webView.getSettings ();

        //JavaScript is enabled.
        settings.setJavaScriptEnabled (true);
        //The built-in zoom is enabled.
        settings.setBuiltInZoomControls (true);

        //Load the web page:
        webView.loadUrl ("https://drive.google.com/open?id=1KGyhqPsdrNC-EX7IUR0G9F2evMMOwWXc&usp=sharing");

        //Sets the WebViewClient that will receive various notifications and requests.
        webView.setWebViewClient (new WebViewClient ());
        //Sets the chrome handler.
        webView.setWebChromeClient (new WebChromeClient ());

        return rootView;

    }
}