package com.imjwong.onlooker.aop.logging;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * LoginAccep class
 *
 * @author J.Wong
 * @date 2018/01/19
 */
@Aspect
public class LoginAspect {

    @Pointcut
    public void springBeanPointcut() {

    }

}
