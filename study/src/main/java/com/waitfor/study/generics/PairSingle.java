package com.waitfor.study.generics;

/**
 * 单个泛型类型
 *
 * @author 周亮
 * @since 2020-10-30下午 5:13
 */
public class PairSingle<T> {

    private T first;

    private T last;

    public PairSingle(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public T getLast() {
        return last;
    }

    // 静态泛型方法应该使用其他类型区分:
    public static <K> PairSingle<K> create(K first, K last) {
        return new PairSingle<K>(first, last);
    }
}
