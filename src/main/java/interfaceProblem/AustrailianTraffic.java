package interfaceProblem;

public class AustrailianTraffic implements CentralTraffic, ContinentalTraffic 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CentralTraffic ct = new AustrailianTraffic();
		ct.GreenGo();
		ct.RedStop();
		ct.FlashYellowWait();
		System.out.println(ct.a);

		AustrailianTraffic at = new AustrailianTraffic();
		at.WalkSymbol();

		ContinentalTraffic ct1 = new AustrailianTraffic();
		ct1.RailSymbol();
	}

	public void WalkSymbol() 
	{
		System.out.println("WalkSymbol implementation");
	}

	@Override
	public void GreenGo() 
	{
		// TODO Auto-generated method stub
		System.out.println("GreenGo implementation");

	}

	@Override
	public void RedStop() 
	{
		// TODO Auto-generated method stub
		System.out.println("RedStop implementation");

	}

	@Override
	public void FlashYellowWait() 
	{
		// TODO Auto-generated method stub
		System.out.println("FlashYellowWait implementation");

	}

	@Override
	public void RailSymbol() 
	{
		// TODO Auto-generated method stub
		System.out.println("RailSymbol implementation");
	}
}
