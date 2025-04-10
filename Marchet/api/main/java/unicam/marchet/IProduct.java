public interface IProduct {
  void setLabel();
  void getLabel(); 
  void applyInformation(String information);
  void modifyInformation();
  void addCertification(Certification certification);
  void removeCertification (Certification certification);
}
