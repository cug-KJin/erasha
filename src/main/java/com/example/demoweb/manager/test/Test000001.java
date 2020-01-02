package com.example.demoweb.manager.test;

import com.example.demoweb.interfaces.test.Request000001;
import com.example.demoweb.interfaces.test.Response000001;
import com.example.demoweb.manager.PubServiceBase;
import org.springframework.stereotype.Component;

@Component
public class Test000001 extends PubServiceBase<Request000001, Response000001> {

    @Override
    protected Response000001 doBi(Request000001 request, Response000001 response) throws Exception {
       response.setTest("hello world!");
       return response;
    }
}
