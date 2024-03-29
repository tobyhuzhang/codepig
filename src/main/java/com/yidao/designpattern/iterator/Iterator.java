package com.yidao.designpattern.iterator;

/**
 * 迭代器接口
 * 
 * @author
 *
 * @param <T>
 */
public interface Iterator<T> {

    public T first();

    public T next();

    public boolean isDone();

    public T currentItem();

}
