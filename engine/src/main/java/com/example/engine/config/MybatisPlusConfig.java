package com.example.engine.config;


import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * mygatis plus 配置类
 *
 * @author gaobaozong
 * @version V1.0
 * @date Created in 2021/9/3 - 下午3:19
 */
@Configuration
@MapperScan("com.example.engine.mapper")
public class MybatisPlusConfig {

    /**
     * 分页插件
     */
    @Bean
    public PaginationInnerInterceptor paginationInterceptor() {
        return new PaginationInnerInterceptor();
    }

    /**
     * 乐观锁插件
     *    实体使用 @Version 标记
     * @return
     */
    @Bean
    public OptimisticLockerInnerInterceptor optimisticLockerInterceptor(){
        return new OptimisticLockerInnerInterceptor();
    }
}
