package com.example.demoweb.common.utils;

import com.example.demoweb.common.exception.ErrorException;
import com.example.demoweb.manager.PubServiceBase;
import com.example.demoweb.interfaces.RequestHeader;
import com.example.demoweb.interfaces.ResponseHeader;
import org.springframework.stereotype.Component;

@Component
public class ControllerUtils {
    PubServiceBase<RequestHeader, ResponseHeader> pubServiceBase;
    RequestHeader request;
    ResponseHeader response;
    public String exec(String headServiceCode,String prefix,String param){
        pubServiceBase = (PubServiceBase<RequestHeader, ResponseHeader>)SpringUtils.getBean(prefix+headServiceCode);
        try {
            if (null == pubServiceBase){
                throw new ErrorException("system_0001","服务码不存在！");
            }
            request = (RequestHeader)JacksonUtils.jsonToBean(param,Class.forName("com.example.demoweb.interfaces."+prefix+".Request"+headServiceCode));
            response = (ResponseHeader)Class.forName("com.example.demoweb.interfaces."+prefix+".Response"+headServiceCode).newInstance();
            if (!headServiceCode.equals(request.getHeadServiceCode())){
                throw new ErrorException("system_0002","报文格式错误！");
            }
        }catch (ErrorException e) {
            response.setErrorCode(e.getErrorCode());
            response.setErrorMgs(e.getErrorMsg());
            response.setResponseDateTime(CalendarUtils.getDateTime());
            return JacksonUtils.toJson(response);
        }catch (Exception e){
            response.setErrorCode("9998");
            response.setErrorMgs(e.toString());
            response.setResponseDateTime(CalendarUtils.getDateTime());
            return JacksonUtils.toJson(response);
        }
        response = pubServiceBase.doMain(request,response);
        response.setResponseDateTime(CalendarUtils.getDateTime());
        return JacksonUtils.toJson(response);
    }
}
