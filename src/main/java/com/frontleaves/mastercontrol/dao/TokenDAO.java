package com.frontleaves.mastercontrol.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.frontleaves.mastercontrol.mapper.TokenMapper;
import com.frontleaves.mastercontrol.model.entity.TokenDO;
import org.springframework.stereotype.Repository;

/**
 * Token数据访问对象
 * <p>
 *     该类用于定义Token数据访问对象
 *     该类使用 {@link Repository} 注解标记
 *     @since v1.0.0
 *     @version v1.0.0
 *     @author FLASHLACK1314
 *
 */
@Repository
public class TokenDAO extends ServiceImpl<TokenMapper, TokenDO> implements IService<TokenDO> {
}
