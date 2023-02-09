package cn.newbeedaly.order.api.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public interface InitiatePayClient {

    @GetMapping("/order/pay/{key}")
    String get(@PathVariable("key") String key);

    @PostMapping("/order/pay")
    Boolean pay();
}
