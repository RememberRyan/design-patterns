package ee.sda.patterns.behavioral.chainofresponsibility.model;

import java.util.Map;

public class Request {

    private String url;
    private Map<String, String> headers;


    public Request(String url, Map<String, String> headers) {
        this.url = url;
        this.headers = headers;

    }

    public String getUrl() {
        return url;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }
}
