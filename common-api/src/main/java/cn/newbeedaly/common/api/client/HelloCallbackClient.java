package cn.newbeedaly.common.api.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/common/api/callback")
public interface HelloCallbackClient {

    @GetMapping("/payCallback")
    Boolean payCallback();

}
