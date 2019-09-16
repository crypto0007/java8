class Threading1 extends Thread
{
	int i;
	String name;
	Threading1(String name)
	{
		this.name=name;
	}
	public void run()
	{
		try
		{

			for(i=1;i<=5;i++)
			{
				System.out.println("Thread1 is alive"+isAlive());
				sleep(1000);
				System.out.println(name + "="+i);
			}

		}catch(Exception e)
		{}
	}
}

class Threading2 extends Thread
{
	int i;
	String name;
	Threading2(String name)
	{
		this.name=name;
	}
	public void run()
	{
		try
		{

			for(i=1;i<=6;i++)
			{
				System.out.println("Thread2 is alive"+isAlive());
				sleep(2000);
				System.out.println(name + "="+i);
			}

		}
		catch(Exception e)
		{
		}
	}
}

class Threading3 extends Thread
{
	int i;
	String name;
	Threading3(String name)
	{
		this.name=name;
	}
	public void run()
	{
		try
		{

			for(i=1;i<=7;i++)
			{
				System.out.println("Thread3 is alive"+isAlive());
				sleep(3000);
				System.out.println(name + "="+i);
			}

		}catch(Exception e)
		{}
	}
}

class ThreadDemo2
{
	public static void main(String a[])
	{

		Threading1 t1=new Threading1("Thread 1");
		Threading2 t2=new Threading2("Thread 2");
		Threading3 t3=new Threading3("Thread 3");
		t1.start();
		t2.start();
		t3.start();

	}
}