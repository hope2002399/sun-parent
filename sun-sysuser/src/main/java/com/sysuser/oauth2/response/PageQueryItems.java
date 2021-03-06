package com.sysuser.oauth2.response;

import lombok.Data;

import java.util.List;

/**
 * @author lijinsheng
 * @date  2018/8/6 15:56
 *
 **/
@Data
public class PageQueryItems {

    private Integer currentPage;
    private Integer pageSize;
    private Long count;
    private List items;

    public PageQueryItems(Integer currentPage, Integer pageSize, Long count, List items) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.count = count;
        this.items = items;
    }

    public PageQueryItems() {
    }
}
