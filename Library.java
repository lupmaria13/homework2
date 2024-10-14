public class Library {
    public static void main(String[] args) {
        Author author = new Author("Alex Michaeldies", "alex.michaeldies@email.com");

        // Creează o carte
        Book book = new Book("Pacienta  tacuta", 2016, author, 45.99);

        // Afișează detaliile cărții
        System.out.println("Book " + book.getName() + " (" + book.getPrice() + " RON), by "
                + book.getAuthor().getName() + ", published in " + book.getYear());
    }
}

