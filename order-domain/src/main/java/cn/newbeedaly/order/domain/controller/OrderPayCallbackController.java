package cn.newbeedaly.order.domain.controller;

import cn.newbeedaly.order.api.client.OrderPayCallbackClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderPayCallbackController implements OrderPayCallbackClient {

    Logger logger = LoggerFactory.getLogger(InitiatePayController.class);

    @Override
    public Boolean payCallback() {
        logger.info("回调成功");
        return Boolean.TRUE;
    }
}
