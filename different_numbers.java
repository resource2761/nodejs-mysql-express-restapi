// project to compute different type of numbers
// you have to perform result of each cases using return or non return type function 

import java.util.*;
class project_count_different_numbers

{
    
    public static void main(String args[])
    
    {
    
    int ch,start,end,no; // declare necessary variables
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter start number");
    start=sc.nextInt();
    
    System.out.println("Enter end number");
    end=sc.nextInt();
    
    System.out.println("1. Only Count and print Armstrong Numbers within Start and End");
    System.out.println("2. Only Count and print Prime Numbers within Start and End");
    System.out.println("3. Only Count and print Krishnamurthy Numbers within Start and End");
    System.out.println("4. Only Count and print Palindrome Numbers within Start and End");
    System.out.println("5. Only Count and print Perfect Numbers within Start and End");
    System.out.println("6. Only Count and print Duck Numbers within Start and End");
    System.out.println("7. Only Count and print Tech Numbers within Start and End");
    System.out.println("8. Only Count and print Automorphic Numbers within Start and End");
    System.out.println("9. Only Count and print Palindrome Numbers within Start and End");
    System.out.println("10. Only Count and print Disarium Numbers within Start and End");
    System.out.println("11. Only Count and print Neon Numbers within Start and End");
    System.out.println("12. Only Count and print Abundant Numbers within Start and End");
    
    System.out.println("Enter Choice ");
    ch=sc.nextInt();
    
    switch(ch)
    { // switch starts here
        
        case 1:
       { 
        int count=0;
       for(no=start;no<=end;no=no+1)
       {
           int armstrong=range_armstrong(no);//call the int return type function
           if(no==armstrong)
           {
               System.out.println("The armstrong numbers are:"+armstrong);
               count=count+1;
           }
       }
       System.out.println("The total numbers is:"+count);
   
       }
    }
}
 static int range_armstrong(int no)//definition
 {
   {
      {
        int r,s=0,cube;
        while(no>0)
        {
            r=no%10;
            no=no/10;
            cube=(int)Math.pow(r,3);
            s=s+cube;
        }
        return s;
            // run appropriate function for Count and print Armstrong Numbers within Start and End
      break;
      }  //case 1
  

        case 2:
        
        {
          
         for(no=start;no<=end;no=no+1)
          {
              int count=0,num;
         for(num =no; num>=1; num--)
         {
            
	    if(no%num==0)
	    {
		count = count + 1;
	    }
	 }
      


	 if (count==2)
	 {
	    System.out.println("Prime numbers from 1 to no are :"+no);
	 }	
	// else
	// {
	//     System.out.println("Not prime");
	 //  }
            // run appropriate function for Count and print prime Numbers within Start and End
        }
            break;
            
        }
        
       
        case 3:
        {
            int count=0;
             for(no=start;no<=end;no++)
              {
                     int krish=range_krish(no); // call the int return type function
                     if(no==krish)// check acual 'no' with return value 'krish'
                     {
                             System.out.println("Krishnamurthy Number :"+krish);
                             count=count+1;
                     }
              }
             System.out.println("Total no. of Krishnamurthy Numbers are :"+count);
         }//case 
        }//switch
    }//main
        static int range_krish(int no)// define function
          {
              {
                  {
                 int temp=no,digit=0,sum=0,i,fact=1; // store the original value thrown by function
                 while(no>0)
                 {
                     digit=no%10;//digit extract
            
                     for(i=1;i<=digit;i=i+1)
                     {//loop body
                            fact=fact*i;
                
                     }//end of for loop
           
                     sum=sum+fact;
                     no=no/10;
                     fact=1;
                 }
       
                 return sum; // retun sum because function prototype is 'int'
                
                 break;
                }//case
                
               
                case 4:
                {
                    int count=0;
                    for(no=start;no<=end;no=no+1)
                    {
                         int pali=range_pali(no);//call the function
                         if(no==pali)
                         {
                       System.out.println("The palidrome number is:"+pali);
                       count=count+1;
                          }
       
                   }
                    System.out.println("The number of palindrome numbers are:"+count);
               }
            }
        }
              static int range_pali(int no)//definition
                {
                    {
                       {
                   int r,t=no,rev=0;
                   while(no>0)
                  {
                       r=no%10;
                       rev=(rev*10)+r;
                      no=no/10;
                  }
                 return rev;
                 break;
                }
                
                case 5:
                {
                    int count=0,i,sum=0;
                    for(no=start;no<=end;no=no+1)
                    {
                        for(i = 1 ; i < no ; i++) //running loop from 1 to the number itself inputted by increasing 1 increement
	              {
		        if(no % i == 0)//checking wheteher the inputted number when divided by the i gives the remainder = 0
		          {
                             sum = sum + i;
                            count=count+1;
		          }      
	              }
	           System.out.println(count);
	             if (sum == no) 
	
		     System.out.println(" Perfect no "+ no);
        
	          else
	
		     System.out.println(" NOT a Perfect no "+ no);
		  }
	break;
         }
      

                /*
                 case 6:
                 {
                     int count=0;
                     for(no=start;no<=end;no=no+1)
                    {
                    int duck=range_duck(no);//call the function
                    if(duck==no)
                    {
                     System.out.println("The duck numbers are:"+duck);
                        count=count+1;
                       }
                    }
                     System.out.println(count);
                 }
                }
            }
                static int range_duck(int no)//definition
              {
        // check duck or not
        {
            {
                      int digit=0,foundzero=0;       
                        while(no>0)
                   {
                          digit=no%10; // extract digits
                         if(digit==0)
                      {
                           foundzero=1;
                      }
                      no=no/10; // reduced digits
            
                   }
       
        // check foundzero==1 for any number contain 0
            return foundzero;
            break;
      }
      case 7:
      {
          int n,digits=0,leftpart,rightpart,sum_sqr=0;
          for(no=start;no<=end;no=no+1)
{
n = no; // store actual number in “no” variable
while (no > 0) // entry controlled loop to check value of “no” variable
{
digits++; // count number of digits
no = no / 10; // reduce the value of “no” variable
}
if (digits % 2 == 0) // if count digits is an event number
{
no = n; // store value of “n” in “no” variiable
leftpart = no % (int) Math.pow(10, digits / 2); // leftpart=3025 % (int)Math.pow(10,2) Ans. 25
no = no / (int) Math.pow(10, digits / 2);// no=3025 / (int)Math.pow(10,2) Ans. 30
rightpart = no; // 30
sum_sqr = (leftpart + rightpart) * (leftpart + rightpart); // square with the sum of (leftpart+rightpart)
if (n == sum_sqr) // check sum of square with actual number
{
System.out.println("Tech Number"); // depends on the above condition, print “Tech Number”
}
else
{
System.out.println("Not Tech Number"); // if condition mismatch
}
}


}

break;
}

      case 8:
      {
          int count=0;
          for(no=start;no<=end;no=no+1)
         {
                 int automorphic=auto(no);//call the function as boolean.
                  if(no==automorphic)
                 {
                  System.out.println("The numbers are"+automorphic);
                          count=count+1;
                 }
         }
         System.out.println(count);
      }
    }
}
    static int auto(int no)//definition of function
    {
        {
            {
        int temp,count=0,rem,sq;
        temp=no;//stored in another variable
        while(temp>0)
        {
            temp=temp/10;
            count=count+1;
        }
        sq=no*no;
        rem=sq%(int)Math.pow(10,count);
        return rem;
        
                case 9:
                {
                    int count=0;
                    for(no=start;no<=end;no=no+1)
                    {
                         int pali=range_pali(no);//call the function
                         if(no==pali)
                         {
                       System.out.println("The palidrome number is:"+pali);
                       count=count+1;
                          }
       
                   }
                    System.out.println("The number of palindrome numbers are:"+count);
               }
            }
        }
              static int range_pali(int no)//definition
                {
                    {
                       {
                   int r,t=no,rev=0;
                   while(no>0)
                  {
                       r=no%10;
                       rev=(rev*10)+r;
                      no=no/10;
                  }
                 return rev;
                 break;
                }
                
                case 10:
                {
                    for(no=start;no<=end;no=no+1)
                    {
                    int original_no=no; // store original number
		int disarium = no; // store original number
		int count=0;
        while(original_no>0)
        {
            original_no=original_no/10; 
            count++; // total digits
        }
		
		//System.out.println("Total digits :"+count);
		// 175 is a disarium Number and count variable gets the length = 3
              int sum=0;
		while(disarium>0)
        {
            int digit=disarium %10; // get the digits
			disarium=disarium/10;  // reduce the loop number
			sum=sum +(int)Math.pow(digit,count); // exponent and store in sum var with exponent reduced with -1
			System.out.println("Digit ="+digit+ " Exponent ="+ count+" Result "+(int)Math.pow(digit,count));
            count--;  // reduced the power applied on digits
        }

		if(no==sum)
		System.out.println("Disarium Number :"+no);
		else
		System.out.println("Not a Disarium Number :"+no);
        }
        break;
}
/*
                case 11:
                { 
                    int count=0;
                    for(no=start;no<=end;no=no+1)
                   {
                      int result=neon(no);
                      if(no==result)
                     {
                      System.out.println(result);//call the function as boolean
                           count=count+1;
                     }
                    }
                  System.out.println(count);
           }
        }
    }
    static int neon(int no)//definition of function
    {
        {
            {
        int digit=0,square=0,sum=0,org=0;
        square=no*no;
        org=square;
        while(square>0)
        {
            digit=square%10;
            sum=sum+digit;
            square=square/10;
        }
         return sum;
         break;
        }
        
        case 12:
        {
             for(no=start;no<=end;no=no+1)
        {
        int i,sum=0,count=0;
        for(i=1;i<no;i=i+1)
         
        

        if(no%i==0)
        {
            sum=sum+i;
            count=count+1;
        }
              System.out.println(count);
        if(sum>no)
        System.out.println("Abundant");
        else
        System.out.println("Not abundant");
        }
        break;
   }
  
                }//switch
            }//main
        
        }