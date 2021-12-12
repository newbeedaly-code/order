package cn.newbeedaly.common.domain.controller;

import cn.newbeedaly.common.api.client.HelloClient;
import cn.newbeedaly.pay.api.client.PayClient;
import cn.newbeedaly.pay.api.vo.PaymentResVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloClient {

    Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private PayClient payClient;

    @Override
    public String get(String key) {
        PaymentResVO payment = payClient.getPaymentById(key);
        logger.info(payment.getId());
        return payment.getId();
    }

}
