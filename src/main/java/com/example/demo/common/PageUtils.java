package com.example.demo.common;

import java.io.Serializable;
import java.util.List;

/**
 * 分页工具类
 *
 * @author caohr
 */
public class PageUtils implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 请求状态
     */
    private int result = 0;


    /**
     * 状态信息
     */
    private String msg = "SUCCESS";

    /**
     * 总记录数
     */
    private int totalCount;
    /**
     * 每页记录数
     */
    private int pageSize;
    /**
     * 总页数
     */
    private int totalPage;
    /**
     * 当前页数
     */
    private int currPage;
    /**
     * 列表数据
     */
    private List<?> rows;

    /**
     * 分页
     * @param rows        列表数据
     * @param totalCount  总记录数
     * @param pageSize    每页记录数
     * @param currPage    当前页数
     */
    public PageUtils(List<?> rows, int totalCount, int pageSize, int currPage) {
        this.rows = rows;
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        this.currPage = currPage;
        this.totalPage = (int)Math.ceil((double)totalCount/pageSize);
    }


    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> records) {
        this.rows = rows;
    }

}