public interface IEntertainer implements IUser{
  /*
  * it creates a new event using the following parameters.
  * @PARAM name for the name of the event
  * @PARAM place for where the event is taking place
  * @PARAM maxAttendees for the supported attendance
  * @PARAM date to say when the event is taking place
  * @PARAM description to give a quick description of the event
  */
  void createEvent(String name,String place, int maxAttendees, DATE date, String description );
}
