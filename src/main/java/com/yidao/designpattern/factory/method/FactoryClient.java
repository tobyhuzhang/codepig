package com.yidao.designpattern.factory.method;


import com.yidao.designpattern.factory.simple.Operation;

/**
 * 工厂方法客户端
 * 
 * @author
 *
 */
public class FactoryClient {
    public static void main(String[] args) {
	IFactory operFactory = new DivFactory();
	Operation operation = operFactory.createOperation();

	operation.numberA = 3.4;
	operation.numberB = 4.5;

	System.out.println(operation.result());

    }
}