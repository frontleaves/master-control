package com.frontleaves.mastercontrol.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.frontleaves.mastercontrol.mapper.TableMapper;
import com.frontleaves.mastercontrol.model.entity.TableDO;
import org.springframework.stereotype.Repository;

/**
 * 表数据访问对象
 * <p>
 * 该类用于定义表数据访问对象;
 * 该类使用 {@link Repository} 注解标记;
 * @author FLASHLACK1314
 */
@Repository
public class TableDAO extends ServiceImpl<TableMapper, TableDO> implements IService<TableDO> {

}
