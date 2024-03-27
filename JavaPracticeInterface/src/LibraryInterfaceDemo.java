public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser kid = new KidUser();
        kid.registerAccount(10);
        kid.registerAccount(18);
        kid.requestBook("Kids");
        kid.requestBook("Fiction");


        AdultUser adult = new AdultUser();
        adult.registerAccount(5);
        adult.registerAccount(23);
        adult.requestBook("Kids");
        adult.requestBook("Fiction");
    }
}
/*
Output:
You have successfully registered under a Kids Account
Sorry, age must be less than 12 to register as a kid
Book issued successfully, please return the book within 10 days
OOps, you are allowed to take only kids books.
Sorry, age must be greater than 12 to register as an adult.
You have successfully registered under an Adult Account.
Oops, you are allowed to take only adult Fiction books.
Book Issued successfully, please return the book within 7 days.
 */
