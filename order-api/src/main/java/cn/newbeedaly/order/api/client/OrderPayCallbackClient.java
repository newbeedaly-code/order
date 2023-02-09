package cn.newbeedaly.order.api.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/order")
public interface OrderPayCallbackClient {

    @GetMapping("/pay/callback")
    Boolean payCallback();

}
