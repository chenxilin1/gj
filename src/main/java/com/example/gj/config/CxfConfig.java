package com.example.gj.config;

import javax.annotation.Resource;
import javax.xml.ws.Endpoint;

import com.example.gj.service.Tb_ordersService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**

* @Description:    java类作用描述

* @Author:         Cxl

* @CreateDate:     date 

* @UpdateUser:     yc

* @UpdateDate:     date 

* @UpdateRemark:   修改内容

* @Version:        1.0

*/
@Configuration
public class CxfConfig {

    @Resource
    private Bus bus;

    @Resource
    private Tb_ordersService testService;
    
    @Bean
    public Endpoint endpoint(){
        EndpointImpl endpoint = new EndpointImpl(bus, testService);
        endpoint.publish("/TestService");
        return endpoint;
    }
}
