package com.lhl.gmall.service;



import com.lhl.gmall.bean.UmsMember;
import com.lhl.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @Description:
 * @Author: lihailong
 * @CreateDate: 2019/10/2 12:44
 * @Version: 1.0.0
 */
public interface UserService {
    List<UmsMember> getAllUser();

   List<UmsMemberReceiveAddress> getReceiveAddressByNemberId(String id);
}
