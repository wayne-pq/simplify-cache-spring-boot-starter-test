package cn.xxywithpq.test.cache.web;

import cn.xxywithpq.cache.CachesJsonUtil;
import cn.xxywithpq.test.cache.bean.SaveObject;
import cn.xxywithpq.test.cache.bean.TestObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: simplify-cache-spring-boot-starter
 * @description: ${description}
 * @author: qian.pan
 * @create: 2019/01/04 18:47
 **/
@RestController
@RequestMapping("/test")
public class TestController {


    @Autowired
    CachesJsonUtil cachesJsonUtil;

    @GetMapping("/get")
    public TestObject get(@RequestBody SaveObject saveObject) {
        TestObject test = cachesJsonUtil.get(saveObject.getRegion(), saveObject.getKey(), TestObject.class);
        return test;
    }

    @PostMapping("/set")
    public void set(@RequestBody SaveObject saveObject) {
        cachesJsonUtil.set(saveObject.getRegion(), saveObject.getKey(), saveObject.getObject());
    }

    @DeleteMapping("/delete/{region}/{key}")
    public void delete(@PathVariable String region, @PathVariable String key) {
        cachesJsonUtil.delete(region, key);
    }

}
