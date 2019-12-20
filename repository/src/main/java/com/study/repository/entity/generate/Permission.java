package com.study.repository.entity.generate;

import java.io.Serializable;

public class Permission implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.id
     *
     * @mbggenerated Thu Dec 19 17:04:27 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.name
     *
     * @mbggenerated Thu Dec 19 17:04:27 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.remark
     *
     * @mbggenerated Thu Dec 19 17:04:27 CST 2019
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table permission
     *
     * @mbggenerated Thu Dec 19 17:04:27 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.id
     *
     * @return the value of permission.id
     * @mbggenerated Thu Dec 19 17:04:27 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.id
     *
     * @param id the value for permission.id
     * @mbggenerated Thu Dec 19 17:04:27 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.name
     *
     * @return the value of permission.name
     * @mbggenerated Thu Dec 19 17:04:27 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.name
     *
     * @param name the value for permission.name
     * @mbggenerated Thu Dec 19 17:04:27 CST 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.remark
     *
     * @return the value of permission.remark
     * @mbggenerated Thu Dec 19 17:04:27 CST 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.remark
     *
     * @param remark the value for permission.remark
     * @mbggenerated Thu Dec 19 17:04:27 CST 2019
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission
     *
     * @mbggenerated Thu Dec 19 17:04:27 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}