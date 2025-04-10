
/**
*
* This interface is implemented by the generic user.
*
* @author Ilaria Morettini, Erika Aguiari , Luca Barchiesi.
*/
public interface IUser{
  
  /**
  * This method allows to create a new account.
  *
  * @param username, the username chosed by the user.
  *
  * @param user, the role chosed by the user.
  *
  * @param password, the password choesd by the user
  */
  void createAccount(String username, User user, String password);
  
  /**
  * This method is used to identify an already existing account.
  * 
  * @param username, the username chosed by the user.
  *
  * @param password, the password choesd by the user.  
  */
  void access(String username, String password);
  
}

