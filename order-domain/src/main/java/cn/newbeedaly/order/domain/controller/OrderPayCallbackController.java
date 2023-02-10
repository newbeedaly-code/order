package cn.newbeedaly.order.domain.controller;

import cn.newbeedaly.order.api.client.OrderPayCallbackClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderPayCallbackController extends OrderBaseController implements OrderPayCallbackClient {

    Logger logger = LoggerFactory.getLogger(InitiatePayControllerOrder.class);

    @Override
    public Boolean payCallback() {
        logger.info("订单中心：接收支付回调通知，回调成功");
        return Boolean.TRUE;
    }
}
