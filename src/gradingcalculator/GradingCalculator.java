
package gradingcalculator;
import java.util.Scanner;

public class GradingCalculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] str=new String[5];
        String[] str1={"first","second","third","fourth","fifth"};
        
        for(int i=0;i<5;i++)
        {
            System.out.println("please enter a grade:");
            str[i]=sc.nextLine();
        }
        int num,sum=0;
        for(int i=0;i<5;i++)
        {
            num=Integer.parseInt(str[i]);
            sum+=num;
            if(num>=80 && num<=100)
            {
                System.out.println("the mark for the"+str1[i]+"course was"+num+"%, the letter grade is A");
            }
            else if (num>=70 && num<=79)
            {
                System.out.println("the mark for the"+str1[i]+"course was"+num+"%, the letter grade is B");
            }
            else if (num>=60 && num<=69)
            {
                System.out.println("the mark for the"+str1[i]+"course was"+num+"%, the letter grade is C");
            }
            else if (num>=50 && num<=59)
            {
                System.out.println("the mark for the"+str1[i]+"course was"+num+"%, the letter grade is D");
            }
            else if (num>=0 && num<=49)
            {
                System.out.println("the mark for the"+str1[i]+"course was"+num+"%, the letter grade is F");
            }
        }
        double ans=(double)sum/str.length;
        if(ans>80)
        {
            System.out.println("The overall average mark is "+ans+"%,which is a letter grade of A");
        }
        else if(ans>70)
        {
            System.out.println("The overall average mark is "+ans+"%,which is a letter grade of B");
        }
        else if(ans>60)
        {
            System.out.println("The overall average mark is "+ans+"%,which is a letter grade of C");
        }
        else if(ans>50)
        {
            System.out.println("The overall average mark is "+ans+"%,which is a letter grade of D");
        }
        else
        {
            System.out.println("The overall average mark is "+ans+"%,which is a letter grade of F");
        }
    }
    
}
