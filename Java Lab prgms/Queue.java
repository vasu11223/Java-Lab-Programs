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
