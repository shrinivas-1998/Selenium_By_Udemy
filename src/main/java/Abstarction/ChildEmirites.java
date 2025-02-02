package Abstarction;

public class ChildEmirites extends ParentAirCraft 
{
	public static void main(String[] args) 
	{
		ChildEmirites ce = new ChildEmirites();
		ce.engine();
		ce.safetyGuidelines();
		ce.bodyColour();
		// we cannot instantiate object for Abstract class
		// ParentAirCraft pa = new ParentAirCraft();
	}

	@Override
	public void bodyColour() 
	{
		// TODO Auto-generated method stub
		System.out.println("Red colour on the body");
	}
}
