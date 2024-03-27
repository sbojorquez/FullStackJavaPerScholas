public class KidUser implements LibraryUser {
    protected int age;
    protected String bookType;

    public void registerAccount(int age) {
        this.age = age;
        if (age <= 11) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, age must be less than 12 to register as a kid");

        }
    }

    public void requestBook(String bookType) {
        this.bookType = bookType;
        if (bookType.compareToIgnoreCase("kids") == 0) {
            System.out.println("Book issued successfully, please return the book within 10 days");
        } else {
            System.out.println("OOps, you are allowed to take only kids books.");
        }
    }
}
