package com.yy.chapter20ע��;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//ΪJavaBean׼����ע��
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLString {
    int value() default  0;
    String name() default "";
    Constraints constraints() default @Constraints;
}
