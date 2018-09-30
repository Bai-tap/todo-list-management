import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TodoList {
    private List<Todo> todoList = new ArrayList<>();

    public TodoList() {
    }

    public void add(Todo todo) {
        todoList.add(todo);
    }

    public Todo find(String title) {
        Todo todo = new Todo();
        for (int i = 0; i < todoList.size(); i++) {
            if (todoList.get(i).getTitle().compareTo(title) == 0) {
                todo = todoList.get(i);
            }
        }
        return todo;
    }

    public List<Todo> showAll() {
        todoList.toString();
        return todoList;
    }

    public List<Todo> showDones() {
        List<Todo> list = new ArrayList<>();
        for (int i = 0; i < todoList.size(); i++) {
            if (todoList.get(i).isDone()) {
                list.add(todoList.get(i));
            }
        }
        list.toString();
        return list;
    }

    public List<Todo> showNotDones() {
        List<Todo> list = new ArrayList<>();
        for (int i = 0; i < todoList.size(); i++) {
            if (!todoList.get(i).isDone()) {
                list.add(todoList.get(i));
            }
        }
        list.toString();
        return list;
    }

    public List<Todo> showPastDue() {
        List<Todo> list = new ArrayList<>();
        for (int i = 0; i < todoList.size(); i++) {
            if (todoList.get(i).getDue().compareTo(new Date()) > 0 && !todoList.get(i).isDone()) {
                list.add(todoList.get(i));
            }
        }
        list.toString();
        return list;
    }

    public void removeDones() {
        for (int i = 0; i < todoList.size(); i++) {
            if (todoList.get(i).isDone()) {
                todoList.remove(todoList.get(i));
            }
        }
    }
}
