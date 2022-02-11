package demo;

import java.util.function.Predicate;

//Predicate--->one parameter returns boolean
//use only if you have conditonal checks in your program.....

public class PredicateDemo {

	public static void main(String[] args) {
		
		//EX1
		Predicate<Integer> p=i->(i>10);
		
		System.out.println(p.test(20));//true
		System.out.println(p.test(5));//false
		
		//EX2 :check the length of given string is greater than 4 or not.
		Predicate<String> pr=s->(s.length()>4);
		
		System.out.println(pr.test("welcome"));//true
		System.out.println(pr.test("xyz"));//false
		
	//	EX:3 Print array elements whose size is>4 from array
	
		String names[]= {"David","Scott","Smith","John","Marry"};
	
		for(String name:names) {
			if(pr.test(name)) {
				System.out.println(name);
			}
		}
	}

}
