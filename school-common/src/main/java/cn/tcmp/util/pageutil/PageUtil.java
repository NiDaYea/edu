package cn.tcmp.util.pageutil;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2019/8/9/009.
 */
public class PageUtil<T> implements Serializable{
    private Integer pageNo;
    private Integer pageSize;
    private Integer totalPageCount;
    private List<T> list;
    //所有导航页号
    private int[] navigatepageNums;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(Integer totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int[] getNavigatepageNums() {
        return navigatepageNums;
    }

    public void setNavigatepageNums(int[] navigatepageNums) {
        this.navigatepageNums = navigatepageNums;
    }
}
