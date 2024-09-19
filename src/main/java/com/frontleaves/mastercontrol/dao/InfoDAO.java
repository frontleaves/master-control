package com.frontleaves.mastercontrol.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.frontleaves.mastercontrol.mapper.InfoMapper;
import com.frontleaves.mastercontrol.model.entity.InfoDO;
import org.springframework.stereotype.Repository;

/**
 * 信息数据访问对象
 * <p>
 *     该类用于定义信息数据访问对象
 *     该类使用 {@link Repository} 注解标记
 *     @since v1.0.0
 *     @version v1.0.0
 *     @author FLASHLACK1314
 */
@Repository
public class InfoDAO extends ServiceImpl<InfoMapper, InfoDO> implements IService<InfoDO> {
}
