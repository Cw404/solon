package org.noear.solon.extend.springboot;

import org.noear.solon.extend.servlet.SolonServletFilter;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author noear 2020/12/28 created
 * @since 1.2
 */
@Configuration
public class ConfigurationSolon  {
    @ConditionalOnWebApplication
    @Bean
    public FilterRegistrationBean servletRegistrationBean() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new SolonServletFilter());
        return registration;
    }

    @Bean
    public BeanPostProcessor beanPostProcessor(){
        return new BeanPostProcessorSolon();
    }

}
