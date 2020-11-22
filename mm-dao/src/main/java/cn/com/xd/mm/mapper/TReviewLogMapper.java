package cn.com.xd.mm.mapper;

import cn.com.xd.mm.pojo.TReviewLog;
import cn.com.xd.mm.pojo.TReviewLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TReviewLogMapper {
    long countByExample(TReviewLogExample example);

    int deleteByExample(TReviewLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TReviewLog record);

    int insertSelective(TReviewLog record);

    List<TReviewLog> selectByExample(TReviewLogExample example);

    TReviewLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TReviewLog record, @Param("example") TReviewLogExample example);

    int updateByExample(@Param("record") TReviewLog record, @Param("example") TReviewLogExample example);

    int updateByPrimaryKeySelective(TReviewLog record);

    int updateByPrimaryKey(TReviewLog record);
}