package uniqueSequence;

import java.util.LinkedHashMap;
import java.util.Scanner;


public class uniqueSec {
	
	    
	    static LinkedHashMap<Character,Integer> resultMap = new LinkedHashMap<Character,Integer>();
	    
	    public static void main(String[] args) 
	    {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Please enter your string: ");
	        String str = in.nextLine();//user input
	        unique(str,0);  //begin from the 0 char
	        
	        System.out.println("Result: ");
	        
        for (Character x: resultMap.keySet())
            {
	            System.out.print(x);
            }
	      
	    }
	    
	    
	    public static void unique(String str,int index)
	    {
	      
	        LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();//key = character 
	                                                                                    //value = index in the string
	        for (int i = index; i<str.length();i++) //checking on every char
	        {
	            if(!map.containsKey(str.charAt(i)))//if its unique - put into a map
	            {
	                map.put(str.charAt(i),i);
	                
	            }
	            else if(map.containsKey(str.charAt(i)))//else - take an index of that char and start search again
	            {
	              
	                int last_index = map.get(str.charAt(i));
	                
	                unique(str,last_index+1);//search from the next char
	                break;
	             }
	           
	            if (map.size()> resultMap.size()){//taking largest map found
	            	resultMap.clear();
	            	resultMap.putAll(map);
	            }
	            
	        }
	       
	    }
	}
