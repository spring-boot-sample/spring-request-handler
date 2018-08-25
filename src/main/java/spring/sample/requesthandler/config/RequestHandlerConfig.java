package spring.sample.requesthandler.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import spring.sample.requesthandler.interceptor.HttpRequestHandlerInterceptor;

@Configuration
public class RequestHandlerConfig extends WebMvcConfigurationSupport {

    /**
     * interceptorをbeanに登録
     */
    @Bean
    public HttpRequestHandlerInterceptor requestHandlerInterceptor() {
        return new HttpRequestHandlerInterceptor();
    }
    /**
     * intercptorのbeanをurlリクエストパターンに追加
     */
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestHandlerInterceptor()).addPathPatterns("/test/*");
    }
}