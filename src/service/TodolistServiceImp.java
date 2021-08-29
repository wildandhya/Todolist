package service;

import entity.Todolist;
import repository.TodolistRepository;

public class TodolistServiceImp implements TodolistService{

    private TodolistRepository todolistRepository;

    public TodolistServiceImp( TodolistRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
    }

    @Override
    public void showTodolist() {
        Todolist[] model = todolistRepository.getAll();
        System.out.println("TODOLIST");
        for(var i = 0; i < model.length; i++){
            var todolist = model[i];
            var no = i + 1;

            if(todolist != null){
                System.out.println(no + "." + todolist.getTodo());
            }
        }
        
    }

    @Override
    public void addTodolist(String todo) {
      Todolist todolist = new Todolist(todo);
      todolistRepository.add(todolist);

      System.out.println("SUKSES MENAMBAHKAN : " + todo);
    }

    @Override
    public void removeTodolist(Integer number) {
       boolean success = todolistRepository.remove(number);

       if(success){
           System.out.println("SUKSES MENGHAPUS TODO: " + number);
       }else{
        System.out.println("GAGAL MENGHAPUS TODO: " + number);
       }
        
    }
    
}
