/*Задание 1.
Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.

Входная строка:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

Выходная строка:
select * from students where name = "Ivanov" and country = "Russia" and city = "Moscow" */

package homework.homework_02;

public class task_01 {
    public static final String QUERY = "select * from students where ";
    public static final String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
    public static void main(String[] args) {
        String paramToStr = PARAMS.replace('{', ' ').replace('}', ' '); 
        String[] newStr = paramToStr.split(","); 
        StringBuilder result = new StringBuilder(QUERY);
        for (int i = 0; i < newStr.length; i++) {
            String[] resultItem = newStr[i].replace('"', ' ').split(":"); 
            if (!"null".equals(resultItem[1].trim())) { 
                result.append(resultItem[0].trim()).append(" = ").append('"').append(resultItem[1].trim()).append('"'); /*ключ и значение соединили через = для вывода */
                if (i < newStr.length - 2)
                    result.append(" and "); 
            }
        }
        System.out.println(result);
    }
}
