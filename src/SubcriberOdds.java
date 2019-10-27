
public class SubcriberOdds extends Observer {

	@Override
	public boolean notifyObserver(Event e) {
		// TODO Auto-generated method stub
		if (e.getEventData() % 2 != 0) {
			System.out.println("Event " + e.getEventNumber() + " is odd: " + e.getEventData());
			return true;
		}
		return false;
	}

}
