package com.ligq.example.menu.model.menu;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_resource")
public class TbResource {
    /**
     * 主键
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 资源代码
     */
    private String code;

    /**
     * 资源名称
     */
    private String name;

    /**
     * 描述信息
     */
    private String description;

    /**
     * 资源类型(菜单：MENU，页面：UI，动作：ACTION)
     */
    private String type;

    /**
     * 资源URL地址
     */
    private String url;

    /**
     * 图标URL
     */
    @Column(name = "icon_url")
    private String iconUrl;

    /**
     * 请求资源的方法
     */
    private String method;

    /**
     * 资源风格(REST/RPC)
     */
    private String style;

    /**
     * 资源匹配模式(完全匹配：COMPLETE，贪婪匹配：GREEDY，谨慎匹配：CAUTIOUS)
     */
    @Column(name = "match_kind")
    private String matchKind;

    /**
     * 所属系统ID
     */
    @Column(name = "system_id")
    private String systemId;

    /**
     * 父资源ID
     */
    @Column(name = "parent_id")
    private String parentId;

    /**
     * 方法参数名称，如果是资源风格是RPC时，方法是从url query string 或者表单域中获取的，该字段标识参数名称
     */
    @Column(name = "method_param_name")
    private String methodParamName;

    /**
     * 方法参数名称，如果是资源风格是RPC时，方法是从url query string 或者表单域中获取的，资源字段标识参数的值
     */
    @Column(name = "method_param_value")
    private String methodParamValue;

    /**
     * 状态(在用：1；停用：0)
     */
    private String status;

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
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 修改者
     */
    private String modifier;

    /**
     * 修改时间
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    private String memo;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取资源代码
     *
     * @return code - 资源代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置资源代码
     *
     * @param code 资源代码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取资源名称
     *
     * @return name - 资源名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置资源名称
     *
     * @param name 资源名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取描述信息
     *
     * @return description - 描述信息
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述信息
     *
     * @param description 描述信息
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取资源类型(菜单：MENU，页面：UI，动作：ACTION)
     *
     * @return type - 资源类型(菜单：MENU，页面：UI，动作：ACTION)
     */
    public String getType() {
        return type;
    }

    /**
     * 设置资源类型(菜单：MENU，页面：UI，动作：ACTION)
     *
     * @param type 资源类型(菜单：MENU，页面：UI，动作：ACTION)
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取资源URL地址
     *
     * @return url - 资源URL地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置资源URL地址
     *
     * @param url 资源URL地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取图标URL
     *
     * @return icon_url - 图标URL
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * 设置图标URL
     *
     * @param iconUrl 图标URL
     */
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    /**
     * 获取请求资源的方法
     *
     * @return method - 请求资源的方法
     */
    public String getMethod() {
        return method;
    }

    /**
     * 设置请求资源的方法
     *
     * @param method 请求资源的方法
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * 获取资源风格(REST/RPC)
     *
     * @return style - 资源风格(REST/RPC)
     */
    public String getStyle() {
        return style;
    }

    /**
     * 设置资源风格(REST/RPC)
     *
     * @param style 资源风格(REST/RPC)
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * 获取资源匹配模式(完全匹配：COMPLETE，贪婪匹配：GREEDY，谨慎匹配：CAUTIOUS)
     *
     * @return match_kind - 资源匹配模式(完全匹配：COMPLETE，贪婪匹配：GREEDY，谨慎匹配：CAUTIOUS)
     */
    public String getMatchKind() {
        return matchKind;
    }

    /**
     * 设置资源匹配模式(完全匹配：COMPLETE，贪婪匹配：GREEDY，谨慎匹配：CAUTIOUS)
     *
     * @param matchKind 资源匹配模式(完全匹配：COMPLETE，贪婪匹配：GREEDY，谨慎匹配：CAUTIOUS)
     */
    public void setMatchKind(String matchKind) {
        this.matchKind = matchKind;
    }

    /**
     * 获取所属系统ID
     *
     * @return system_id - 所属系统ID
     */
    public String getSystemId() {
        return systemId;
    }

    /**
     * 设置所属系统ID
     *
     * @param systemId 所属系统ID
     */
    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    /**
     * 获取父资源ID
     *
     * @return parent_id - 父资源ID
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置父资源ID
     *
     * @param parentId 父资源ID
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取方法参数名称，如果是资源风格是RPC时，方法是从url query string 或者表单域中获取的，该字段标识参数名称
     *
     * @return method_param_name - 方法参数名称，如果是资源风格是RPC时，方法是从url query string 或者表单域中获取的，该字段标识参数名称
     */
    public String getMethodParamName() {
        return methodParamName;
    }

    /**
     * 设置方法参数名称，如果是资源风格是RPC时，方法是从url query string 或者表单域中获取的，该字段标识参数名称
     *
     * @param methodParamName 方法参数名称，如果是资源风格是RPC时，方法是从url query string 或者表单域中获取的，该字段标识参数名称
     */
    public void setMethodParamName(String methodParamName) {
        this.methodParamName = methodParamName;
    }

    /**
     * 获取方法参数名称，如果是资源风格是RPC时，方法是从url query string 或者表单域中获取的，资源字段标识参数的值
     *
     * @return method_param_value - 方法参数名称，如果是资源风格是RPC时，方法是从url query string 或者表单域中获取的，资源字段标识参数的值
     */
    public String getMethodParamValue() {
        return methodParamValue;
    }

    /**
     * 设置方法参数名称，如果是资源风格是RPC时，方法是从url query string 或者表单域中获取的，资源字段标识参数的值
     *
     * @param methodParamValue 方法参数名称，如果是资源风格是RPC时，方法是从url query string 或者表单域中获取的，资源字段标识参数的值
     */
    public void setMethodParamValue(String methodParamValue) {
        this.methodParamValue = methodParamValue;
    }

    /**
     * 获取状态(在用：1；停用：0)
     *
     * @return status - 状态(在用：1；停用：0)
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态(在用：1；停用：0)
     *
     * @param status 状态(在用：1；停用：0)
     */
    public void setStatus(String status) {
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
     * @return gmt_create - 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间
     *
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
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
     * @return gmt_modified - 修改时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置修改时间
     *
     * @param gmtModified 修改时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param memo
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }
}