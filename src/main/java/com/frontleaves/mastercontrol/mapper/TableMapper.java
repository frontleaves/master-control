package com.frontleaves.mastercontrol.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.frontleaves.mastercontrol.model.entity.TableDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 表映射器
 * @author FLASHLACK1314
 */
@Mapper
public interface TableMapper extends BaseMapper<TableDO> {
}
