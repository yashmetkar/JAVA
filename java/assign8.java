

class assign8
{
    public static void main(String[] args)
    {
        int dayNumber=6;
        if(dayNumber<=0)
        {
            System.out.println("invalid daynumber");
        }
        else if(dayNumber==1)
        {
            System.out.println("Monday");
        }
        else if(dayNumber==2)
        {
            System.out.println("Tuesday");
        }
        else if(dayNumber==3)
        {
            System.out.println("wednesday");
        }
        else if(dayNumber==4)
        {
            System.out.println("Thursday");
        }
        else if(dayNumber==5)
        {
            System.out.println("Friday");
        }
        else if(dayNumber==6)
        {
            System.out.println("Saturday");
        }
        else if(dayNumber==7)
        {
            System.out.println("Sunday");
        }
        else{
            System.out.println("number is greater than 7");
        }
    }
}