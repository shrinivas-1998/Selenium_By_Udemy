package methodOverriding;

// function overriding = both having same method same method signature but the local method gets executed 

public class ChildClassDemo extends ParentClassDemo 
{
	// @Override
	public void AudioSystem() 
	{
		System.out.println("Child class AudioSystem code is implemented");
	}

	public void engine() 
	{
		System.out.println("New Engine");
	}

	public void colour() 
	{
		System.out.println(colour);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChildClassDemo cd = new ChildClassDemo();
		cd.colour();
		cd.brakes();
		System.out.println(cd.colour);
		cd.engine();
		cd.AudioSystem();
	}
}
