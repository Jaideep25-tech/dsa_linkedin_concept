import java.util.*;
class linkedlist
{
    node start;
    node t;
    int sum=0,s=0;
    Scanner sc=new Scanner(System.in);
    linkedlist()
    {
        start =null;
    }

    void create()
    {
        node n=new node();
        System.out.println("input");
        int elem=sc.nextInt();
        n.data=elem;
        n.next=null;
        if(start==null)
            start=n;
        else
        {
            t=start;
            while(t.next!=null)
            {
                t=t.next;
            }
            t.next=n;
        }
    }

    void display()
    {
        t=start;
        while(t!=null)
        {
            System.out.print(t.data+"=>");
            t=t.next;
        }
    }

    void sum()
    {
        t=start;
        sum=0;
        s=0;
        while(t!=null)
        {
            if(t.data%2==0)
                sum=sum+t.data;
            else
                s=s+t.data;
            t=t.next;
        }
        System.out.println("even sum"+sum);
        System.out.println("odd sum"+s);
    }

    void addfirst()
    {
        node n=new node();
        System.out.println("input data");
        int d=sc.nextInt();
        n.data=d;
        n.next=start;
        start=n;
    }

    void delfirst()
    {
        if(start==null)
            System.out.println("linked list is empty");
        else
        {
            System.out.println("deleted"+start.data);
            start=start.next;
        }
    }

    void dellast()
    {
        t=start;
        if(start==null)
            System.out.println("linked list is empty");
        else
        {
            while(t.next.next!=null)
            {
                t=t.next;
            }
            System.out.println("deleted"+t.next.data);
            t.next=null;
        }
    }

    void insert()
    {
        t=start;
        System.out.println("enter insert position");
        int a=sc.nextInt();   
        for(int i=1;i<a;i++)
        {
            t=t.next;
        }

        node n=new node();
        System.out.println("input data");
        int d=sc.nextInt();
        n.data=d;
        n.next=t.next;
        t.next=n;
    }

    void remove()
    {
        t=start;
        System.out.println("enter delete position");
        int a=sc.nextInt();   
        for(int i=1;i<a-1;i++)
        {
            t=t.next;
        }
        System.out.println("deleted"+t.next.data);
        t.next=t.next.next;
    }

    void dremove()
    {
        t=start;
        System.out.println("enter data to be delete");
        int a=sc.nextInt();   
        while(t.next.data!=a)
        {
            t=t.next;
        }
        System.out.println("deleted"+t.next.data);
        t.next=t.next.next;

    }    
}