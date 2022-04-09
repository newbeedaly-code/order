package cn.newbeedaly.order.api.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/order/api")
public interface PayCallbackClient {

    @GetMapping("/payCallback")
    Boolean payCallback();

}
