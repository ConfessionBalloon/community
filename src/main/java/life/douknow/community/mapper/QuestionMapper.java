package life.douknow.community.mapper;

import life.douknow.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QuestionMapper {
    @Insert("insert into question(title, description, creator, tag, GMT_CREATE, GMT_MODIFIED) values(#{title}, #{description}, #{creator}, #{tag}, #{gmtCreate}, #{gmtModified})")
    public void create(Question question);

}
