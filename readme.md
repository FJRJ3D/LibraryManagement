# Getting Started

# TEAM4 DevOps F5

![Logo Team-4](../fixdev/src/main/resources/images/T4.png) 

## Guides of de Proyect
The following guides illustrate how to use some features concretely:

* [Oficial Guide of Proyect](https://www.canva.com/design/DAGHvBzyCg8/y0VQDCa1Zj3lKS_ofe3XLg/view?utm_content=DAGHvBzyCg8&utm_campaign=designshare&utm_medium=link&utm_source=editor)

## Project: Task Organizer in Java

### Overview
The goal of this project is to develop a console application in Java that allows users to manage a task list (ToDo list). The application will enable users to perform CRUD operations: Create, Read, Update, and Delete tasks. The development will follow non-object-oriented programming principles, using primitive data structures and functions.

### Roles
- **Stakeholders:** María and Diego from F5
- **Product Owner:** Hilmar
- **Scrum Master:** Jose Manuel
- **Development Team:**
    - Fran
    - Jose Manuel
    - Hilmar
    - Sofía

### Sprint Goals (Due June 6)
- **CRUD Functionality:**
    - **Add Task:** Jose Manuel
    - **Delete Task:** Fran
    - **List Tasks:** Sofía
    - **Mark Task as Completed:** Hilmar
    - **Exit:** Sofía

### Expected Deliverables
- **GitHub Repository:** Containing the project code with a comprehensive README file.
- **Kanban Board:** Managed in Trello (or another suitable tool) to track project tasks and progress.
- **Bonus:** Documentation and Guide for First Steps in the App

### Performance Criteria
- The application should function correctly in the console, allowing users to:
    - Add new tasks.
    - Delete existing tasks by specifying their index.
    - List all tasks, indicating which are completed and which are not.
    - Mark tasks as completed by specifying their index.
    - Exit the application.
 
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



### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.3.0/maven-plugin/reference/html/#build-image)

### Guides
The following guides illustrate how to use some features concretely:
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
