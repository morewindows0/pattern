package com.learning.pattern.singleton.lazy;

/**
 * @author: dengxin.chen
 * @date: 2019-10-29 21:48
 * @description: 使用double-check的单例形式，不会造成性能影响
 */
public class LazyDoubleCheckSingleton {

    private static volatile LazyDoubleCheckSingleton instance = null;

    private LazyDoubleCheckSingleton() {}

    public static LazyDoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
