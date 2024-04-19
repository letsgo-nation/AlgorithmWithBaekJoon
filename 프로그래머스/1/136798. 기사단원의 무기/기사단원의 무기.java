import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int index = 0;
        int[] arr = new int[number]; 

        for(int i=0; i<number; i++) {
            index++;
            arr[i] = index; 	
            int count=0; 

            for(int j=1; j <= Math.sqrt(arr[i]); j++) {  		   	
                if(j == Math.sqrt(arr[i])) {
                    count++;   			
                }
                else if(arr[i] % j  == 0) {
                    count +=2;    	      
                }

                if(count > limit) { 
               count = power;
               break;
               }
            }    		
            answer += count; 	
        }
    return answer;
    }
}