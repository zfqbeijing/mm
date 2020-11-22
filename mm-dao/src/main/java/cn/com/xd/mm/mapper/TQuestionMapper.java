package cn.com.xd.mm.mapper;

import cn.com.xd.mm.pojo.TQuestion;
import cn.com.xd.mm.pojo.TQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TQuestionMapper {
    long countByExample(TQuestionExample example);

    int deleteByExample(TQuestionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TQuestion record);

    int insertSelective(TQuestion record);

    List<TQuestion> selectByExampleWithBLOBs(TQuestionExample example);

    List<TQuestion> selectByExample(TQuestionExample example);

    TQuestion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TQuestion record, @Param("example") TQuestionExample example);

    int updateByExampleWithBLOBs(@Param("record") TQuestion record, @Param("example") TQuestionExample example);

    int updateByExample(@Param("record") TQuestion record, @Param("example") TQuestionExample example);

    int updateByPrimaryKeySelective(TQuestion record);

    int updateByPrimaryKeyWithBLOBs(TQuestion record);

    int updateByPrimaryKey(TQuestion record);
}