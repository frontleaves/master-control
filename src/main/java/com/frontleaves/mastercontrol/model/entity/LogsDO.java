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
 * 日志数据对象
 * @since v1.0.0
 * @version v1.0.0
 * @author FLASHLACK1314
 */
@Data
@TableName("mc_logs")
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class LogsDO {
    /**
     * 日志UUID
     */
    @TableId(type = IdType.ASSIGN_UUID)
    private String logUuid;
    /**
     * 日志类型
     */
    private Short type;
    /**
     * 业务
     */
    private String business;
    /**
     * 用户
     */
    private String user;
    /**
     * 值
     */
    private String value;
    /**
     * 创建时间
     */
    private Timestamp createdAt;
}
