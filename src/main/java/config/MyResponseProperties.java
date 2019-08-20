package config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *@ClassName MyResponseProperties
 *@Description TODO
 *@Author DL
 *@Date 2019/7/18 16:36    
 *@Version 1.0
 */
@ConfigurationProperties(prefix = "dl.response")
public class MyResponseProperties {
    private String enabled;

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }
}
