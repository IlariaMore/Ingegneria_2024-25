/**
*
* This interface is implemented by the class who manages the platform
*
* @author Ilaria Morettini, Erika Aguiari, Luca Barchiesi
*/

public interface IPlatformManager implements IUser{
    
    /**
    * This method allows the Platform Manager to create a new curator
    */
    void createCurator(); 

    /**
    * This method allows the Platform Manager to ban an account from the marketplace
    *
    * @param user, the user that needs to be banned
    */
    void ban(user User);

    /**
    * This method allows the Platform Manager to access the database
    */
    void accessDatabase();

}
