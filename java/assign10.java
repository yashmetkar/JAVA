class assign10
{
    public static void main(String[] args)
    {
        int age=61;
        double discount=50;
        double ridePrice=200;
        if(age<=10)
        {
            System.out.println("eligible for festival's ride & offer is 50rs off - offer price =  " + (ridePrice-discount));
        }
        else if(age>=50)
        {
            System.out.println("eligible for festival's ride & offer is 50rs off - offer price = " + (ridePrice-discount));
        }
        else if(age<=25)
        {
            System.out.println("eligible for festival's ride & offer is 50rs off - offer price = " + (ridePrice-discount));
        }
        else{
            System.out.println("not eligible pay fixed price");
        }
    }
}





