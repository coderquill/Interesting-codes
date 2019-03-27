/*Given a keypad as shown in diagram, and an N digit number. List all words which are possible by pressing these numbers.

    1    2    3
        ABC  DEF  
    
    4    5    6
   GHI  JKL  MNO
    
    7    8    9
  PQRS  TUV  WXYS
  
         0
         
         
Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow. Each testcase contains two lines of input. The first line of each test case is N, N is the number of digits. The second line of each test case contains D[i], N number of digits.

Output:
Print all possible words from phone digits with single space.

Constraints:
1 <= T <= 10
1 <= N <= 10
2 <=  D[i] <= 9

Example:
Input:
1
3
2 3 4

Output:
adg adh adi aeg aeh aei afg afh afi bdg bdh bdi beg beh bei bfg bfh bfi cdg cdh cdi ceg ceh cei cfg cfh cfi

*/


import java.util.*;
import java.lang.*;
import java.io.*;

class possibleWordsFromPhoneDigits {
    
    static void printAllStrings (int[] array, String[] string, StringBuffer stringBuffer,int k){
        
        if (k == array.length){
            
            System.out.print( stringBuffer+" " );
            
            return;
        }
        
        String st = string[array[k]];
        
        for (int i = 0; i < st.length(); i++){
            
            stringBuffer.delete (k, stringBuffer.length() );
            
            printAllStrings (array, string,stringBuffer.append(st.charAt(i)),k+1);
        }
        
    }
	public static void main (String[] args) {
	    
		Scanner scan = new Scanner(System.in);
		
		int testCases = scan.nextInt();
		
		for (int j = 0; j < testCases; j++){
		    
		    int numberOfDigits = scan.nextInt();
		    
		    int array [] = new int [numberOfDigits];
		    
		    for (int i = 0; i < numberOfDigits; i++){
		        
		        array[i] = scan.nextInt();
		    }
		    
		    String string [] = { "", "", "abc", "def", "ghi", "jkl", 
		                         "mno", "pqrs", "tuv", "wxyz"};
		    
		    StringBuffer stringBuffer = new StringBuffer();
		    
		    printAllStrings(array,string,stringBuffer,0);
		    
		    System.out.println();
		}
	}
}
