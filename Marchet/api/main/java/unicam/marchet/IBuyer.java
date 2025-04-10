puplic interface IBuyer implements IUser{
  private Kart kart;
  
  void selectProduct(); //mette nel carrello
  boolean buy(); //compra direttamente
  boolean joinEvent(Event event); //se l'evento non è al completo, l'acquirente si iscrive all'evento 
}
