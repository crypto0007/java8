class Threading1 extends Thread
{
	long i,sum=0;
	String name;
	Threading1(String name)
	{
		this.name=name;
	}
	public void run()
	{
		try
		{

			for(i=1;i<=10000;i++)
			{
				sum=sum+i;
			}
			System.out.println("Sum is: "+sum);
			sleep(1000);
		}catch(Exception e)
		{}
	}
}

class Threading2 extends Thread
{
	long i,sum1=0;
	String name;
	Threading2(String name)
	{
		this.name=name;
	}
	public void run()
	{
		try
		{

			for(i=10001;i<=20000;i++)
			{
				sum1=sum1+i;
			}
			System.out.println("Sum1 is: "+sum1);
			sleep(2000);
		}
		catch(Exception e)
		{
		}
	}
}

class Threading3 extends Thread
{
	long i,sum2=0;
	String name;
	Threading3(String name)
	{
		this.name=name;
	}
	public void run()
	{
		try
		{

			for(i=20001;i<=30000;i++)
			{
				sum2=sum2+i;
			}
			System.out.println("Sum2 is: "+sum2);
			sleep(3000);
		}catch(Exception e)
		{}
	}
}

class ThreadDemo1
{
	public static void main(String a[])
	{
		try
		{
			Threading1 t1=new Threading1("Thread 1");
			Threading2 t2=new Threading2("Thread 2");
			Threading3 t3=new Threading3("Thread 3");

			t1.start();
			t2.start();
			t3.start();
			if(t1.isAlive())
			{
				t1.join();
			}
			if(t2.isAlive())
			{
				t2.join();
			}
			if(t3.isAlive())
			{
				t3.join();
			}
			System.out.println("Total sum is: "+ (t1.sum+t2.sum1+t3.sum2));
		}
		catch(Exception e)
		{}
	}
}