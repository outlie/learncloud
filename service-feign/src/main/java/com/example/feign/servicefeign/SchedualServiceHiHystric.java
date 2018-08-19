/**
 * Choicesoft.com.cn Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.example.feign.servicefeign;

import org.springframework.stereotype.Component;

import java.util.Hashtable;

/**
 * @author cui
 * @version $Id: SchedualServiceHiHystric.java, v 0.1 2018-08-14 6:09 PM cui Exp $$
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
