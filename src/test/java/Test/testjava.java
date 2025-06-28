package Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class testjava {



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		
		
		int[] arr = {1, 3, 4, 2, 1, 4, 5, 6};

        Set<Integer> seen = new HashSet<Integer>();
        Set<Integer> duplicates = new HashSet<Integer>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicates: " + duplicates);
        
        
        
        
        String s1="Soumadip";
        char[] c= {'a' , 'e','i','o','u'};
        char[] ch=s1.toCharArray();
        String vowels="";
        String Consonent="";
        
        
        for(int i=0; i<ch.length-1; i++)
        {
        	System.out.println("stringvalue: "+ch[i]+" loopnumber= "+i);
        	for(int j=0; j<=c.length-1;j++)
        	{
        		System.out.println("vowelarray: "+c[j]+" loopnumber= "+j);
        		if(ch[i]==(c[j]))
        		{
        			vowels+=ch[i];
        			System.out.println("Vowels:: "+vowels);
        			
        		}
        		else
        			Consonent+=ch[i];
        			
        	}
        }
        
        
        System.out.println(vowels+"    "+Consonent);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		
		
		

	}
}











//	String st1= "This is Soumadip";
//	String[] ch= st1.split(" ");
//	
//	
//	String newStr="";
//	
//	for(int i=ch.length-1; i>=0; i--)
//	{
//		newStr+=ch[i]+"";
//		
//	}
//	
//	System.out.println(newStr);




