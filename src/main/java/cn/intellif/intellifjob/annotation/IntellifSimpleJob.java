package cn.intellif.intellifjob.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * author 尹冲
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface IntellifSimpleJob {
    String id() default "";
    //这里可以输入基本和${}
    String cron();
    String shardingTotalCount() default "1";
    String itemParameters() default "";
}
