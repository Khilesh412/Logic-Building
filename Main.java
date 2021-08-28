import Collection.SinglyLL;
import Collection.SinglyCLL;
import Collection.DoublyCLL;
import Collection.DoublyCLL;
import Collection.Stack;
import Collection.Queue;
import Collection.Demo1;
import Collection.Demo2;
import Collection.Demo3;
import Collection.Demo4;
import Collection.Demo5;
import Collection.Demo6;
import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String arg[]) throws Exception
	{
        int choice = 1;
		Scanner sobj = new Scanner(System.in);
        

		System.out.println("Collection Framework");

		while(choice != 0)
		{
			System.out.println("__________________________");
			System.out.println("Enter your choice");
			System.out.println("__________________________");
			System.out.println("1 : Singly Linked List");
			System.out.println("2 : Singly Circular Linked List");
			System.out.println("3 : Doubly Linked List");
			System.out.println("4 : Doubly Circular Linked List");
			System.out.println("5 : Stack");
			System.out.println("6 : Queue");
			System.out.println("0 : Exit");
			System.out.println("__________________________");
		 	choice = sobj.nextInt();

			switch(choice)
			{
				case 1:
                       Demo1 obj = new Demo1();
                       obj.Single();
					   break;

				case 2:
                       Demo2 obj2 = new Demo2();
                       obj2.Single2();
					   break;

				case 3:
                       Demo3 obj3 = new Demo3();
                       obj3.Double();
					   break;

				case 4:
                       Demo4 obj4 = new Demo4();
                       obj4.Double2();
					   break;

				case 5:
                       Demo5 obj5 = new Demo5();
                       obj5.Stack1();
					break;
					
				case 6:
                       Demo6 obj6 = new Demo6();
                       obj6.Queue1();
					break;

				case 0:
                		System.out.println("Thank you for using Application");
                       return;


			}
		}


	}
}


