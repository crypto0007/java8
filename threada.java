class threadb extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Tread 1");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
	}
}

class threadc extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Thread 2");
		for(int i=1;i<=6;i++)
		{
			System.out.println(i);
		}
	}
}

class threadd extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Thread 3");
		for(int i=1;i<8;i++)
		{
			System.out.println(i);
		}
	}
}

class threada
{
	public static void main(String arg[])
	{
		threadb t=new threadb();
		threadc t2=new threadc();
		threadd t3=new threadd();

		System.out.println(t.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		t.start();
		t2.start();
		t3.start();
		System.out.println(t.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
	}
}