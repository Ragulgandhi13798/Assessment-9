package deque;

import java.util.EnumSet;

enum days
{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
public class Enumdays {
	

	public static void main(String[] args) {
		
		
		EnumSet <days> S12 = EnumSet.of(days.SUNDAY);
		System.out.println("week of " + S12);
		
		
		EnumSet <days> S1 = EnumSet.allOf(days.class);
		System.out.println("week in whole days " + S1);
		
		EnumSet <days> S11 = EnumSet.of(days.MONDAY);
		System.out.println("i like " + S11);
		
		
		
		EnumSet <days> S2 = EnumSet.noneOf(days.class);
		System.out.println("empty" + S2);
	}

}
