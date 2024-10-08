/*
 * ***************************************************************************************
 * company: FrontLeaves Technology Co,.Ltd.
 * author: XiaoLFeng(https://www.x-lf.com) | FLASHLACK |
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

package com.frontleaves.mastercontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 应用程序的主类
 * <p>
 * 该类负责启动 Spring Boot 应用程序, 通过调用 SpringApplication.run() 方法启动应用程序;
 * 该类使用 {@code @SpringBootApplication} 注解标记;
 *
 * @version v1.0.0
 * @since 2024/09/10
 * @author xiao_lfeng
 */
@EnableAsync
@EnableScheduling
@SpringBootApplication
public class MasterControlApplication {

    public static void main(String[] args) {
        SpringApplication.run(MasterControlApplication.class, args);
    }
}
