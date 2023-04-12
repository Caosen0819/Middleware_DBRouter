package cn.sen.middleware.db.router.annotation;

import java.lang.annotation.*;

/**
 * 路由策略，分表标记
 * @Author caosen
 * @Date 2023/3/31 22:20
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DBRouterStrategy {
    boolean splitTable() default false;
}
