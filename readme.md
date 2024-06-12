### Pseudocode method Add Book:

    method addBook(title, author, genre, year, language)
    newBook = create instance of Books
    
    newBook.setTitle(title)
    newBook.setAuthor(author)
    newBook.setGenre(genre)
    newBook.setYear(year)
    newBook.setLanguage(language)

    add newBook to the books list
    
    lastBook = get the last book from the books list
    
    print Book added: Title: lastBook.getTitle() 
          Author: lastBook.getAuthor() 
          Genre: lastBook.getGenre() 
          Year: lastBook.getYear() 
          Language: lastBook.getLanguage()
    end method