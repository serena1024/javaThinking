package com.yy.chapter11持有对象;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}


public class AsListInference {
	public static void main(String[] args) {
		List<Snow> snow1 = Arrays.asList(new Crusty(),new Slush(),new Powder());
//		List<Snow> snow2 = Arrays.asList(new Light(),new Heavy()); Wont compile
		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3, new  Light(),new Heavy());
		List<Snow> snow4 = Arrays.<Snow>asList(new Light(),new Heavy());
		
		//当试图创建snow2的时候，Arrays.asList()中只有powder类型，因此他会创建List<Powder>而不是List<Snow>
		//snow4中插入了一条线索，告诉编译器对于由Arrays.asList产生的list类型，这称为显示类型参数说明
	}
}
