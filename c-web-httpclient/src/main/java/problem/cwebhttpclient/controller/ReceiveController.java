package problem.cwebhttpclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class ReceiveController {

    private static final Logger logger = LoggerFactory.getLogger(ReceiveController.class);

    @GetMapping("/get-receive")
    public Map<String, Object> getReceive() {
        logger.info("有请求进来了");
        HashMap<String, Object> result = new HashMap<>();
        result.put("success", 1);
        return result;
    }


    @PostMapping("/post-receive")
    public String postReceive() {
        logger.info("有请求进来了");
        return "success";
    }

}
