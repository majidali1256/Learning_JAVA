class Library {
    String[] Books;
    int No_of_books;

    Library() {
        Books = new String[100];
        No_of_books = 0;
    }

    public String Addbook(String Book) {
        this.Books[No_of_books] = Book;
        No_of_books++;
        System.out.println("\n" + Book + " Has Been Added to Library");
        return Book;
    }

    public void DisplayBooks() {
        System.out.println("\n Available Books Are: ");
        for (int i = 0; i < No_of_books; i++) {
            if (Books[i] == null) {
                continue;
            }
            System.out.println(Books[i]);
        }
    }

    public void IssueBook(String Book) {
        for (int i = 0; i < this.Books.length; i++) {
            if (this.Books[i] == Book) {
                System.out.println("\n" + Book + " Has Been Issued");
                this.Books[i] = null;
                return;
            }
        }
        System.out.println("\nBook not Found");
    }

    public void ReturnBook(String Book){
        Addbook(Book);
    }
}

    public class A34_ExerciseLibrary {
        public static void main(String[] args) {
            Library obj = new Library();
            obj.Addbook("English");
            obj.Addbook("Urdu");
            obj.Addbook("Algorithm");
            obj.Addbook("Coal");
            obj.Addbook("DSA");
            obj.Addbook("Math");
            obj.DisplayBooks();
            obj.IssueBook("DSA");
            obj.DisplayBooks();
            obj.ReturnBook("DSA");
            obj.DisplayBooks();
        }
    }


