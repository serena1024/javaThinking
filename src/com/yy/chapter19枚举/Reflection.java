package com.yy.chapter19Ã¶¾Ù;

import net.mindview.util.OSExecute;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

enum Explore{HERE ,THERE}
public class Reflection {
    public static Set<String> analyse(Class<?> eunmClass){
        System.out.println("Analysing------" + eunmClass +"----------");
        System.out.println("Interfaces");
        for(Type t : eunmClass.getGenericInterfaces()){
            System.out.print(t);
        }
        System.out.print("Base:" + eunmClass.getSuperclass());
        System.out.print("MEthods:");
        Set<String> methods = new TreeSet<>();
        for(Method m : eunmClass.getMethods()){
            methods.add(m.getName());
        }
        System.out.print(methods);
        return methods;
    }

    public static void main(String[] args) {
        Set<String> exploreMethods = analyse(Explore.class);
        Set<String> enumMethods = analyse(Enum.class);
        System.out.println("exploreMethods.containsAll(enumMethods)" + exploreMethods.containsAll(enumMethods));
        System.out.print("Explore.removeAll(Enum):");
        System.out.println(exploreMethods.removeAll(enumMethods));
        System.out.println(exploreMethods);
        OSExecute.command("javap com.yy.chapter19Ã¶¾Ù.Explore");
    }
}
