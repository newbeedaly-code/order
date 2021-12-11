package cn.newbeedaly.common.api.client;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/common/api")
public interface HelloClient {

    @RequestMapping("/get/{key}")
    Boolean get(@PathVariable("key") String key);
}
