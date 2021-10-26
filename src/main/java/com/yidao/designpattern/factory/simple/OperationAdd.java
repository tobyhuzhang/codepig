package com.yidao.designpattern.factory.simple;

/**
 * 加法类
 * 
 * @author
 *
 */
public class OperationAdd extends Operation {

    @Override
    public double result() {
	return numberA + numberB;
    }

}