package com.yidao.designpattern.iterator;

/**
 * 聚集接口
 * 
 * @author
 *
 * @param <T>
 */
public interface Aggregate<T> {

    public Iterator<T> createIterator();
}
