package problem.cwebhttpclient.client.httpclient;

import org.springframework.http.HttpMethod;

import java.net.http.HttpClient;

public class SimpleClient {

    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
//        HttpMethod method=new GetMethod("http://java.sun.com");
    }
}
