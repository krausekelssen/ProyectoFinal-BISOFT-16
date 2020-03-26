package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import model.TodoItem;

public class MockDao implements TodoDao {
    private final Map<String, TodoItem> todoItemMap;

    public MockDao() {
        todoItemMap = new HashMap<String, TodoItem>();
    }

    @Override
    public TodoItem createTodoItem(TodoItem todoItem) {
        if (StringUtils.isEmpty(todoItem.getId())) {
            todoItem.setId(generateId());
        }
        todoItemMap.put(todoItem.getId(), todoItem);
        return todoItem;
    }

    @Override
    public TodoItem readTodoItem(String id) {
        return todoItemMap.get(id);
    }

    @Override
    public List<TodoItem> readTodoItems() {
        return new ArrayList<TodoItem>(todoItemMap.values());
    }

    @Override
    public TodoItem updateTodoItem(String id, boolean isComplete) {
        todoItemMap.get(id).setComplete(isComplete);
        return todoItemMap.get(id);
    }

    @Override
    public boolean deleteTodoItem(String id) {
        todoItemMap.remove(id);
        return true;
    }

    private String generateId() {
        return new Integer(todoItemMap.size()).toString();
    }
}
