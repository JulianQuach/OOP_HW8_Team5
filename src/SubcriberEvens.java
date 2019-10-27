
public class SubcriberEvens extends Observer {

	@Override
	public boolean notifyObserver(Event e) {
		// TODO Auto-generated method stub
		if (e.getEventData() % 2 == 0) {
			System.out.println("Event " + e.getEventNumber() + " is even: " + e.getEventData());
			return true;
		}
		return false;
	}

}
