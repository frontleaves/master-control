package com.frontleaves.mastercontrol.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.frontleaves.mastercontrol.mapper.RoleMapper;
import com.frontleaves.mastercontrol.model.entity.RoleDO;
import org.springframework.stereotype.Repository;

/**
 * 角色数据访问对象
 * <p>
 *     该类用于定义角色数据访问对象
 *     该类使用 {@link Repository} 注解标记
 *     @since v1.0.0
 *     @version v1.0.0
 *     @author FLASHLACK1314
 *
 */
@Repository
public class RoleDAO extends ServiceImpl<RoleMapper, RoleDO> implements IService<RoleDO> {
}
