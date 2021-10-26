package com.yidao.designpattern.strategy;

/**
 * 上下文
 * 
 * @author
 *
 */
public class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
	this.strategy = strategy;
    }

    /**
     * 上下文接口
     */
    public void contextInterface() {
	strategy.algorithmInterface();
    }

}