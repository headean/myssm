package com.maven.util;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: EasyUI DataGrid 返回 json 封装
 *              total:总记录数
 *              rows:数据集合
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2019-12-18 22:59
 */
public class DataGrid {
    private Long total;
    private List<?> rows;
    protected Boolean success;

    public Long getTotal() {
        return total;
    }

    public DataGrid setTotal(Long total) {
        this.total = total;
        return this;
    }

    public List<?> getRows() {
        return rows;
    }

    public DataGrid setRows(List<?> rows) {
        this.rows = rows;
        return this;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "DataGrid [total=" + total + ", rows=" + rows + "]";
    }

}
