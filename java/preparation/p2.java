class book {
    String title;
    boolean isIssued;

    book(String title,boolean isIssued){
        this.title = title;
        this.isIssued = isIssued;
    }

    void issueBook(){
        if(isIssued){
            System.out.println(title+" is already issued");
        }else{
            isIssued = true;
            System.out.println(title+" issued succesfully");
        }
    }
    void returnBook(){
        if(isIssued){
            isIssued = false;
            System.out.println(title+" returned successfully");
        }else{
            System.out.println(title+" not issued");
        }
    }

}

class Library{
    book[] books;
    Library(book[] books){
        this.books = books;
    }
    void displayAvailbleBooks(){
        System.out.println("Available Books:");
        for(book book : books){
            if(!book.isIssued){
                System.out.println(book.title+" is available");
            }
        }
    }
}

class LMS {
    public static void main(String[] args) {
        book[] books = new book[3];
        books[0]= new book("Java Programming", false);
        books[1] = new book("Data Structures", true);
        books[2] = new book("Computer Networks", false);
        Library library = new Library(books);
        library.displayAvailbleBooks();
        books[0].issueBook();
        library.displayAvailbleBooks();
    }
}