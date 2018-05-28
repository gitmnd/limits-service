package com.springcloud.limitsservice;

import com.springcloud.limitsservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MACHUNAGENDRADURGP on 18/05/2018.
 */

@RestController
public class LimitsConfigurationController {


    private Configuration configuration;

    @Autowired
    public LimitsConfigurationController(Configuration configuration){
        this.configuration = configuration;
    }

    @RequestMapping(value="/limits")
    public LimitConfiguration retrieveLimitsFromConfigurations(){
        return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
    }
}
