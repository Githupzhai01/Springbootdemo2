package com.example.mapper;

import com.example.entity.Playuser;
import com.example.entity.PlayuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlayuserMapper {
    int countByExample(PlayuserExample example);

    int deleteByExample(PlayuserExample example);

    int deleteByPrimaryKey(Integer playid);

    int insert(Playuser record);

    int insertSelective(Playuser record);

    List<Playuser> selectByExample(PlayuserExample example);

    Playuser selectByPrimaryKey(Integer playid);

    int updateByExampleSelective(@Param("record") Playuser record, @Param("example") PlayuserExample example);

    int updateByExample(@Param("record") Playuser record, @Param("example") PlayuserExample example);

    int updateByPrimaryKeySelective(Playuser record);

    int updateByPrimaryKey(Playuser record);
}