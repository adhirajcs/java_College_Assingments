package day6;

/* 6. Write a method (not the entire application) called CountVowels, which takes the input
arguments as character and checks whether it is a vowel; increment the instance variable
called vCnt by 1. */

// driver class
public class q6 {
	static int vCnt = 0;
    static public void vowelCount(char c) {
    	// checking whether the characters passed in the arguments are vowel or not
    	if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
    		// incrementing the instance variable called vCnt by 1
    		vCnt++;
    		System.out.println(c + " is Vowel");
    	}
        else {
        	System.out.println(c + " is not a Vowel");
        }
    }
    public static void main(String args[]) {
    	
    	int i=0;
    	while(i<args.length){
    		for (int j=0;j<args[i].length();j++) {
    			char c = args[i].charAt(j);
    			// calling the static method vowelCount() and passing the characters in the strings 
    			vowelCount(c);
    		}
    		i++;
    	}
    	// printing the number of vowels found in the string
    	System.out.println("Number of Vowels in the string are: " + vCnt);
    }
}

/* OUTPUT - 
H is not a Vowel
e is Vowel
l is not a Vowel
l is not a Vowel
o is Vowel
W is not a Vowel
o is Vowel
r is not a Vowel
l is not a Vowel
d is not a Vowel
o is Vowel
f is not a Vowel
J is not a Vowel
a is Vowel
v is not a Vowel
a is Vowel
D is not a Vowel
e is Vowel
v is not a Vowel
e is Vowel
l is not a Vowel
o is Vowel
p is not a Vowel
e is Vowel
r is not a Vowel
s is not a Vowel
Number of Vowels in the string are: 10
 */