package com.yy.chapter17���������˽�;

import com.yy.chapter15����.���ͽӿ�153.Generator;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;

/**����ʾ��*/
public class QueueBehavior {
    private static  int count = 10;
    static <T> void  test(Queue<T> queue , Generator<T> gen){
        for(int i = 0 ;i < count ; i++){
            queue.offer(gen.next());
        }
        while(queue.peek() != null){
            System.out.print(queue.remove() + "  ");
        }
        System.out.println();
    }
    static class  Gen implements Generator<String>{
        String[] s = ("one tow three four five 6 7 8 9 10").split(" " );
        int i ;
        @Override
        public String next() {
            return s[i++];
        }
    }

    public static void main(String[] args) {
        test(new LinkedList<String>(),new Gen());
        test(new PriorityQueue<String>(),new Gen());
        test(new ArrayBlockingQueue<String>(count),new Gen());
        test(new ConcurrentLinkedQueue<String>(),new Gen());
        test(new LinkedBlockingDeque<String>(),new Gen());
        test(new PriorityBlockingQueue<String>(),new Gen());
        //�������ȶ��У�Queue������Ԫ�ر�����Queue�е�˳���������
    }
}
