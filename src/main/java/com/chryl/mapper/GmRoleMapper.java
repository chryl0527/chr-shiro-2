package com.chryl.mapper;

import com.chryl.po.GmRole;
import com.chryl.po.GmRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GmRoleMapper {
    long countByExample(GmRoleExample example);

    int deleteByExample(GmRoleExample example);

    int deleteByPrimaryKey(String roleId);

    int insert(GmRole record);

    int insertSelective(GmRole record);

    List<GmRole> selectByExample(GmRoleExample example);

    GmRole selectByPrimaryKey(String roleId);

    int updateByExampleSelective(@Param("record") GmRole record, @Param("example") GmRoleExample example);

    int updateByExample(@Param("record") GmRole record, @Param("example") GmRoleExample example);

    int updateByPrimaryKeySelective(GmRole record);

    int updateByPrimaryKey(GmRole record);

    //    ##
    List<GmRole> finRoleByUserId(String userId);
}