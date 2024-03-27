class AdultUser implements LibraryUser {
    protected int age;
    protected String bookType;

    @Override
    public void requestBook(String bookType) {
        this.bookType = bookType;
        if (bookType.compareToIgnoreCase("fiction") == 0) {
            System.out.println("Book Issued successfully, please return the book within 7 days.");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books.");
        }
    }


    @Override
    public void registerAccount(int age) {
        this.age = age;
        if (age <= 11) {
            System.out.println("Sorry, age must be greater than 12 to register as an adult.");
        } else {
            System.out.println("You have successfully registered under an Adult Account.");

        }

    }
}
