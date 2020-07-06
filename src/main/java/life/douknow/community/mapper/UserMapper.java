package life.douknow.community.mapper;

import life.douknow.community.model.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    @Insert("INSERT INTO USER (ACCOUNT_ID, NAME, TOKEN, GMT_CREATE, GMT_MODIFIED, BIO, AVATAR_URL) VALUES (#{accountId}, #{name}, #{token}, #{gmtCreate}, #{gmtModified}, #{bio}, #{avatarUrl})")
    void insert(User user);

    @Select("SELECT * FROM USER WHERE TOKEN = #{token}")
    User findByToken(@Param("token") String token);

    @Select("SELECT * FROM USER WHERE id = #{id}")
    User findByID(@Param("id") Integer id);

    @Select("SELECT * FROM USER WHERE ACCOUNT_ID = #{accountId}")
    User findByAccountId(@Param("accountId") String accountId);

    @Update("UPDATE USER SET NAME = #{name}, TOKEN = #{token}, GMT_MODIFIED = #{gmtModified}, BIO = #{bio}, AVATAR_URL = #{avatarUrl} WHERE ACCOUNT_ID = #{accountId}")
    void update(User user);
}
