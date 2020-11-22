package cn.com.xd.mm.mapper;

import cn.com.xd.mm.pojo.TrMemberQuestion;
import cn.com.xd.mm.pojo.TrMemberQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrMemberQuestionMapper {
    long countByExample(TrMemberQuestionExample example);

    int deleteByExample(TrMemberQuestionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TrMemberQuestion record);

    int insertSelective(TrMemberQuestion record);

    List<TrMemberQuestion> selectByExample(TrMemberQuestionExample example);

    TrMemberQuestion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TrMemberQuestion record, @Param("example") TrMemberQuestionExample example);

    int updateByExample(@Param("record") TrMemberQuestion record, @Param("example") TrMemberQuestionExample example);

    int updateByPrimaryKeySelective(TrMemberQuestion record);

    int updateByPrimaryKey(TrMemberQuestion record);
}