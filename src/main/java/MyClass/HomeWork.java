package MyClass;

import java.util.*;

public class HomeWork {

    private static Task task;
    private static PhoneBook phoneBook ;


    public static void main(String args[]) {

/*************************************************************************************************************/
//Задание Одни
        String words[] = {"слов", "слов", "слов", "слов", "слов", "слов", "слов", "слов", "слов", "фамилии",
                            "петя","петя","петя","петя","петя","петя","apple", "orange","orange","orange","orange", "lemone", "banana", "apricot", "avocado",
                "broccoli", "carrot", "carrot","carrot","carrot","carrot","carrot", "cherry","cherry","cherry","cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear","pear","pear","pear", "pepper", "pineapple","pineapple","pineapple","pineapple", "pumpkin", "potato"};

        task = new Task();
        
        task.countRepit(words);
        System.out.println();
        task.findUnicum(words);




/*************************************************************************************************************/
        System.out.println("\nЗадание Два\n");
 //Задание Два
        phoneBook = new PhoneBook();

        phoneBook.set("Vasy","911");
        phoneBook.set("Pety","02");
        phoneBook.set("Sveta","03");
        phoneBook.set("Nasty","02");
        phoneBook.set("Grisha","555");
        phoneBook.set("Vas","915");
        phoneBook.set("Vasy","914");
        phoneBook.set("Vova", "01");
        phoneBook.set("Vasy","912");
        phoneBook.set("Pety","5231");
        phoneBook.set("Vasy","912");
        phoneBook.set("Liza", "777");
        phoneBook.set("Vasy","914");



        phoneBook.get("Vasy");
        phoneBook.get("Pety");
        phoneBook.get("Grisha");





    }
}
