package com.ligq.example.menu.model.ebyf;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_menu_system")
public class TMenuSystem {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 系统名称
     */
    private String name;

    /**
     * 系统编码
     */
    private String code;

    /**
     * 系统描述
     */
    private String description;

    /**
     * 系统logo图片url地址
     */
    @Column(name = "logo_url")
    private String logoUrl;

    /**
     * 系统首页url地址
     */
    @Column(name = "index_url")
    private String indexUrl;

    /**
     * 登录回调地址
     */
    @Column(name = "login_callback_url")
    private String loginCallbackUrl;

    /**
     * 系统状态(在用：1；停用：0)
     */
    private Boolean status;

    /**
     * 排序
     */
    @Column(name = "order_no")
    private Integer orderNo;

    /**
     * 创建者
     */
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改者
     */
    private String modifier;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取系统名称
     *
     * @return name - 系统名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置系统名称
     *
     * @param name 系统名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取系统编码
     *
     * @return code - 系统编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置系统编码
     *
     * @param code 系统编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取系统描述
     *
     * @return description - 系统描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置系统描述
     *
     * @param description 系统描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取系统logo图片url地址
     *
     * @return logo_url - 系统logo图片url地址
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * 设置系统logo图片url地址
     *
     * @param logoUrl 系统logo图片url地址
     */
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    /**
     * 获取系统首页url地址
     *
     * @return index_url - 系统首页url地址
     */
    public String getIndexUrl() {
        return indexUrl;
    }

    /**
     * 设置系统首页url地址
     *
     * @param indexUrl 系统首页url地址
     */
    public void setIndexUrl(String indexUrl) {
        this.indexUrl = indexUrl;
    }

    /**
     * 获取登录回调地址
     *
     * @return login_callback_url - 登录回调地址
     */
    public String getLoginCallbackUrl() {
        return loginCallbackUrl;
    }

    /**
     * 设置登录回调地址
     *
     * @param loginCallbackUrl 登录回调地址
     */
    public void setLoginCallbackUrl(String loginCallbackUrl) {
        this.loginCallbackUrl = loginCallbackUrl;
    }

    /**
     * 获取系统状态(在用：1；停用：0)
     *
     * @return status - 系统状态(在用：1；停用：0)
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置系统状态(在用：1；停用：0)
     *
     * @param status 系统状态(在用：1；停用：0)
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取排序
     *
     * @return order_no - 排序
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**
     * 设置排序
     *
     * @param orderNo 排序
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取创建者
     *
     * @return creator - 创建者
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator 创建者
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改者
     *
     * @return modifier - 修改者
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 设置修改者
     *
     * @param modifier 修改者
     */
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}