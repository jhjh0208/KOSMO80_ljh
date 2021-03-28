package com.quiz0222;

 enum Dogs {collie, harrier, shepherd};

public class Quiz52 {
	//switch안에 String타입 가능함.
	 public static void main(String [] args) {
	    Dogs myDog = Dogs.shepherd;
	    switch (myDog) {
	    case collie:
	        System.out.print("collie");
	    case shepherd:  
	        System.out.print("shepherd");
	    case harrier:
	        System.out.print("harrier");
	 }
   }
}
