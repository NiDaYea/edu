package cn.tcmp.first.dao;

import cn.tcmp.first.entity.Answer;
import cn.tcmp.first.entity.Topic;
import cn.tcmp.first.entity.Wrong;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WrongMapper {

    //添加错题
    @Insert("INSERT INTO Wrong VALUE(#{wrongId},#{userId},#{topicId})")
    Integer saveWrong(Wrong wrong);

    //根据用户id和题目id删除错题
    @Delete("delete from Wrong where userId=#{userId} and topicId=#{topicId}")
    Integer delWrong(Wrong wrong);

    //根据用户id查询所有错题
    List<Topic> queryAll(@Param("userId") Integer userId,@Param("topicCode") Integer topicCode);
}
