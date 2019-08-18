package com.yy.chapter11���ж���;

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
		
		//����ͼ����snow2��ʱ��Arrays.asList()��ֻ��powder���ͣ�������ᴴ��List<Powder>������List<Snow>
		//snow4�в�����һ�����������߱�����������Arrays.asList������list���ͣ����Ϊ��ʾ���Ͳ���˵��
	}
}
