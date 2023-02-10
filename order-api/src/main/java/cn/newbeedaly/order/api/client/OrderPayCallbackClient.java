package cn.newbeedaly.order.api.client;

import org.springframework.web.bind.annotation.GetMapping;

public interface OrderPayCallbackClient {

    @GetMapping("/pay/callback")
    Boolean payCallback();

}
