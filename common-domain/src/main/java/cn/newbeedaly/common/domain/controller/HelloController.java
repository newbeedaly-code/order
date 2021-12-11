package cn.newbeedaly.common.domain.controller;

import cn.newbeedaly.common.api.client.HelloClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloClient {


    @Override
    public Boolean get(String key) {
        return true;
    }

}
