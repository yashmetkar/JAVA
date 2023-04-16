class assign6
{
    public static void main(String[] args)
    {
        int num1=12;
        int num2=17;
        int num3=22;
    
     if(num1>num2 && num1>num3)
       {
        System.out.println("num1 is greater than num2 & num3");
       }
       else if(num2>num1 && num2>num3)
       {
        System.out.println("num2 is greater than num1 & num3");
       }
       else if(num3>num1 && num3>num2)
       {
        System.out.println("num3 is greater than num1 & num2");
       }
       else if(num1<num2 && num1<num3)
       {
        System.out.println("num1 is less than num2 & num3");
       }
       else if(num2<num1 && num2<num3)
       {
        System.out.println("num2 is less than num1 & num3");
       }
       else if(num3<num1 && num3<num2)
       {
        System.out.println("num3 is less than num1 & num2");
       }
       else if(num1==num2 && num1==num3)
       {
        System.out.println("num1 is equal to num2 & num3");
       }
       else if(num2==num1 && num2==num3)
       {
        System.out.println("num2 is equal to num1 & num3");
       }
       else if(num3==num1 && num3==num2)
       {
        System.out.println("num3 is equal to num1 & num2");
       }
       else if(num1>num2 && num2==num3)
       {
        System.out.println("num1 is greater & num2 is equal to num3");
       }
       else if(num1==num2 && num2>num3)
       {
        System.out.println("num2 is greater than num3 & num2 is eqaul to num1");
       }
       else if(num1==num2 && num2<num3)
       {
        System.out.println("num3 is greater than num2 & num1 is equal to num2");
       }
       else if(num1<num2 && num2==num3)
       {
        System.out.println("num2 is greater than num1 & num2 is equal num3");
       }
       else{
        System.out.println("invalid combination");
       }
    }
}