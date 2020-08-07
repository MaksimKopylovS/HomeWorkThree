package MyClass;

import java.util.*;

public class Task {
    private List<String> list = new ArrayList();
    private Set<String> set;
    private int count = 0;
    private Iterator<String> iterator;

    //Подсчет повторв и вывод их в консоль
    public void countRepit(String words[]){
        //Добовляю масив строк в контейнер АррайЛист
        for(String word: words){
            list.add(word);
        }
        //Выбираю слова по идереди из масива строк
        for (String word:words){
            count=0;
            //сравниваю слова из масива строк с словами в контейнере если повторяются щечик увеличивается
            for (int i = 0; i < list.size(); i++){
                if(word == list.get(i)){
                    count++;
                }

            }
            //Если щетчик больше нуля выводится слово и сколько раз оно встречается,
            if (count>0) {
                System.out.println("Слово " + "'" + word + "'" + " встречается " + count);
                iterator = list.iterator();
                // третий цикл удаляет слово из колекции, что бы небыло повторений
                while (iterator.hasNext()){
                    String str = iterator.next();
                    if(str.equals(word)){
                        iterator.remove();
                    }
                }
            }
        }
    }
    //Поиск уникальных слов
    public void findUnicum(String words[]){
        for(String word: words){
            list.add(word);
        }
        // использовал сет так как он удаляет все дубликаты, останутся толко уникальные слова
        set = new LinkedHashSet<String>(list);
        list = new ArrayList(set);
        set = null;

        System.out.print("Уникальные слова: ");
        iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + ", ");
            }
        System.out.println("\nКоличество уникальных слов "+list.size());
    }

}
