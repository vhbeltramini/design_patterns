package com.vhbeltramini.store.http;

import com.vhbeltramini.store.DomainException;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter{


    @Override
    public void post(String url, Map<String, Object> data) {
        try {
            URL apiUrl = new URL(url);
            URLConnection connection = apiUrl.openConnection();
            connection.connect();
        } catch (Exception e) {
            throw new DomainException("Error sending HTTP request");
        }
    }
}
