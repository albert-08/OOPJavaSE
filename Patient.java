public class Patient {
  //Atributos
  String name;
  String email;
  String address; 
  String phoneNumber; 
  String birthday;
  double weight;
  double height; 
  String blood;

  Patient(String name, String email) {
    System.out.println("Patient Name: " + name);
    System.out.println("Patient Email: " + email);
  }
}