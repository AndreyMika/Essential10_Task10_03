/*
Создайте класс MyDictionary<TKey,TValue>. Реализуйте в простейшем приближении возможность
использования его экземпляра. Минимально требуемый интерфейс взаимодействия с экземпляром,
должен включать метод добавления пар элементов, индексатор для получения значения элемента по
указанному индексу и свойство только для чтения для получения общего количества пар элементов.
*/
package my_global_package;

public class Main {
    public static void main(String[] args) {
        MyDictionary<Integer, String> dictionary = new MyDictionary<>();
        dictionary.add(0, "MyIndex1");
        dictionary.add(1, "MyIndex2");
        dictionary.add(2, "MyIndex3");

        System.out.println(dictionary.getArrToSrting());
    }
}
