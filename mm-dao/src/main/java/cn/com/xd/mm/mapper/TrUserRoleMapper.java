package cn.com.xd.mm.mapper;

import cn.com.xd.mm.pojo.TrUserRoleExample;
import cn.com.xd.mm.pojo.TrUserRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrUserRoleMapper {
    long countByExample(TrUserRoleExample example);

    int deleteByExample(TrUserRoleExample example);

    int deleteByPrimaryKey(TrUserRoleKey key);

    int insert(TrUserRoleKey record);

    int insertSelective(TrUserRoleKey record);

    List<TrUserRoleKey> selectByExample(TrUserRoleExample example);

    int updateByExampleSelective(@Param("record") TrUserRoleKey record, @Param("example") TrUserRoleExample example);

    int updateByExample(@Param("record") TrUserRoleKey record, @Param("example") TrUserRoleExample example);
}