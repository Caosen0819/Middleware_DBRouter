package cn.sen.middleware.db.router.annotation;

import java.lang.annotation.*;

/**
 * 路由注解
 * @Author caosen
 * @Date 2023/3/31 20:34
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface DBRouter {

    /** 分库分表字段 */
    String Key() default "";
}
