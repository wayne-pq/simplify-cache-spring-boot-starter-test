package cn.xxywithpq.test.cache.bean;

/**
 * @program: simplify-cache-spring-boot-starter
 * @description: ${description}
 * @author: qian.pan
 * @create: 2019/01/04 19:00
 **/
public class SaveObject {
    private String region;
    private String key;
    private TestObject object;


    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public TestObject getObject() {
        return object;
    }

    public void setObject(TestObject object) {
        this.object = object;
    }
}
