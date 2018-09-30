public class App {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Todo todo1 = new Todo();
        Todo todo2 = new Todo();
        Todo todo3 = new Todo();
        todoList.add(todo1);
        todo1.setTitle("Ôn tập");
        todo1.setDescription("Làm bài thực hành OOP");
        todo1.setDue("11/02/2018");
        todo1.toString();
        todo1.setDone(true);
        System.out.println("-------------------");
        todoList.add(todo2);
        todo2.setTitle("Di choi");
        todo2.setDescription("LOL");
        todo2.setDue("19/10/2018");
        todo2.toString();
        todoList.add(todo3);
        todo3.setTitle("dam cuoi");
        todo3.setDescription("ban than");
        todo3.setDue("19/09/2018");
        todo3.toString();
        todoList.find("Ôn tập");
        System.out.println("-------\nViec chua xong");
        todoList.showNotDones();
        System.out.println("-------\nViec da lam xong");
        todoList.showDones();
        System.out.println("--------\nViec qua han");
        todoList.showPastDue();
    }
}
