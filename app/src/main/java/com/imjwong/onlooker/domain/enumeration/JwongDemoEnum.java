package com.imjwong.onlooker.domain.enumeration;

/**
 * JwongDemoEnum class
 *
 * @author J.Wong
 * @date 2018/01/19
 */
public enum JwongDemoEnum {

    ON("在线"), OFF("下线");

    String state;

    JwongDemoEnum(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
