package life.douknow.community.dto;

import life.douknow.community.model.User;
import lombok.Data;

@Data
public class QuestionDTO {
    private Integer id;
    private String title;
    private String description;
    private Integer creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private User user;
}
