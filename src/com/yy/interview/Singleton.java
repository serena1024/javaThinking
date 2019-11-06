package com.yy.interview;
/**
 *双重校验单例模式
 * */
public class Singleton { // 1
    private volatile static Singleton singleton;// 2
    private Singleton(){}
    public static Singleton getSingleton(){// 3
        if(singleton == null){// 4:第一次检查
            synchronized (Singleton.class){// 5:加锁
                if (singleton == null){// 6:第二次检查
                    singleton = new Singleton();// 7:问题的根源出在这里
                }// 8
            }
        }// 9
        return singleton;// 10
    }// 11
}

/***上述的singleton类变量是没有用volatile关键字修饰的，会导致这样一个问题：
        在线程执行到第4行的时候，代码读取到singleton不为null时，singleton引用的对象有可能还没有完成初始化。
        主要的原因是重排序。重排序是指编译器和处理器为了优化程序性能而对指令序列进行重新排序的一种手段。
        第7行的代码创建了一个对象，这一行代码可以分解成3个操作：

        memory = allocate();　　// 1：分配对象的内存空间
        ctorInstance(memory);　// 2：初始化对象
        instance = memory;　　// 3：设置instance指向刚分配的内存地址
        根源在于代码中的2和3之间，可能会被重排序。例如：

        memory = allocate();　　// 1：分配对象的内存空间
        instance = memory;　　// 3：设置instance指向刚分配的内存地址
        // 注意，此时对象还没有被初始化！
        ctorInstance(memory);　// 2：初始化对象
        这在单线程环境下是没有问题的，但在多线程环境下会出现问题：

        B线程会看到一个还没有被初始化的对象。

        A2和A3的重排序不影响线程A的最终结果，但会导致线程B在B1处判断出instance不为空，线程B接下来将访问instance引用的对象。此时，线程B将会访问到一个还未
        初始化的对象。
        所以只需要做一点小的修改（把instance声明为volatile型），就可以实现线程安全的延迟初始化。因为被volatile关键字修饰的变量是被禁止重排序的。

        当第二个操作是volatile写时，不管第一个操作是什么，都不能重排序。这个规则确保volatile写之前的操作不会被编译器重排序到volatile写之后。
        当第一个操作是volatile读时，不管第二个操作是什么，都不能重排序。这个规则确保volatile读之后的操作不会被编译器重排序到volatile读之前。
        当第一个操作是volatile写，第二个操作是volatile读时，不能重排序。*

 */