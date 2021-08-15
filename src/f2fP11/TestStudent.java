public class TestStudent
{
    // driver test for student class
    public static void main(String[] args) {
        Student student1 = new Student(
                "Deo Amani The Greatest",
                2021,
                "AirCraft Engineer",
                "Imagine Nation",
                "+250786162457");
        System.out.println("We have A student "+ student1);
        System.out.print("\nStudent was not from "+ student1.getCountry());
        student1.setCountry(" Sharp Mind ");
        System.out.println(". The student was actually from "+ student1.getCountry());

        Student student2 = new Student(
                "Deo Amani The Greatest",
                2021,
                "AirCraft Engineer",
                "Imagine Nation");
        System.out.println("\n\nWe have Another student "+ student1);
        student1.setPhoneNumber("+257849514782 ");
        System.out.println("\nStudent phone Numbers is "+ student1.getPhoneNumber());


    }
}
