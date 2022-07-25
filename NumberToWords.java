// import java packages
import java.util.Scanner;
import java.util.*;

public class NumberToWords
{
    // main method
    public static void main(String args[])
    {
        Scanner  input =new Scanner (System.in);
        // user input to enter the desired number to call
        System.out.println("Enter a number : \n");
        int number = input.nextInt();

        if (number == 0)
        {
            System.out.print("Zero");
        }
        else
        {
        
            String word=String.valueOf(number);
            //for length of number ie. no of digits in the number
            int l = word.length();
            String NumExt="", NumWord = "";
            int i=0, CurrentDegit =0,NumContoller =0, DigitsConverted =0,NumString =0;

            // for loop to loop thru numbers
            for (i=l-1;i>=0;i--)
            {
                char characters=word.charAt(i);
                CurrentDegit = Integer.valueOf(String.valueOf(characters));//current digit

                // initialsing Arrays variables and its values
                String Array1[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixten","Seventeen","Eighteen","Ninteen"};
                String Array2[]={"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
           
                // if else statement to combat double digit numbers like 
                if(i>0)
                {
                	// substring extracts string from string
                	 NumWord = word.substring(i-1,i+1);
                	 NumString = Integer.valueOf( NumWord);    //
                }
                else
                {
                	NumString=22;
                }
                //for combating double digit numbers
                if (DigitsConverted==2) 
                {
                    if(CurrentDegit!=0){ //Just to eliminate 0 problem, in case.
                        NumExt="hundred "+NumExt;
                    }
                    NumContoller=0;
                }
                if (DigitsConverted==3)
                {
                    if(CurrentDegit!=0){
                    	NumExt="thousand "+NumExt;
                    }
                    NumContoller=0;
                }
                if (DigitsConverted==5)
                {
                    if(CurrentDegit!=0){
                    	NumExt="million "+NumExt;
                    }
                    NumContoller=0;
                }
                if (DigitsConverted==7)
                {
                    if(CurrentDegit!=0){
                    	NumExt="billion "+NumExt;
                    }
                    NumContoller=0;
                }
                if (DigitsConverted==9)
                {
                    if(CurrentDegit!=0){
                    	NumExt="trillion "+NumExt;
                    }
                    NumContoller=0;
                }
                if (DigitsConverted==11)
                {
                    if(CurrentDegit!=0){
                    	NumExt="quadra Million "+NumExt;
                    }
                    NumContoller=0;
                }

                if(NumString<20 && DigitsConverted!=1 && DigitsConverted==0) 
                {
                	NumExt=Array1[NumString]+" "+NumExt;
                    NumContoller++;DigitsConverted++;i--;
                }
                else if(NumString<20 && DigitsConverted!=1 && DigitsConverted%2!=0)
                {
                	NumExt=Array1[NumString]+" "+NumExt;
                    NumContoller++;DigitsConverted++;i--;  
                }
                else if(NumContoller%2==0)     
                {
                	NumExt=Array1[CurrentDegit]+" "+NumExt;
                }
                else  
                {   
                	NumExt = Array2[CurrentDegit]+" "+NumExt;
                }
                NumContoller++; DigitsConverted++; 
            }
            // printing out the num words
            System.out.println("\nNumber in Words : "+ NumExt); 
        }
        input.close();
    }

}
/* Refference :  https://www.javatpoint.com/java-program-number-to-word
https://stackoverflow.com/questions/3911966/how-to-convert-number-to-words-in-java
https://youtu.be/VnmOvU7o190
*/