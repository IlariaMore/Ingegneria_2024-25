public interface IProduct {
  void setLabel();
  void getLabel(); 
  void addInformation(String information);
  void removeInformation();
  void addCertification(Certification certification);
  void removeCertification (Certification certification);
}
