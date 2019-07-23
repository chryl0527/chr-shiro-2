package com.chryl.mapper;

import com.chryl.po.GmFunction;
import com.chryl.po.GmFunctionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GmFunctionMapper {
    long countByExample(GmFunctionExample example);

    int deleteByExample(GmFunctionExample example);

    int deleteByPrimaryKey(String funId);

    int insert(GmFunction record);

    int insertSelective(GmFunction record);

    List<GmFunction> selectByExample(GmFunctionExample example);

    GmFunction selectByPrimaryKey(String funId);

    int updateByExampleSelective(@Param("record") GmFunction record, @Param("example") GmFunctionExample example);

    int updateByExample(@Param("record") GmFunction record, @Param("example") GmFunctionExample example);

    int updateByPrimaryKeySelective(GmFunction record);

    int updateByPrimaryKey(GmFunction record);

    //    ##
    List<GmFunction> findFunByUserId(@Param("userId") String userId);
}