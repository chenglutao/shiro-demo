package com.study.repository.entity.generate;

import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_log.id
     *
     * @mbggenerated Fri Dec 27 20:06:40 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_log.user_name
     *
     * @mbggenerated Fri Dec 27 20:06:40 CST 2019
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_log.login_time
     *
     * @mbggenerated Fri Dec 27 20:06:40 CST 2019
     */
    private Date loginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_log.location
     *
     * @mbggenerated Fri Dec 27 20:06:40 CST 2019
     */
    private String location;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_log.ip
     *
     * @mbggenerated Fri Dec 27 20:06:40 CST 2019
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table login_log
     *
     * @mbggenerated Fri Dec 27 20:06:40 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_log.id
     *
     * @return the value of login_log.id
     *
     * @mbggenerated Fri Dec 27 20:06:40 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_log.id
     *
     * @param id the value for login_log.id
     *
     * @mbggenerated Fri Dec 27 20:06:40 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_log.user_name
     *
     * @return the value of login_log.user_name
     *
     * @mbggenerated Fri Dec 27 20:06:40 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_log.user_name
     *
     * @param userName the value for login_log.user_name
     *
     * @mbggenerated Fri Dec 27 20:06:40 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_log.login_time
     *
     * @return the value of login_log.login_time
     *
     * @mbggenerated Fri Dec 27 20:06:40 CST 2019
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_log.login_time
     *
     * @param loginTime the value for login_log.login_time
     *
     * @mbggenerated Fri Dec 27 20:06:40 CST 2019
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_log.location
     *
     * @return the value of login_log.location
     *
     * @mbggenerated Fri Dec 27 20:06:40 CST 2019
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_log.location
     *
     * @param location the value for login_log.location
     *
     * @mbggenerated Fri Dec 27 20:06:40 CST 2019
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_log.ip
     *
     * @return the value of login_log.ip
     *
     * @mbggenerated Fri Dec 27 20:06:40 CST 2019
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_log.ip
     *
     * @param ip the value for login_log.ip
     *
     * @mbggenerated Fri Dec 27 20:06:40 CST 2019
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_log
     *
     * @mbggenerated Fri Dec 27 20:06:40 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", location=").append(location);
        sb.append(", ip=").append(ip);
        sb.append("]");
        return sb.toString();
    }
}