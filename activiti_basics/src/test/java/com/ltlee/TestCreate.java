package com.ltlee;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.junit.Test;

public class TestCreate {

    @Test
    public void testCreateDbTable(){
        //需要使用activiti提供的工具类ProcessEngines，使用getDefaultProcessEngine来创建processEngine
        //getDefaultProcessEngine会默认从resources下读取名为activiti.cfg.xml的配置文件来创建processEngine，同时创建Mysql的表
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        System.out.println(processEngine);
    }
}
