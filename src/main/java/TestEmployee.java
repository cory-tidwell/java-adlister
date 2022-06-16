public class TestEmployee {

    public static void main(String[] args) {
        Employee newHire = new Employee();
        newHire.setFirstName("cory");
        newHire.setLastName("tidwell");
        System.out.println("Hello "+newHire.getFirstName().toUpperCase() + " " +newHire.getLastName().toUpperCase());
    }
}
