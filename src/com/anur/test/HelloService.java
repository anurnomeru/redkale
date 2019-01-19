package com.anur.test;

import org.redkale.net.http.RestMapping;
import org.redkale.net.http.RestParam;
import org.redkale.net.http.RestService;
import org.redkale.service.Service;

/**
 * Created by Anur IjuoKaruKas on 2018/12/28
 */
@RestService(name = "hello")
public class HelloService implements Service {

    @RestMapping(name = "say")
    public String sayHello() {
        return "Hello World！";
    }

    @RestMapping(name = "hi")
    public String hi(@RestParam(name = "name") String name) {
        return "Hi, " + name + "！";
    }
}
