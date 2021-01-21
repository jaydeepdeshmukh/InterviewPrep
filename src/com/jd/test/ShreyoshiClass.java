package com.jd.test;

import java.util.HashMap;
import java.util.Map;

import com.jd.test.ShreyoshiOuter.StaticNestedClass;

public class ShreyoshiClass {

	public static void main(String[] args) {
		ShreyoshiOuter.NestedClass obj = new ShreyoshiOuter().new NestedClass();
		obj.display();
	
		StaticNestedClass obj1 = new StaticNestedClass();
		obj1.setName("jaydeep");
		obj1.setId(1);
		System.out.println(obj1.getId());
		StaticNestedClass obj2 = new StaticNestedClass();
		obj2.setName("jaydeep");
		obj2.setId(2);
		System.out.println(obj2.getId());
//		obj1.staticDisplay();
		
		HashMap<StaticNestedClass, String> map = new HashMap();
		map.put(obj1, "itchy");
		map.put(obj2, "itchy");
		System.out.println(map.size());
		for(Map.Entry<StaticNestedClass, String> m : map.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
			
	}
	
}

class ShreyoshiOuter {
	class NestedClass {
		public void display() {
			System.out.println("in display");
		}
	}
	
	static class StaticNestedClass {
		int id;
		String name;
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void staticDisplay() {
			System.out.println("in display static");
		}
		
		public static void show() {
			System.out.println("in show static");
		}
		
		@Override
		public int hashCode() {
			return 1;
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj == null ||this.getClass() != obj.getClass())
				return false;
			if(obj == this)
			{
				System.out.println("in this");
				return true;
			}
			StaticNestedClass st = (StaticNestedClass) obj;
			return (this.id == st.id);
		}
	}
	
	public void outerClassMethod() {
		
	}
	
}
