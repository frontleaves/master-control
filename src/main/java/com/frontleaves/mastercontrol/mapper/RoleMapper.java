package com.frontleaves.mastercontrol.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.frontleaves.mastercontrol.model.entity.RoleDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色映射器
 * <p>
 *     该类用于定义角色映射器。
 *     该类继承 {@link BaseMapper} 接口。
 *     该类使用 {@link Mapper} 注解。
 * @author FLASHLACK1314
 */
@Mapper
public interface RoleMapper extends BaseMapper<RoleDO> {
}
