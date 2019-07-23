package com.chryl.mapper;

import com.chryl.po.GmUser;
import com.chryl.po.GmUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.function.Function;

public interface GmUserMapper {
    long countByExample(GmUserExample example);

    int deleteByExample(GmUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(GmUser record);

    int insertSelective(GmUser record);

    List<GmUser> selectByExample(GmUserExample example);

    GmUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") GmUser record, @Param("example") GmUserExample example);

    int updateByExample(@Param("record") GmUser record, @Param("example") GmUserExample example);

    int updateByPrimaryKeySelective(GmUser record);

    int updateByPrimaryKey(GmUser record);

    //    ##
    GmUser selectUserByUserName(@Param("userName") String userName);


}