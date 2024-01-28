class Thread1 extends Thread
{
   public void run()
	{
	   System.out.println("T1 State Before call the sleep method: "+Thread.currentThread().getState());
	   try
	   {
		  Thread.sleep(3000);
	   }
	   catch(Exception e)
	   {
	   }
	   System.out.println("T1 State after call the Sleep method: "+Thread.currentThread().getState());
	}
}
class MainThread
{
	public static void main(String args[])
	{
		Thread1 t1=new Thread1();
		System.out.println("T1 State before call the start method: "+t1.getState());
		t1.start();
		System.out.println("T1 State after call the start method: "+t1.getState());
	    try{
			t1.join();
		}catch(Exception e)
		{
		}
		System.out.println("T1 State after call the join method: "+t1.getState());
	}
}