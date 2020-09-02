package com.lhl.gmall.user.mapper;

import com.lhl.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Description:
 * @Author: lihailong
 * @CreateDate: 2019/10/2 12:47
 * @Version: 1.0.0
 */
public interface UserMapper extends Mapper<UmsMember> {
    List<UmsMember> selectAllUser();
}
