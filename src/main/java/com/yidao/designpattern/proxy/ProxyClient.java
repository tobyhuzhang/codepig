package com.yidao.designpattern.proxy;

/**
 * 代理客户端
 * 
 * @author
 *
 */
public class ProxyClient {
    public static void main(String[] args) {
	Proxy proxy = new Proxy();
	proxy.request();
    }
}
