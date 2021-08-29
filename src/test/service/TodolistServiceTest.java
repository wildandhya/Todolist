package test.service;

// import entity.Todolist;
import repository.TodolistRepository;
import repository.TodolistRepositoryImp;
import service.TodolistService;
import service.TodolistServiceImp;

public class TodolistServiceTest {
    public static void main(String[] args) {
        testRemoveTodolist();
    }

    public static void testShowTodolist(){

        TodolistRepositoryImp todolistRepository = new TodolistRepositoryImp();
        // todolistRepository.data[0] = new Todolist("Belajar java Dasar");
        // todolistRepository.data[1] = new Todolist("Belajar java Dasar");
        TodolistService todolistService = new TodolistServiceImp(todolistRepository);

        todolistService.showTodolist();
    }

    
    public static void testAddTodolist(){

        TodolistRepository todolistRepository = new TodolistRepositoryImp();
        TodolistService todolistService = new TodolistServiceImp(todolistRepository);

        todolistService.addTodolist("Belajar Java OOP");
        todolistService.addTodolist("Belajar Java Maven");
        todolistService.addTodolist("Mancing");

        todolistService.showTodolist();
    }

    public static void testRemoveTodolist(){

        TodolistRepository todolistRepository = new TodolistRepositoryImp();
        TodolistService todolistService = new TodolistServiceImp(todolistRepository);

        todolistService.addTodolist("Belajar Java OOP");
        todolistService.addTodolist("Belajar Java Maven");
        todolistService.addTodolist("Mancing");

        todolistService.showTodolist();

        todolistService.removeTodolist(2);
        
    
        todolistService.showTodolist();
    }
}
