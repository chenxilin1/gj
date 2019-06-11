package com.example.gj.config;

import java.util.UUID;

/**
 * @author ：Cxl
 * @date ：Created in 2019/6/2 15:58
 * @description：1
 */
public class Random {
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
