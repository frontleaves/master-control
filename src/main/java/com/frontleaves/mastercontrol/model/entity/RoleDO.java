package com.frontleaves.mastercontrol.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.sql.Timestamp;

/**
 * 角色数据对象
 * @since v1.0.0
 * @version v1.0.0
 * @author FLASHLACK1314
 */
@Data
@TableName("mc_role")
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class RoleDO {
    /**
     * 用户角色表主键
     */
    @TableId(type = IdType.NONE)
    private String roleUuid;
    /**
     * 用户角色表名称
     */
    private String name;
    /**
     * 用户角色表显示名称
     */
    private String displayName;
    /**
     * 用户角色表描述
     */
    private String roleDesc;
    /**
     * 用户角色表创建时间
     */
    private Timestamp createdAt;
}
