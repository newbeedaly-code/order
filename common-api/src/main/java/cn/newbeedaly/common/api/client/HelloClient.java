package cn.newbeedaly.common.api.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/common/api/hello")
public interface HelloClient {

    @GetMapping("/get/{key}")
    String get(@PathVariable("key") String key);
}
