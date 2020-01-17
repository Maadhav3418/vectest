package com.java.basics;

public class FindVowelsInLetter {
	
	public static void main(String[] args) {
        String line = "This website is aw3som3.";
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
        String vowels1 = line;
        char ch = 0;
        line = line.toLowerCase();
        for(int i = 0; i < line.length(); ++i)
        {
            ch = line.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'  || ch == 'o' || ch == 'u')
            {
            	 
            	++vowels;
                System.out.println("The vowels are :" + ch);
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                ++consonants;
         
            }
            else if( ch >= '0' && ch <= '9')
            {
                ++digits;
               
            }
            else if (ch ==' ')
            {
                ++spaces;
                
            }
        }
        
        
		System.out.println("Total Vowels are: " + vowels);
		System.out.println("Total Consonants are: " + consonants);
        System.out.println("Total Digits are: " + digits);
        System.out.println("Total White spaces: " + spaces);
    }

}
