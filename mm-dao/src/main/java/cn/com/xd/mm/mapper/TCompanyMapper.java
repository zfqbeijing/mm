package cn.com.xd.mm.mapper;

import cn.com.xd.mm.pojo.TCompany;
import cn.com.xd.mm.pojo.TCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCompanyMapper {
    long countByExample(TCompanyExample example);

    int deleteByExample(TCompanyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCompany record);

    int insertSelective(TCompany record);

    List<TCompany> selectByExample(TCompanyExample example);

    TCompany selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCompany record, @Param("example") TCompanyExample example);

    int updateByExample(@Param("record") TCompany record, @Param("example") TCompanyExample example);

    int updateByPrimaryKeySelective(TCompany record);

    int updateByPrimaryKey(TCompany record);
}