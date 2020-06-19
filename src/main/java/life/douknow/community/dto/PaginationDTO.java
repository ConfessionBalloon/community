package life.douknow.community.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PaginationDTO {
    private List<QuestionDTO> questions;
    private boolean showPrevious;
    private boolean showFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer page;
    private List<Integer> pages = new ArrayList<>();
    private Integer totalPage;

    public void setPagination(Integer totalPage, Integer page) {
        this.totalPage = totalPage;
        this.page = page;
        pages.add(page);
        if (page == 1) {
            showPrevious = false;
        } else {
            showPrevious = true;
        }

        if (page == totalPage) {
            showNext = false;
        } else {
            showNext = true;
        }

        if (page - 3 <= 1) {
            showFirstPage = false;
        } else {
            showFirstPage = true;
        }

        if (page + 3 >= totalPage) {
            showEndPage = false;
        } else {
            showEndPage = true;
        }

        for (int i = 1; i <= 3; i++) {
            int head = page - i;
            int foot = page + i;
            if (head >= 1) {
                pages.add(0, head);
            }
            if (foot <= totalPage) {
                pages.add(foot);
            }
        }
    }
}
