package com.test;


/**
 * 单例模式  「详情可哔哩哔哩搜索：单例模式 猛男」
 * 注意三个要点：
 *  1、是否线程安全
 *  2、是否是懒加载
 *  3、是否能通过反射破坏
 */
public class SingletonModel {
    private SingletonModel (){};
    private static SingletonModel singleton = null;
    public static SingletonModel getInstanse(){
        if(singleton == null){
            synchronized (SingletonModel.class){
                if(singleton == null){
                    //非原子操作，分为三步：
                    //1、分配内存
                    //2、对象初始化
                    //3、对象指向内存地址
                    //JVM可能会进行指令重排
                    singleton = new SingletonModel();
                }
            }
        }
        return singleton;
    }
}
