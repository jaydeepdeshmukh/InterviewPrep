package com.jd.test;

import java.util.ArrayList;

class Business {}
class Hotel extends Business {}
class Inn extends Hotel {}
class Room {
	public static void main(String[] args) {
		new Room().give();
	}
	
	public ArrayList<Hotel> give() {
		return new ArrayList<Hotel>();
	}
	
	// 1) return new ArrayList<Hotel>();
	// 2) return new ArrayList<Inn>();
	// 3) return new ArrayList<Business>();
	// 4) return new ArrayList<Object>();
}
