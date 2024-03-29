package com.yy.chapter14类型信息;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/***
 * 注册工厂类
 * */

class Part{
	public String toString() {
		return getClass().getSimpleName();
	}
	static List<Factory<? extends Part>> partFactories = new ArrayList<>();
	static {
		partFactories.add(new FuelFilter.Factory());
		partFactories.add(new AirFilter.Factory());
		partFactories.add(new CabinAirFilter.Factory());
		partFactories.add(new OilFilter.Factory());
		partFactories.add(new FanBelt.Factory());
		partFactories.add(new PowderSteeringBelt.Factory());
		partFactories.add(new GeneratorBelt.Factory());
	}
	private static Random rand = new Random(47);
	public static Part createRanom() {
		int n = rand.nextInt(partFactories.size());
		return partFactories.get(n).create();
	}
}

class Filter extends Part{}
class FuelFilter extends Filter{
	public static class Factory  implements com.yy.chapter14类型信息.Factory<FuelFilter>{
		@Override
		public FuelFilter create() {
			return new FuelFilter();
		}
		
	}
}
class AirFilter extends Filter{
	public static class Factory  implements com.yy.chapter14类型信息.Factory<AirFilter>{
		@Override
		public AirFilter create() {
			return new AirFilter();
		}
		
	}
}
class CabinAirFilter extends Filter{
	public static class Factory  implements com.yy.chapter14类型信息.Factory<CabinAirFilter>{
		@Override
		public CabinAirFilter create() {
			return new CabinAirFilter();
		}
		
	}
}
class OilFilter extends Filter{
	public static class Factory  implements com.yy.chapter14类型信息.Factory<OilFilter>{
		@Override
		public OilFilter create() {
			return new OilFilter();
		}
		
	}
}
class Belt extends Part{}
class FanBelt extends Belt{
	public static class Factory  implements com.yy.chapter14类型信息.Factory<FanBelt>{
		@Override
		public FanBelt create() {
			return new FanBelt();
		}
	}
}
class GeneratorBelt extends Belt{
	public static class Factory  implements com.yy.chapter14类型信息.Factory<GeneratorBelt>{
		@Override
		public GeneratorBelt create() {
			return new GeneratorBelt();
		}
	}
}
class PowderSteeringBelt extends Belt{
	public static class Factory  implements com.yy.chapter14类型信息.Factory<PowderSteeringBelt>{
		@Override
		public PowderSteeringBelt create() {
			return new PowderSteeringBelt();
		}
	}
}

public class RegisterFactories {
	public static void main(String[] args) {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(Part.createRanom());
		}
	}
}
