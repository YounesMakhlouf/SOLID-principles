package com.directi.training.dip.exercise.refactored;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class WebsiteReader implements IReader{
    private URL url;

    public WebsiteReader(URL url) {
        this.url = url;
    }
    @Override
    public String read() throws IOException {
        InputStream in= this.url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString1 = new StringBuilder();
        int c;
        c = reader.read();
        while (c != -1) {
            inputString1.append((char) c);
            c = reader.read();
        }
        return inputString1.toString();
    }
}
