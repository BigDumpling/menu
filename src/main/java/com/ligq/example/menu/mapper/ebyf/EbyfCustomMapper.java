package com.ligq.example.menu.mapper.ebyf;

import com.ligq.example.menu.model.ebyf.TMenuRoleResource;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

/**
 * class $classname
 *
 * @author ligq
 * @description
 * @date 2018/1/26, 19:45
 */
public interface EbyfCustomMapper {

    @Insert("INSERT INTO t_menu_role_resource (role_id, resource_id) VALUES (#{roleId,jdbcType=VARCHAR}, #{resourceId,jdbcType=VARCHAR})")
    @Options(useGeneratedKeys = true, keyColumn = "id")
    int insert(TMenuRoleResource t);
}
