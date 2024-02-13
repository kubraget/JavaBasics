
public class KoreaTraffic implements CentralTraffic,ContinentTrraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// implementing from parent interface [CentralTraffic,ContinentTrraffic]
		CentralTraffic a = new KoreaTraffic();
		a.redStop();
		a.greenGo();
		a.flashYellow();
		KoreaTraffic at = new KoreaTraffic();
		at.walkSymbol();
		ContinentTrraffic ayy = new KoreaTraffic();
		ayy.Trainsymbol();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redStop implementation");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("Flash Yellow implementation");
	}
	public void walkSymbol()
	{
		System.out.println("walk symbol implementation");
	}

	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("train symbol impementations");
	}

}
