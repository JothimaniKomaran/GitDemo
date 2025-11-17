abstract class Vechicle{
	abstract void start();
	void stop()
	{
		System.out.println("Vechicle stopped");
	}
}

class car extends Vechicle{
	
	void start()
	{
		System.out.println("car started");
	}
}

class Bike extends car{
	void start()
	{
		System.out.println("bike started");
	}
}
public class Main{
public static void main(String[] args)
{
	car c=new car();
	Bike b=new Bike();
	b.start();
	c.start();
}
}
