package cn.newbeedaly.common.adaptor;

import cn.newbeedaly.common.adaptor.config.DefaultFeignClientConfiguration;
import cn.newbeedaly.pay.api.client.PayClient;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "pay", contextId = "PayFeignClient", configuration = DefaultFeignClientConfiguration.class)
public interface PayFeignClient extends PayClient {

}
