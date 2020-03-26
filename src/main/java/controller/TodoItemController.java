package controller;

import java.util.List;

import dao.TodoDao;
import dao.TodoDaoFactory;
import model.TodoItem;

public class TodoItemController {
    public static TodoItemController getInstance() {
        if (todoItemController == null) {
            todoItemController = new TodoItemController(TodoDaoFactory.getDao());
        }
        return todoItemController;
    }

    private static TodoItemController todoItemController;

    private final TodoDao todoDao;

    TodoItemController(TodoDao todoDao) {
        this.todoDao = todoDao;
    }

    public TodoItem createTodoItem(String name,
            String category, boolean isComplete) {
    		TodoItem todoItem = new TodoItem(category, isComplete, name);
        return todoDao.createTodoItem(todoItem);
    }

    public boolean deleteTodoItem(String id) {
        return todoDao.deleteTodoItem(id);
    }

    public TodoItem getTodoItemById(String id) {
        return todoDao.readTodoItem(id);
    }

    public List<TodoItem> getTodoItems() {
        return todoDao.readTodoItems();
    }

    public TodoItem updateTodoItem(String id, boolean isComplete) {
        return todoDao.updateTodoItem(id, isComplete);
    }
}
