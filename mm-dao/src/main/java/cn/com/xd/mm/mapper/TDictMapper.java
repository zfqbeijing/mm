package cn.com.xd.mm.mapper;

import cn.com.xd.mm.pojo.TDict;
import cn.com.xd.mm.pojo.TDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDictMapper {
    long countByExample(TDictExample example);

    int deleteByExample(TDictExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDict record);

    int insertSelective(TDict record);

    List<TDict> selectByExample(TDictExample example);

    TDict selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TDict record, @Param("example") TDictExample example);

    int updateByExample(@Param("record") TDict record, @Param("example") TDictExample example);

    int updateByPrimaryKeySelective(TDict record);

    int updateByPrimaryKey(TDict record);
}