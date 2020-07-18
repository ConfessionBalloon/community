package life.douknow.community.mapper;

import life.douknow.community.model.Question;
import life.douknow.community.model.QuestionExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface QuestionExtMapper {
    int IncView(Question record);
}