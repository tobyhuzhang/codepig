package com.yidao.designpattern.factory.method;


import com.yidao.designpattern.factory.simple.Operation;
import com.yidao.designpattern.factory.simple.OperationAdd;
import com.yidao.designpattern.factory.simple.OperationDiv;
import com.yidao.designpattern.factory.simple.OperationMul;
import com.yidao.designpattern.factory.simple.OperationSub;

/**
 * 工厂接口
 * 
 * @author
 *
 */
public interface IFactory {
    public Operation createOperation();
}

class AddFactory implements IFactory {

    @Override
    public Operation createOperation() {
	return new OperationAdd();
    }

}

class SubFactory implements IFactory {

    @Override
    public Operation createOperation() {
	return new OperationSub();
    }

}

class MulFactory implements IFactory {

    @Override
    public Operation createOperation() {
	return new OperationMul();
    }

}

class DivFactory implements IFactory {

    @Override
    public Operation createOperation() {
	return new OperationDiv();
    }

}