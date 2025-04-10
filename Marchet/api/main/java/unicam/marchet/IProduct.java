/**
*
* This interface is used to represent a product in the marketplace
*
* @author Ilaria Morettini, Erika Aguiari, Luca Barchiesi
*/
public interface IProduct {

  /** 
  * This method is used to name the product.
  * 
  * @param label, the name of the product.
  */
  void setLabel(String label);

  
  void getLabel(); 
  void setPrice();
  void getPrice();
  void applyInformation(String information);
  void modifyInformation();
  void addCertification(Certification certification);
  void removeCertification (Certification certification);
}
