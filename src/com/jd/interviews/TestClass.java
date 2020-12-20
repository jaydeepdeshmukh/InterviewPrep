package com.jd.interviews;
import java.io.*;
import java.util.*;

class Park implements Comparator {
	int startTime = 0;
	
	public Park(int startTime) {
		this.startTime=startTime;
	}

	public Park() {
	}
	
	@Override
	public int compare(Park park1, Park park2) {
		return park1.startTime - park2.startTime;
	}

}

public class TestClass {
	
	
	
	static int minParkingSpaces(int[][] parkingStartEndTimes) {
		
		int parkingSpaceReq = 0;
		int startTime = 0;
		int endTime = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<parkingStartEndTimes.length; i++) {
			list.add(parkingStartEndTimes[i][0]);
			list.add(parkingStartEndTimes[i][1]);
		}
		return parkingSpaceReq;
	}

	// DO NOT MODIFY ANYTHING BELOW THIS LINE!!

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		int[][] parkingStartEndTimeList = new int[n][2];
		String[] parkingStartEndTimes = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			String[] parkingStartEndTime = parkingStartEndTimes[i].split(",");
			for (int j = 0; j < parkingStartEndTime.length; j++) {
				parkingStartEndTimeList[i][j] = Integer.parseInt(parkingStartEndTime[j]);
			}
		}

		int out = minParkingSpaces(parkingStartEndTimeList);
		System.out.println(out);

		wr.close();
		br.close();
	}
}