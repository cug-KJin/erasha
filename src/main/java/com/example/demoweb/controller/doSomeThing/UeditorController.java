package com.example.demoweb.controller.doSomeThing;

import com.example.demoweb.common.pojo.PublicMsg;
import com.example.demoweb.common.pojo.Ueditor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
public class UeditorController {
    @RequestMapping("/")
    private String showPage(){
        return "index";
    }

    @RequestMapping(value="/ueditor")
    @ResponseBody
    public String ueditor(HttpServletRequest request) {

        return PublicMsg.UEDITOR_CONFIG;
    }

    @RequestMapping(value="/imgUpload")
    @ResponseBody
    public Ueditor imgUpload(MultipartFile upfile) {
        log.info(upfile.getName());
        log.info(upfile.getOriginalFilename());
        log.info(String.valueOf(upfile.getSize()));
        log.info(String.valueOf(upfile.getResource()));
        Ueditor ueditor = new Ueditor();
        return ueditor;
    }
}
