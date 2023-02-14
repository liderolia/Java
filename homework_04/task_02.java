/*Задание 2:
Создать очередь с помощью LinkedList и реализовать следующие методы:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
Вызвать полученные методы и убедиться в их работоспособности.*/

package homework.homework_04;

import java.util.LinkedList;

public class task_02 {
    public static void main(String[] args) { 
        LinkedList<Integer> linList = new LinkedList<>();
        linList.add(1);
        linList.add(2);
        linList.add(3);
        System.out.println(linList);
        enqueue(linList, 4); // помещает элемент в конец очереди и выводит в консоль
        dequeue(linList); // возвращает первый элемент из очереди, удаляет его и выводит в консоль список
        System.out.println(first(linList)); // возвращает первый элемент из очереди, не удаляя и выводит его в консоль
    }

    public static LinkedList<Integer> enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
        System.out.println(list);
        return list;
    }
    
    public static int dequeue(LinkedList<Integer> list) {
        int temp = list.get(0);
        list.remove(0);
        System.out.println(list);
        return temp;
    }
    
    public static int first(LinkedList<Integer> list) {
        return list.get(0);
    }

}
