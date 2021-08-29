import repository.TodolistRepository;
import repository.TodolistRepositoryImp;
import service.TodolistService;
import service.TodolistServiceImp;
import view.TodolistView;

public class App {
    public static void main(String[] args) throws Exception {

        TodolistRepository todolistRepository = new TodolistRepositoryImp();

        TodolistService todolistService = new TodolistServiceImp(todolistRepository);

        TodolistView todolistView = new TodolistView(todolistService);

        todolistView.showTodolist();

    }
}
