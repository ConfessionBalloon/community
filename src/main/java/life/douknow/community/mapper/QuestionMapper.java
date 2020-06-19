package life.douknow.community.mapper;

import life.douknow.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionMapper {
    @Insert("insert into question(title, description, creator, tag, GMT_CREATE, GMT_MODIFIED) values(#{title}, #{description}, #{creator}, #{tag}, #{gmtCreate}, #{gmtModified})")
    public void create(Question question);

    @Select("SELECT * FROM QUESTION LIMIT #{offset}, #{size}")
    List<Question> list(@Param(value = "offset") Integer offset, @Param(value = "size") Integer size);

    @Select("SELECT count(1) FROM QUESTION")
    Integer count();

    @Select("SELECT * FROM QUESTION WHERE CREATOR=#{userId} LIMIT #{offset}, #{size}")
    List<Question> listByUserId(@Param(value = "userId") Integer userId, @Param(value = "offset") Integer offset, @Param(value = "size") Integer size);

    @Select("SELECT count(1) FROM QUESTION WHERE CREATOR=#{userId}")
    Integer countByUserId(@Param(value = "userId") Integer userId);
}
