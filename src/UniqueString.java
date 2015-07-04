//  Write a code to find that a string contains unique chars

public class UniqueString 
{
  public static void main(String args[])
  {
    String[] str ={"anuj","aajj","rjaj"};
    
    for(String s:str)
    {
       System.out.println(s+ " = "+CheckUniqueString(s));
     }

  }

  
  public static boolean CheckUniqueString(String str)
  {
       if(str.length()>128)
       {
         return false;
       }

       else
      {
         boolean temp[] = new boolean[128];
            
         for(int i=0;i<str.length();i++)
         {
           int val = str.charAt(i);
           if(temp[val]) return false;
           temp[val]=true;

         }
       return true;

      }
      
   }

   }
