### Pseudocode method Add Book (class Librarian):

    method addBook(title, author, gender, year, language)
    newBook = create instance of Books
    
    newBook.setTitle(title)
    newBook.setAuthor(author)
    newBook.setGender(gender)
    newBook.setYear(year)
    newBook.setLanguage(language)

    add newBook to the books list
    
    lastBook = get the last book from the books list
    
    print Book added: Title: lastBook.getTitle() 
          Author: lastBook.getAuthor() 
          Gender: lastBook.getGender() 
          Year: lastBook.getYear() 
          Language: lastBook.getLanguage()
    end method

### Method Add Book:

This is the **method** to add a book where the user has
to enter the title, author, gender, year and language.
Then with a **variable**, the software get the last book
entered and then **print** the title, author, gender, year
and language.