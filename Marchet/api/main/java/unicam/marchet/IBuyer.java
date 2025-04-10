puplic interface IBuyer implements IUser{
  void selectProduct(); //mette nel carrello
  void buy(); //compra direttamente
  boolean joinEvent(Event event); //se l'evento non è al completo, l'acquirente si iscrive all'evento 
}
