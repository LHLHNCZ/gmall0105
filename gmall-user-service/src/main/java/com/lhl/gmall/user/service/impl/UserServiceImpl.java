package com.lhl.gmall.user.service.impl;
import com.alibaba.dubbo.config.annotation.Service;
import com.lhl.gmall.bean.UmsMember;
import com.lhl.gmall.bean.UmsMemberReceiveAddress;
import com.lhl.gmall.service.UserService;
import com.lhl.gmall.user.mapper.UmsNemberReceiveAddressMapper;
import com.lhl.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @Description:
 * @Author: lihailong
 * @CreateDate: 2019/10/2 12:45
 * @Version: 1.0.0
 */
@Service(interfaceClass =UserService.class)
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsNemberReceiveAddressMapper umsNemberReceiveAddressMapper;
    @Override
    public List<UmsMember> getAllUser() {


        return userMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByNemberId(String id) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(id);


        //return umsNemberReceiveAddressMapper.selectByExample(umsMemberReceiveAddress);
        Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId", id);
       // return umsNemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsNemberReceiveAddressMapper.selectByExample(example);
    }
}
