/**
*
* This interface is used by the class checks the informations added by the users in the marketplace.
*
* @author Ilaria Morettini, Erika Aguiari, Luca Barchiesi
*/
public interface ICurator implements IUser {

   /**
   * This method is used to accept an information submitted by a vendor.
   */
   void accept();

   /** 
   * This method is used to decline an information submitted by a vendor
   *
   * @param motivation, the reason why the information was declined
   */
   void decline(String motivation);
}
