package com.imjwong.onlooker.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;

import javax.servlet.http.HttpServletRequest;

/**
 * ListenerDemo class
 *
 * @author J.Wong
 * @date 2018/01/19
 */
public class ListenerDemo implements ApplicationListener {

    @Autowired
    private HttpServletRequest request;

    @Override
    public void onApplicationEvent(ApplicationEvent appEvent) {
        if (appEvent instanceof AuthenticationSuccessEvent) {
            AuthenticationSuccessEvent eevent = (AuthenticationSuccessEvent) appEvent;
        }

        request.getSession().setAttribute("jwong", "jwong");

    }
}
