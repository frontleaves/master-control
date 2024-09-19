package com.frontleaves.mastercontrol.model.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.sql.Timestamp;

/**
 * Token数据对象
 * @since v1.0.0
 * @version v1.0.0
 * @author FLASHLACK1314
 */
@Data
@TableName("mc_token")
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class TokenDO {
    @TableId
    private String tokenUuid;
    private String userUuid;
    private Timestamp createdAt;
    private Timestamp expiredAt;
    private String clientIp;
    private String clientReferer;
    private String clientUserAgent;
}
