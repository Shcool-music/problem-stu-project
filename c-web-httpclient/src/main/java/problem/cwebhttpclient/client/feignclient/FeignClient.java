package problem.cwebhttpclient.client.feignclient;

import feign.RequestLine;

public interface FeignClient {

    @RequestLine("GET /get-receive")
    public String getReceive();
}
