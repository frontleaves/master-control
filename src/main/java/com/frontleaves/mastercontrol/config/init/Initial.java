/*
 * ***************************************************************************************
 * company: FrontLeaves Technology Co,.Ltd.
 * author: XiaoLFeng(https://www.x-lf.com) | FLASHLACK | fanfan187
 * about:
 *   The project contains the source code of com.frontleaves.master-control.
 *   All source code for this project is licensed under the Apache License 2.0 open source
 *     license.
 * licenseStatement:
 *   Copyright (c) 2023-2024 FrontLeaves Technology Co,.Ltd. All rights reserved.
 *   For more information about the ApacheLicense-2.0 license, please view the LICENSE file
 *     in the project root directory or visit:
 *   https://opensource.org/license/apache-2-0
 * disclaimer:
 *   Since this project is in the model design stage, we are not responsible for any losses
 *     caused by using this project for commercial purposes.
 *   If you modify the code and redistribute it, you need to clearly indicate what changes
 *     you made in the corresponding file.
 *   If the modification is used for commercial purposes, please contact our corporate
 *     personnel.
 * ***************************************************************************************
 */

package com.frontleaves.mastercontrol.config.init;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

/**
 * 系统初始化
 * <p>
 * 该类用于系统初始化;
 * 该类使用 {@code @Configuration} 注解标记;
 *
 * @version v1.0.0
 * @since 2024/09/10
 * @author xiao_lfeng
 */
@Slf4j
@Configuration
@RequiredArgsConstructor
public class Initial {


    @PostConstruct
    public void init() {
        log.info("[INIT] 系统初始化");

    }
}
