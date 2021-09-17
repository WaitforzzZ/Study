package com.waitfor.study.generics;

/**
 * 多个泛型类型
 *
 * @author 周亮
 * @since 2020-10-30下午 5:25
 */
public class PairMany<T, K> {
    private T first;

    private K last;

    public PairMany(T first, K last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public K getLast() {
        return last;
    }

    /*使用的时候，需要指出两种类型：
    Pair<String, Integer> p = new Pair<>("test", 123);*/
}
