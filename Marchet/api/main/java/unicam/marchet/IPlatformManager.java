public interface IPlatformManager implements IUser{
    
    void createCurator(); 

    void ban(user User);

    void accessDatabase();

}
