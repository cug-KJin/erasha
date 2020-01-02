package com.example.demoweb.manager;

import com.example.demoweb.common.exception.ErrorException;
import com.example.demoweb.interfaces.RequestHeader;
import com.example.demoweb.interfaces.ResponseHeader;
import org.springframework.stereotype.Component;

@Component
public abstract class PubServiceBase<R extends RequestHeader,P extends ResponseHeader>{
    protected abstract P doBi(R request,P response) throws Exception;
    public P doMain(R request,P response){
        try{
            response = this.doBi(request,response);
            if (null == response){
                response= (P) new ResponseHeader();
            }
            response.setErrorCode("0000");
            response.setErrorMgs("操作成功！");
        }catch(Exception| Error e){
            if (null == response){
                response= (P) new ResponseHeader();
            }
           if (e instanceof ErrorException){
               if ("".equals(((ErrorException) e).getErrorCode())){
                   response.setErrorCode("9998");
                   response.setErrorMgs(((ErrorException) e).getErrorMsg());
               }
               response.setErrorCode(((ErrorException) e).getErrorCode());
               response.setErrorMgs(((ErrorException) e).getErrorMsg());
           }else {
               response.setErrorCode("9998");
               response.setErrorMgs("系统错误!");
           }
        }finally {
            return (P) response;
        }
    }


}
