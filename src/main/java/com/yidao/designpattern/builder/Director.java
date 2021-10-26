package com.yidao.designpattern.builder;

/**
 * 指挥者类，用来指挥建造过程
 * 
 * @author
 *
 */
public class Director {

    public void construct(Builder builder) {
	builder.buildPartA();
	builder.buildPartB();
    }
}
