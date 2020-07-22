package life.douknow.community.mapper;

import life.douknow.community.model.Question;

public interface QuestionExtMapper {
    int incView(Question record);
    int intCommentCount(Question record);
}