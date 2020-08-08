package life.douknow.community.mapper;

import life.douknow.community.model.Comment;


public interface CommentExtMapper {
    int incCommentCount(Comment record);
}