package test.view;

import repository.TodolistRepository;
import repository.TodolistRepositoryImp;
import service.TodolistService;
import service.TodolistServiceImp;
import view.TodolistView;

public class TodolistViewTest {
    public static void main(String[] args) {
        testRemoveTodolist();
    }

    public static void testShowTodolist() {
        TodolistRepository todolistRepository = new TodolistRepositoryImp();
        TodolistService todolistService = new TodolistServiceImp(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistService.addTodolist("Belajar Java OOP");
        todolistService.addTodolist("Belajar Java Maven");
        todolistService.addTodolist("Mancing");

        todolistView.showTodolist();
    }

    public static void testAddTodolist() {
        TodolistRepository todolistRepository = new TodolistRepositoryImp();
        TodolistService todolistService = new TodolistServiceImp(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistService.addTodolist("Belajar Java OOP");
        todolistService.addTodolist("Belajar Java Maven");
        todolistService.addTodolist("Mancing");

        todolistView.showTodolist();

        todolistView.addTodolist();

        todolistView.showTodolist();
    }

    public static void testRemoveTodolist() {
        TodolistRepository todolistRepository = new TodolistRepositoryImp();
        TodolistService todolistService = new TodolistServiceImp(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistService.addTodolist("Belajar Java OOP");
        todolistService.addTodolist("Belajar Java Maven");
        todolistService.addTodolist("Mancing");

        todolistView.showTodolist();

        todolistView.removeTodolist();

        todolistView.showTodolist();
    }
}
