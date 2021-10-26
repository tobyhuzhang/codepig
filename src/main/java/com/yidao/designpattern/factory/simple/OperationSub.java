package com.yidao.designpattern.factory.simple;

/**
 * 减法类
 * 
 * @author
 *
 */
public class OperationSub extends Operation {

    @Override
    public double result() {
	return numberA - numberB;
    }

}