package cn.newbeedaly.common.domain.controller;

import cn.newbeedaly.common.api.client.HelloCallbackClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCallbackController implements HelloCallbackClient {

    Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Override
    public Boolean payCallback() {
        logger.info("回调成功");
        return Boolean.TRUE;
    }
}
