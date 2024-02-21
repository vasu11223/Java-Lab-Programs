import java.util.Scanner;
class QueueOverFlowException extends RuntimeException{
	public QueueOverFlowException(String msg){
		super(msg);
	}
}
class QueueUnderFlowException extends RuntimeException{
	public QueueUnderFlowException(String msg){
		super(msg);
	}
}
public class QueueImplementation{
	static int front=-1,rear=-1;
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the size of queue : ");
		int size=sc.nextInt();
		if(size<0){
			System.out.println("\n"+size +" -> Queue Size Can't Be Negative..!");
			return;
		}
		int a[]=new int[size];
		System.out.println("\nQueue Operations");
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		while(true){
			System.out.println("\nChoose Operation : ");
			System.out.println("1 : insert()");
			System.out.println("2 : delete()");
			System.out.println("3 : display()");
			System.out.println("4 : exit()");
			
			int choice=sc.nextInt();
			
			switch(choice){
				case 1:
				try{
					System.out.print("\nEnter the element to insert -> ");
					int element=sc.nextInt();
					insert(a,element);
				}catch(QueueOverFlowException qe){
					System.out.println(qe.getMessage());
				}
				break;
				
				case 2:
				try{
					delete(a);
				}catch(QueueUnderFlowException qe){
					System.out.println(qe.getMessage());
				}
				break;
				
				case 3:
				display(a);
				break;
				
				case 4:
				System.out.println("\nExiting The Program!! BYE :)");
				System.exit(0);
				break;
				
				default:
				System.out.println("\nInvalid Operation.!! Choose Correct One :)");
				
			}
		}
	}
	public static void insert(int queue[],int element){
		if(rear==queue.length-1){
			throw new QueueOverFlowException("QUEUE IS FULL INSERTION NOT POSSIBLE!!");
		}else{
			if(front==-1){
				front=0;
			}
			queue[++rear]=element;
			System.out.println("\nInserted Element IS -> "+element);
		}
	}
	public static void delete(int queue[]){
		if(front==-1){
			throw new QueueUnderFlowException("\nQUEUE IS EMPTY NOTHING TO DELETE!!");
		}else{
			int deletedElement=queue[front];
			if(front==rear){
				front=rear=-1;
			}else{
				front++;
			}
			System.out.println("\nDeleted Element Is ->"+deletedElement);
		}
	}
	public static void display(int queue[]){
		if(front==-1){
			System.out.println("\nQueue Is Empty.!!");
		}else{
			System.out.print("\nResulted Queue :: ");
			for(int i=front;i<=rear;++i){
				System.out.print(queue[i]+"  ");
			}
			System.out.println();
		}
	}
	
}

_____________
	_______________________
	import java.util.*;
import java.lang.*;
class QueueError extends Exception
{
	public QueueError(String msg)
	{
		super(msg);
	}
}
class Que
{
	private int size;
	private int front = -1;
	private int rear = -1;
	private Integer[] queArr;
	public Que(int size)
	{
		this.size = size;
		queArr = new Integer[size];
	}
	public void insert(int item) throws Exception,QueueError
	{
		try
		{
			if(rear == size-1)
			{
				throw new QueueError("Queue Overflow");
			}
			else if(front==-1)
			{
				rear++;
				queArr[rear] = item;
				front = rear;
			}
			else
			{
				rear++;
				queArr[rear] = item;
			}
		}
		catch(QueueError qe)
		{
			qe.printStackTrace();
		}
	}
	public void delete() throws Exception,QueueError
	{
		try
		{
			if(front == -1)
			{
				throw new QueueError("Queue Underflow");
			}
			else if(front==rear)
			{
				System.out.println("\nRemoved "+queArr[front]+" from Queue");
				queArr[front] = null;
				front--;
				rear--;
			}
			else
			{
				System.out.println("\nRemoved "+queArr[front]+" from Queue");
				queArr[front] = null;
				for(int i=front+1;i<=rear;i++)
				{
					queArr[i-1]=queArr[i];
				}
				rear--;
			}
		}
		catch(QueueError qe)
		{
			qe.printStackTrace();
		}
	}
	public void display() throws Exception,QueueError
	{
		try
		{
			if(front==-1)
				throw new QueueError("Queue is Empty");
			else
			{
				System.out.print("\nQueue is: ");
				for(int i=front;i<=rear;i++)
				{
					System.out.print(queArr[i]+"\t");
				}
				System.out.println();
			}
		}
		catch(QueueError qe)
		{
			qe.printStackTrace();
		}
	}
}
class Experiment15
{
	public static void main(String[] args) throws Exception,QueueError
	{
		System.out.println("\n\n\tQueue test using Array\n\n");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of Queue array: ");
		int size = scan.nextInt();
		Que que = new Que(size);
		char ch;
		try
		{
			while(true)
			{
				System.out.println("\n\n\tQueue operations \n");
				System.out.println("1. Insert");
				System.out.println("2. Delete");
				System.out.println("3. Display");
				System.out.println("4. Exit\n");
				System.out.print("Enter your choice: ");
				int choice = scan.nextInt();
				switch(choice)
				{
					case 1: System.out.print("\nEnter integer number to insert: ");
							que.insert(scan.nextInt());
							break;
					case 2:que.delete();
							break;
					case 3:que.display();
							break;
					case 4:return ;
				}
			}
		}
		catch(QueueError qe)
		{
			qe.printStackTrace();
		}
	}
}
