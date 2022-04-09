package cn.newbeedaly.order.domain.controller;

import cn.newbeedaly.order.api.client.InitiatePayClient;
import cn.newbeedaly.pay.api.client.PayClient;
import cn.newbeedaly.pay.api.vo.PaymentReqVO;
import cn.newbeedaly.pay.api.vo.PaymentResVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitiatePayController implements InitiatePayClient {

    Logger logger = LoggerFactory.getLogger(InitiatePayController.class);

    @Autowired
    private PayClient payClient;

    @Override
    public String get(String key) {
        PaymentResVO payment = payClient.getPaymentById(key);
        logger.info(payment.getId());
        return payment.getId();
    }

    @Override
    public Boolean pay() {
        // 发起支付
        PaymentReqVO vo = new PaymentReqVO();
        vo.setMerchantId("M-001");
        vo.setOrderId("O-001");
        vo.setPayAmount(1);
        return payClient.pay(vo);
    }

}
