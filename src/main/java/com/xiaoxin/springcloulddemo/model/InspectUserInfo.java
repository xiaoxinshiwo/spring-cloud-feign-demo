package com.xiaoxin.springcloulddemo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class InspectUserInfo {
    /**
     * id
     */
    private Integer id;

    /**
     * 验房师名字
     */
    private String name;

    /**
     * 头像地址
     */
    private String headSrc;

    /**
     * 0验房师 1监理师
     */
    private Integer type;

    /**
     * 验房师级别 1初级 2中级 3高级
     *   监理师级别 1铜牌 2银牌 3金牌
     */
    private Integer level;

    private String tel;

    /**
     * 起始工作年份
     */
    @DateTimeFormat(pattern = "yyyy")
    @JsonFormat(pattern="yyyy",timezone="GMT+8")
    private Date beginDate;

    /**
     * 公司
     */
    private String company;

    /**
     * 范围
     */
    private String ranges;

    /**
     * 简介
     */
    private String summary;

    /**
     * 资质证书
     */
    private String credentials;

    /**
     * 说明
     */
    private String remark;

    /**
     * 是否删除0否 1是
     */
    private Integer isDelete;

    /**
     * 创建日期
     */
    private Date createDate;

    /**
     * 创建用户id
     */
    private String createUserId;

    /**
     * 更新日期
     */
    private Date updateDate;

    /**
     * 更新用户id
     */
    private String updateUserId;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取验房师名字
     *
     * @return name - 验房师名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置验房师名字
     *
     * @param name 验房师名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取头像地址
     *
     * @return head_src - 头像地址
     */
    public String getHeadSrc() {
        return headSrc;
    }

    /**
     * 设置头像地址
     *
     * @param headSrc 头像地址
     */
    public void setHeadSrc(String headSrc) {
        this.headSrc = headSrc;
    }

    /**
     * 获取0验房师 1监理师
     *
     * @return type - 0验房师 1监理师
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置0验房师 1监理师
     *
     * @param type 0验房师 1监理师
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取验房师级别 1初级 2中级 3高级
监理师级别 1铜牌 2银牌 3金牌
     *
     * @return level - 验房师级别 1初级 2中级 3高级
监理师级别 1铜牌 2银牌 3金牌
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置验房师级别 1初级 2中级 3高级
监理师级别 1铜牌 2银牌 3金牌
     *
     * @param level 验房师级别 1初级 2中级 3高级
监理师级别 1铜牌 2银牌 3金牌
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取起始工作年份
     *
     * @return begin_date - 起始工作年份
     */
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * 设置起始工作年份
     *
     * @param beginDate 起始工作年份
     */
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * 获取公司
     *
     * @return company - 公司
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置公司
     *
     * @param company 公司
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 获取范围
     *
     * @return ranges - 范围
     */
    public String getRanges() {
        return ranges;
    }

    /**
     * 设置范围
     *
     * @param ranges 范围
     */
    public void setRanges(String ranges) {
        this.ranges = ranges;
    }

    /**
     * 获取简介
     *
     * @return summary - 简介
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置简介
     *
     * @param summary 简介
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 获取资质证书
     *
     * @return credentials - 资质证书
     */
    public String getCredentials() {
        return credentials;
    }

    /**
     * 设置资质证书
     *
     * @param credentials 资质证书
     */
    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    /**
     * 获取说明
     *
     * @return remark - 说明
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置说明
     *
     * @param remark 说明
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取是否删除0否 1是
     *
     * @return is_delete - 是否删除0否 1是
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除0否 1是
     *
     * @param isDelete 是否删除0否 1是
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取创建日期
     *
     * @return create_date - 创建日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建日期
     *
     * @param createDate 创建日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取创建用户id
     *
     * @return create_user_id - 创建用户id
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建用户id
     *
     * @param createUserId 创建用户id
     */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取更新日期
     *
     * @return update_date - 更新日期
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置更新日期
     *
     * @param updateDate 更新日期
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取更新用户id
     *
     * @return update_user_id - 更新用户id
     */
    public String getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 设置更新用户id
     *
     * @param updateUserId 更新用户id
     */
    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}