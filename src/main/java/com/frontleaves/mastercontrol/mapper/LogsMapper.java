package com.frontleaves.mastercontrol.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.frontleaves.mastercontrol.model.entity.LogsDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 日志映射器
 * <p>
 *     该类用于定义日志映射器。
 *     该类继承 {@link BaseMapper} 接口。
 * @author FLASHLACK1314
 */
@Mapper
public interface LogsMapper extends BaseMapper<LogsDO> {
}
