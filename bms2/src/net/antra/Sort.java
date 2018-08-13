package net.antra;

import java.util.Comparator;

public class Sort implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		
		//return -ve if I1 has to come before I2
		if(i1>i2) {
			return -1;
		}else if(i1<i2) {//return +ve if I1 has to come after I2
			return +1;
		}else {
			return 0;//return 0 if I1 and I2 are same
		}
		
		

		
		
	}

}
