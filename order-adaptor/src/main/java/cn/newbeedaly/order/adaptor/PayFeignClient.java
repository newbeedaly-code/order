package cn.newbeedaly.order.adaptor;

import cn.newbeedaly.order.adaptor.config.DefaultFeignClientConfiguration;
import cn.newbeedaly.pay.api.client.PayClient;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "pay", contextId = "PayFeignClient",
        path = "/pay", configuration = DefaultFeignClientConfiguration.class)
public interface PayFeignClient extends PayClient {

}
