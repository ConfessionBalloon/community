package life.douknow.community.mapper;

import life.douknow.community.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Insert("INSERT INTO USER (ACCOUNT_ID, NAME, TOKEN, GMT_CREATE, GMT_MODIFIED, BIO, AVATAR_URL) VALUES (#{accountId}, #{name}, #{token}, #{gmtCreate}, #{gmtModified}, #{bio}, #{avatarUrl})")
    void insert(User user);

    @Select("SELECT * FROM USER WHERE TOKEN = #{token}")
    User findByToken(@Param("token") String token);

    @Select("SELECT * FROM USER WHERE id = #{id}")
    User findByID(@Param("id") Integer id);

}
