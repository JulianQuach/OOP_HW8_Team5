
public class SubcriberThrees extends Observer{

	@Override
	public boolean notifyObserver(Event e) {
		// TODO Auto-generated method stub
		if (e.getEventData() % 3 == 0) {
			System.out.println("Event " + e.getEventNumber() + " is divisible by 3: " + e.getEventData());
			return true;
		}
		return false;
	}

}
