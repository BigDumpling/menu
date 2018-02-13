package com.ligq.example.menu.mapper.menu;

import com.ligq.example.menu.model.menu.TbResource;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * class $classname
 *
 * @author ligq
 * @description
 * @date 2018/1/26, 19:24
 */
public interface MenuCustomMapper {

    @Select("SELECT id, code, name, type, url, icon_url, method, style, system_id, parent_id,order_no FROM tb_resource WHERE id = #{id}")
    TbResource findById(@Param("id") String id);
}
