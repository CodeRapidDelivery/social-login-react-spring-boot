package com.marbor.oauth.oauthsample.properties;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;

@Configuration
@ConfigurationProperties(prefix = "social-login-app.web")
@Getter
@Setter
public class WebProperties {
    @NestedConfigurationProperty
    private CorsConfiguration cors;
}
