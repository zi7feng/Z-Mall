package com.fzq.userservice.common;

import java.util.List;

public class PageResponse<T> {
    private long total;
    private List<T> records;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }
}

