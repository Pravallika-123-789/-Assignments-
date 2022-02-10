package practiseproject;

import java.util.HashSet;

public class LIS {
	
	public static void main(String[] args) {
		int[] a= {0,4,12,10,6,9,13,3,11,7,15};
		HashSet<Integer>hs=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		int long_leng=0;
		for(int i=0;i<a.length;i++) {
			if(!hs.contains(a[i]-1)) {
				int no=a[i];
				while(hs.contains(no)) {
					no++;
				}
				if(long_leng<no-a[i]) {
					long_leng=no-a[i];
				}
				}
			}
		System.out.println("Longest Subsequence length is "+long_leng);
	}


}
