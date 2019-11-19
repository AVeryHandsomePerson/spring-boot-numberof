package com.cn.ben.controller;

import com.cn.ben.utile.CheckUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Auther: ljh
 * @Date: 2019/10/23 22:43
 * @Description:
 */
public class WexinController {
    @RequestMapping(value="/wexin" ,method=RequestMethod.GET)
    protected void get(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // get方法主要处理公众号接入部分
        String signature=request.getParameter("signature");
        String timestamp=request.getParameter("timestamp");
        String nonce=request.getParameter("nonce");
        String echostr=request.getParameter("echostr");
        PrintWriter pWriter=response.getWriter();
        if(CheckUtil.checkSignature(signature, timestamp, nonce)) {
            pWriter.print(echostr);
            pWriter.close();
        }
    }
    @RequestMapping(value="/wexin" ,method= RequestMethod.POST)
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //post方法 主要处理 一切消息的地方
//        比如文本消息 这个后面讲

    }

}
