package com.wiesen.create_type.singleton;

/**
 * Created by wiesen on 16-7-18.
 *
 *
 */
public class SimpleOptions {

    /**
     *懒汉模式  -->在使用的时候进行实例化
     */

    private static SimpleOptions mSimpleOptions ;

    /**
     * 但是此懒汉式单例的实现没有考虑线程安全问题，它是线程不安全的，并发环境下很可能出现多个Singleton实例
     */
    public static SimpleOptions getInstance1(){

        if (mSimpleOptions == null){
            mSimpleOptions = new SimpleOptions();
        }
        return mSimpleOptions;
    }

    /**
     *
     * 这种写法能够在多线程中很好的工作，但是，遗憾的是，效率很低，99%情况下不需要同步
     */
    public static synchronized SimpleOptions getInstance2(){
        if (mSimpleOptions == null){
            mSimpleOptions = new SimpleOptions();
        }
        return mSimpleOptions;
    }

    /**
     * 双重校验法
     *
     * 似乎解决了之前提到的问题，将synchronized关键字加在了内部，也就是说当调用的时候是不需要加锁的，只有在instance为null，
     *并创建对象的时候才需要加锁，性能有一定的提升。但是，这样的情况，还是有可能有问题的，看下面的情况：
     *在Java指令中创建对象和赋值操作是分开进行的，也就是说instance = new Singleton();语句是分两步执行的。
     *但是JVM并不保证这两个操作的先后顺序，也就是说有可能JVM会为新的Singleton实例分配空间，然后直接赋值给instance成员，
     *然后再去初始化这个Singleton实例。这样就可能出错了，我们以A、B两个线程为例：
     *
     *a>A、B线程同时进入了第一个if判断
     *
     * b>A首先进入synchronized块，由于instance为null，所以它执行instance = new Singleton();
     *
     *c>由于JVM内部的优化机制，JVM先画出了一些分配给Singleton实例的空白内存，并赋值给instance成员（注意此时JVM没有开始初始化这个实例），然后A离开了synchronized块。
     *
     *d>B进入synchronized块，由于instance此时不是null，因此它马上离开了synchronized块并将结果返回给调用该方法的程序。
     *
     *e>此时B线程打算使用Singleton实例，却发现它没有被初始化，于是错误发生了。
     *
     *所以程序还是有可能发生错误，其实程序在运行过程是很复杂的，从这点我们就可以看出，尤其是在写多线程环境下的程序更有难度，
     *有挑战性
     * @return
     */
    public static SimpleOptions getInstance3(){
        if (mSimpleOptions == null){
            synchronized (SimpleOptions.class){
                if (mSimpleOptions == null){
                    mSimpleOptions = new SimpleOptions() ;
                }
            }
        }
        return mSimpleOptions;
    }

    /**
     * 双校验法的变种
     */

    public static SimpleOptions getInstance4(){
        if (mSimpleOptions == null){
            InstanceSync();
        }
        return mSimpleOptions;
    }

    public static synchronized void InstanceSync(){
        if (mSimpleOptions == null){
            mSimpleOptions = new SimpleOptions();
        }
    }

    /******************************************************************************************************/

    /**
     *静态内部类方式实现
     *
     * 单例模式使用内部类来维护单例的实现，JVM内部的机制能够保证当一个类被加载的时候，
     *这个类的加载过程是线程互斥的。这样当我们第一次调用getInstance的时候，JVM能够帮我们保证instance只被创建一次，
     *并且会保证把赋值给instance的内存初始化完毕，这样我们就不用担心上面的问题。同时该方法也只会在第一次调用的时候使用互斥机制，
     *这样就解决了低性能问题。
     * @return
     *
     * 缺点：如果在内部类中构造方法出现异常则实例将无法被创建
     */
    public static SimpleOptions getInstance5(){
        return SimpleOptionsInstanceHolder.mSimpleOptionsInstance;
    }

    private static class SimpleOptionsInstanceHolder{
        private static SimpleOptions mSimpleOptionsInstance = new SimpleOptions();
    }

    /*******************************************饿汉模式************************************************/
    /**
     * 直接实例化，没有进行延迟加载
     */
    private static SimpleOptions mSimpleOptionsInstance = new SimpleOptions();

    public static SimpleOptions getInstance(){
        return mSimpleOptionsInstance;
    }
}
