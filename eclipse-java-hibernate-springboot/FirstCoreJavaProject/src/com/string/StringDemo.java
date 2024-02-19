package com.string;
//concat(), length(), charAt(), substring(), equals(), equalsIgnoreCase()
//toUpperCase(), toLowerCase(),contains(), replace()
public class StringDemo {

	public static void main(String[] args) {
		String str1="hello ";
		String str2="world";
		String str3=str1.concat(str2);
		System.out.println("Concat = "+str3); 
		
		//length
        String str4="ramya";
        System.out.println("Length = "+str4.length());
//        String str5="ramya";
//        int str6=str5.length();
//        System.out.println(str6);
        
        //charAt
        String str7="komadi";
        char c=str7.charAt(2);
        System.out.println("character at 2nd position = "+c);
        
        String  str8="Hello World";
        String str9=str8.substring(1,6);
        System.out.println(str9);
        
        String str10="ramya";
        String str11="Ramya";
        System.out.println("Equals = "+str10.equals(str11));//because java is case sensitive
       
        String str12="RaMya";
        String str13="ramya";
        System.out.println("Equals = "+str12.equalsIgnoreCase(str13));
        
        String str14="komadi";
        System.out.println("To uppercase = "+str14.toUpperCase());
        
        String str15="SHrEE";
        System.out.println("To lowercase = "+str15.toLowerCase());
        
        String str16="komadi";
        boolean cont=str16.contains("ma");
        System.out.println("contains or not = "+cont);
        
        String str17="ramya";
        String rep1 = str17.replace('m', 'n');
        System.out.println("Replace m by n in ramya = "+rep1);
        String rep2=str17.replace("am", "vk");
        System.out.println("Replace am by vk in ramya = "+rep2);
        
        
	}

}