package life.douknow.community.mapper;

import life.douknow.community.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Insert;

@Mapper
public interface UserMapper {
    @Insert("INSERT INTO USER (ACCOUNT_ID, NAME, TOKEN, GMT_CREATE, GMT_MODIFIED) VALUES (#{accountId}, #{name}, #{token}, #{gmtCreate}, #{gmtModified})")
    void insert(User user);
}
