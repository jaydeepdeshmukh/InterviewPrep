package com.jd.test;

public class ExceptionTest {

	public static void main(String[] args) {
		String s = "-";
		try {
			throw new Exception();
		} catch (Exception e) {
			try {
				throw new Exception();
			} catch (Exception e2) {
				s += "ic";
				try {
					throw new Exception();
				} catch (Exception e1) {
					s += "mc";
				} finally { s+= "mf"; }
			}			
		} finally { s+= "mo"; }
		System.out.println(s);
	}
}
