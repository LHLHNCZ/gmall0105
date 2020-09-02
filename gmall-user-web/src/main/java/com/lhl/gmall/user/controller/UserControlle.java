package com.lhl.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lhl.gmall.bean.UmsMember;
import com.lhl.gmall.bean.UmsMemberReceiveAddress;
import com.lhl.gmall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description:
 * @Author: lihailong
 * @CreateDate: 2019/10/2 12:43
 * @Version: 1.0.0
 */
@Controller
public class UserControlle {
    @Reference
    UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public  String index(){
        return "hello user";
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsNember = userService.getAllUser();
        return umsNember;
    }

    @RequestMapping("getReceiveAddressByNemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByNemberId(String id){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddress = userService.getReceiveAddressByNemberId(id);
        return umsMemberReceiveAddress;
    }
}
