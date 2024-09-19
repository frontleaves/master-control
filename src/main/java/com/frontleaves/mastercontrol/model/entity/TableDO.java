package com.frontleaves.mastercontrol.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.apache.ibatis.annotations.Mapper;

/**
 * 表实体
 * <p>
 * 该类用于定义表实体;
 * 该类使用 {@link Mapper} 注解标记;
 * @since v1.0.0
 * @version v1.0.0
 * @author FLASHLACK1314
 */
@Data
@TableName(value = "tables", schema = "information_schema")
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class TableDO {
    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private String tableType;
    private String selfReferencingColumnName;
    private String referenceGeneration;
    private String userDefinedTypeCatalog;
    private String userDefinedTypeSchema;
    private String userDefinedTypeName;
    private String isInsertableInto;
    private String isTyped;
    private String commitAction;
}
