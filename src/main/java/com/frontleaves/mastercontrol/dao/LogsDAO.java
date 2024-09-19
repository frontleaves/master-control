package com.frontleaves.mastercontrol.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.frontleaves.mastercontrol.mapper.LogsMapper;
import com.frontleaves.mastercontrol.model.entity.LogsDO;
import org.springframework.stereotype.Repository;

/**
 * 日志数据访问对象
 * <p>
 *     该类用于定义日志数据访问对象
 *     该类使用 {@link Repository} 注解标记
 *     @since v1.0.0
 *     @version v1.0.0
 *     @author FLASHLACK1314
 */
@Repository
public class LogsDAO extends ServiceImpl<LogsMapper, LogsDO> implements IService<LogsDO> {
}
