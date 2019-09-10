package com.yy.chapter15泛型;
/**匿名内部类**/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import com.yy.chapter15泛型.泛型接口153.Generator;

class  Customer{
	private static long counter = 1;
	private final long id = counter++;
	public Customer(){}
	@Override
	public String toString() {
		return "Customer [id=" + id + "]";
	}
	public static Generator<Customer> generator(){
		return new Generator<Customer>() {
			@Override
			public Customer next() {
				return new Customer();
			}
		};
	}
	
}

public class BankTeller {
	public static void serve(Customer c) {
		System.out.println(c);
	}
	public static void main(String[] args) {
		Random rand = new Random(47);
		Queue<Customer> line = new LinkedList<>();
		Generators.fill(line, Customer.generator(), 15);
		for(Customer c : line ) {
			serve(c);
		}
	}
}
