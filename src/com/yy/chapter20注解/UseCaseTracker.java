package com.yy.chapter20ע��;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**ע�⴦����*/
public class UseCaseTracker {
    public  static void  trackUseCases(List<Integer> useCases , Class<?> cl){
        for(Method m : cl.getDeclaredMethods()){
            UseCase uc = m.getAnnotation(UseCase.class);
            if(uc != null ){
                System.out.println("find use case"  + uc.id() + "    " + uc.description() );
                useCases.remove(new Integer(uc.id()));
            }
        }
        for(int i : useCases){
            System.out.println("Warning : Missing use case - " + i);
        }
    }

    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<>();
        Collections.addAll(useCases,47,48,49,50);
        trackUseCases(useCases,PasswordUtils.class);
    }
}
