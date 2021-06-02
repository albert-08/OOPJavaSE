public class Main {
  public static void main(String[] args) {
    
    //UIMenu.showMenu();
    
    Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatria");
    System.out.println(myDoctor.name);
    System.out.println(myDoctor.speciality);
    
    System.out.println();
    System.out.println();
    Patient patient = new Patient("Alejandra", "alejandra@mail.com");
    patient.setWeight(54.6);
    System.out.println(patient.getWeight());
    
    patient.setPhoneNumber("1234567890");
    System.out.println(patient.getPhoneNumber());
  }
}