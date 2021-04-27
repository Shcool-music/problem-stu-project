package problem.cwebhttpclient.config;

import feign.Feign;
import feign.Request;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import problem.cwebhttpclient.client.feignclient.FeignClient;

import java.util.concurrent.TimeUnit;

/**
 * feign不依赖于spring cloud 采用以下使用方式
 */
@Configuration
public class FeignConfig {

    private String url = "localhost:8080";

    @Bean
    public FeignClient buildFeignClient() {
        return Feign.builder()
                .options(new Request.Options(60000, TimeUnit.MILLISECONDS, 60000, TimeUnit.MILLISECONDS, true))
                .retryer(new Retryer.Default(5000, 5000, 3))
                .target(FeignClient.class, "http://localhost:8080");
    }
}
