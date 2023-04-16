class assign7
{
    public static void main(String[] args)
    {
        int sellingPrice=14000;
        int costPrice=12000;
        if(sellingPrice>costPrice)
        {
            System.out.println("profit gained = " + (sellingPrice-costPrice));
        } 
        else if(costPrice>sellingPrice){
            System.out.println("loss gained = "+ (sellingPrice-costPrice));

        }
        else if(sellingPrice==costPrice)
        {
            System.out.println("no profit & no loss gained");
        }
    }
}