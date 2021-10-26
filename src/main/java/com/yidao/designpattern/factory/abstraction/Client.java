package com.yidao.designpattern.factory.abstraction;


import com.yidao.designpattern.factory.simple.Operation;

/**
 * 客户端
 * 
 * @author
 *
 */
public class Client {
    public static void main(String[] args) throws InstantiationException,
	    IllegalAccessException {
	Operation operation = OperationFactory.createOperation("/");

	operation.numberA = 7;
	operation.numberB = 8;

	System.out.println(operation.result());
    }
}
