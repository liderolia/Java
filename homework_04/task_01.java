/*Задание 1.​
Создать LinkedList целых чисел (заполнить случайными числами).
Реализуйте метод, который вернет “перевернутый” список.​*/

package homework.homework_04;

import java.util.*;

public class task_01 {
    public static void main(String[] args) { 

        LinkedList<Integer> myList = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            myList.add(i, i); 
        }                
        myList.add(3, 10);        
        myList.remove(3); //немного поиграла с добавлением/удалением объектов
        System.out.println("Исходный список: " + myList);        
        Collections.reverse(myList);
        System.out.println("Итоговый список: " + myList); 
    }
}
