/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nil
 * Challenge to reverse a string first by character and then by word
 */
public class ReverseString {
    public static void main(String[] args){
    int i;
    char j;
    String test = "Please reverse this string";
    String charReverse="";//empty string used to concatinate the solution
    for (i = test.length()-1; i>=0 ;i--){ //for loop that counts from last character down
        charReverse = charReverse + test.charAt(i);//added -1 because the characters are stored from 0 to n,will add another character each cycle of loop.
    }
    System.out.println(charReverse);
    
    String wordReverse="";
    String word="";
    test = test + " ";//put in to make it so the last word is added to the reversed string
    for(i=0;i<test.length();i++){//For loop will cycle from beginning to end
        j = test.charAt(i);
        if(j == ' '){//single quote for char data type
        wordReverse = word +" "+ wordReverse; // will add word when its complete to the front of the string
        word = ""; // clears last word entered
        }
        else{
        word = word + j;
        }   
    }
    System.out.println(wordReverse);
//trying to reverse the string without having to add a space at the end 
test = "Please reverse this string"; 
wordReverse="";
word="";
i=0;    

	while(i<test.length()) { //could also use for loop
		if(test.charAt(i)==' ') { //adds the next full word in the string in front followed by a space
			wordReverse = word + test.charAt(i) + wordReverse;
			word = "";//resets word
			i++;
		}
		else {// builds word
			word = word + test.charAt(i);
			i++;
		}
	}
	if(test.charAt(test.length()-1)!=' ') {//if the string doesnt end in a space it will add the last word in the reversed string
		wordReverse = word + ' ' + wordReverse;
	}
	System.out.println(wordReverse);
    //next challenge will be to keep the words in place but reverse the words individually
     String reversedWords = "";
     String reversedWord = "";
     for(i=0;i<test.length();i++)
     {
         if(test.charAt(i)==' '){
     reversedWord = reversedWord + " ";
     reversedWords = reversedWords + reversedWord;
     reversedWord = "";
     }
         else{
         reversedWord = test.charAt(i) + reversedWord;
         }
     
     }
     if(test.charAt(i-1)!=' '){
     reversedWords = reversedWords + reversedWord;
     } 
     System.out.println(reversedWords);
     


    }}
