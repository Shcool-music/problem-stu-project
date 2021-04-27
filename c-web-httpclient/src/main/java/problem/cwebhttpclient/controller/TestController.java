package problem.cwebhttpclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import problem.cwebhttpclient.client.feignclient.FeignClient;


@RestController
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private FeignClient feignClient;

    @GetMapping("/test-feign1")
    public String bigInterfaceForAll() {
        logger.info("开始调用feign接口");
        feignClient.getReceive();
        return "success";
    }
}
