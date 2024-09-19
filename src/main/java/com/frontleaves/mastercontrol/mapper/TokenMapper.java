package com.frontleaves.mastercontrol.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.frontleaves.mastercontrol.model.entity.TokenDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * Token映射器
 * <p>
 * 该类用于定义Token映射器。
 * 该类继承 {@link BaseMapper} 接口。
 * 该类使用 {@link Mapper} 注解。
 *
 * @author FLASHLACK1314
 * @version v1.0.0
 * @since v1.0.0
 */
@Mapper
public interface TokenMapper extends BaseMapper<TokenDO> {
}
