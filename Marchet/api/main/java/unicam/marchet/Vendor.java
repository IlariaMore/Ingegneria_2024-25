public class IVendor{
  private String coordinates;
  
/* @return the location of the vendor, alternative to OSM */
public String getCoordinates(); 
  
/* @return true if the product is created successfully */
boolean createProduct();

/* @return true if the information is added with success*/
boolean addInfo();
}
