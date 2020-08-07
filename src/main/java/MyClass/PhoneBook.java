package MyClass;


import java.util.*;

public class PhoneBook {
    private String name;
    private String phone;

    //Очень долго делал это задание, пробовал делать с HeshMapн не чего не вышло ключь всегда заминяется,
    //Сделать одинаковый ключь у меня так и не вышло, что ещё можно использовать, разобраться не успел
    //Сделал просто через LinkedList

    private List<String> list = new LinkedList();

    //Получаем на вход два Стринга, объединяем их в одну строку и добовляем в Лист
    public void set(String name, String phone) {
        list.add(name+" "+phone);
    }

    public void get(String name){
        int i = 0;
        //Буфер лист считывает первое слово в моей строке, оно всегда имя
       String buferList;
        //Цикл бьегает по всем ячейкам листа вытаскивает первое слово из строки,
        //Заипхивает в буфер и сравнивает с искомым
        while (i < list.size()) {
            buferList = list.get(i).substring(0, list.get(i).indexOf(" ") );
            if(name.equals(buferList)){
                System.out.println(list.get(i));
            }else {
            }
            i++;
        }
        System.out.println();
    }



}
