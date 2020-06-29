package com.wang.dto;

import lombok.Data;

import javax.persistence.*;
@Data
public class Dept {
    @Id
    @Column(name = "deptNo")
    private Long deptno;

    @Column(name = "dName")
    private String dname;

    @Column(name = "db_source")
    private String dbSource;

    /**
     * @return deptNo
     */
    public Long getDeptno() {
        return deptno;
    }

    /**
     * @param deptno
     */
    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    /**
     * @return dName
     */
    public String getDname() {
        return dname;
    }

    /**
     * @param dname
     */
    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    /**
     * @return db_source
     */
    public String getDbSource() {
        return dbSource;
    }

    /**
     * @param dbSource
     */
    public void setDbSource(String dbSource) {
        this.dbSource = dbSource == null ? null : dbSource.trim();
    }
}