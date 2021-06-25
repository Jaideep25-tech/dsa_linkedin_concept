import java.util.*;
class timepass
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        linkedlist ob =new linkedlist();
        int ch=1;
        while(ch!=0)
        {
            System.out.println("enter 1 for create");
            System.out.println("enter 2 for display");
            System.out.println("enter 3 for sum");
            System.out.println("enter 4 for add first");
            System.out.println("enter 5 for del first");
            System.out.println("enter 6 for del last");
            System.out.println("enter 7 for insert in between");
            System.out.println("enter 8 for remove from between");
            System.out.println("enter 9 for remove any data");
            int n=sc.nextInt();
            switch(n)
            {
                case 1:ob.create();
                break;
                case 2:ob.display();
                break;
                case 3:ob.sum();
                break;
                case 4:ob.addfirst();
                break;
                case 5:ob.delfirst();
                break;
                case 6:ob.dellast();
                break;
                case 7:ob.insert();
                break;
                 case 8:ob.remove();
                break;
                 case 9:ob.dremove();
                break;
            }
            System.out.println("\nenter 1 for continue 0 for exit");
            ch=sc.nextInt();
        }
    }
}