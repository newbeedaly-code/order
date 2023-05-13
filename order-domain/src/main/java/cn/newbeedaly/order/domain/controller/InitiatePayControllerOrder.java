package cn.newbeedaly.order.domain.controller;

import cn.newbeedaly.order.adaptor.pay.PayFeignClient;
import cn.newbeedaly.order.adaptor.pay.vo.req.PaymentReqVO;
import cn.newbeedaly.order.adaptor.pay.vo.res.PaymentResVO;
import cn.newbeedaly.order.api.client.InitiatePayClient;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitiatePayControllerOrder extends OrderBaseController implements InitiatePayClient {

    Logger logger = LoggerFactory.getLogger(InitiatePayControllerOrder.class);

    @Autowired
    private PayFeignClient payClient;

    @Override
    public String get(String key) {
        String payId = "PAY" + key;
        logger.info("订单中心：查询支付信息，支付ID:{}" , payId);
        PaymentResVO payment = payClient.getPaymentById(payId);
        return payment.getId();
    }

    @Override
    public Boolean pay() {
        // 发起支付
        PaymentReqVO vo = new PaymentReqVO();
        vo.setMerchantId("M-001");
        vo.setOrderId("O-001");
        vo.setPayAmount(1);
        logger.info("订单中心：发起支付，请求信息:{}" , JSON.toJSONString(vo));
        return payClient.pay(vo);
    }

}
