package com.carWasher.carWasher;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;

@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@ConfigurationProperties(prefix = "carwasher")
public class CarWasherProperties {

    private String loadTestData="no";

    public String getLoadTestData()
    {
        return loadTestData;
    }

    public void setLoadTestData(String loadTestData)
    {
        this.loadTestData = loadTestData;
    }


}
