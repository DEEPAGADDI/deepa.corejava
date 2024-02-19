package com.string;
//by default enum are public,final, and static
public class EnumDemo {
		enum Day{  //Day is enum variable
			SUNDAY,
			MONDAY,
			TUESDAY,
			WEDNESDAY,
			THURSDAY,
			FRIDAY,
			SATURDAY
		}
		enum month{
			JAN,
			FEB,
			MARCH,
			APRIL,
			MAY,
			JUNE,
			JULY,
			AUG,
			SEP,OCT,
			NOV,
			DEC
		}
		enum season{
			winter,summer,mansoon,rainy,spring
		}
		enum rest{
			masaladosa,
			idly,gobi,curdrice,idlyvada,
			puri_chatni,panipuri
		}
	public static void main(String[] args) {
		Day today = Day.MONDAY;
		month m=month.NOV;
		season s=season.winter;
		rest re=rest.masaladosa;
		System.out.println("Today is : "+today);
		System.out.println("Month is : "+m);
		System.out.println("Season is : "+s);
		System.out.println("Dish is : "+re);
	}
}

