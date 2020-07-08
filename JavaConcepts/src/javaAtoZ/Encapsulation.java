package javaAtoZ;

class Encapsulation
{
  private String dataflairianName;
  private String dataflairianProfile;
  private int dataflairianAge;
  public String getDataflairianName() {
    return dataflairianName;
  }
  public void setDataFlairianName(String dataflairianName) {
    this.dataflairianName = dataflairianName;
  }
  public String getDataflairianProfile() {
    return dataflairianProfile;
  }
  public void setDataFlairianProfile(String dataflairianProfile) {
    this.dataflairianProfile = dataflairianProfile;
  }
  public int getDataflairianAge() {
    return dataflairianAge;
  }
  public void setDataFlairianAge(int dataflairianAge) {
    this.dataflairianAge = dataflairianAge;
  }

  public static void main (String[] args)
  {
    Encapsulation obj = new Encapsulation(); 
    // setting values of the variables
    obj.setDataFlairianName("Renuka Peshwani");
    obj.setDataFlairianAge(24);
    obj.setDataFlairianProfile("Digital Marketing Executive"); 
    // Displaying values of the variables
    System.out.println(" Name: " + obj.getDataflairianName());
    System.out.println(" Age: " + obj.getDataflairianAge());
    System.out.println(" Profile: " + obj.getDataflairianProfile());
  }
}