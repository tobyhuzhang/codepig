package com.yidao.designpattern.factory.simple;

/**
 * 乘法类
 * 
 * @author
 *
 */
public class OperationMul extends Operation {

    @Override
    public double result() {
	return numberA * numberB;
    }

}