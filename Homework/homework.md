0. Чтобы я мог оценить д/з, дайте доступ к репозиторию на bitbucket пользователю Zabirov. 

# Homework01

1. Проверка корректности скобок с использованием стека.
2. Реализовать IntList с помощью массива.

# Homework02

1. Реализовать итератор для IntArrayList
2. Написать реализацию стека для целых чисел на связном списке (методы возьмите те же, что и в старой реализации на массиве).
3. Реализовать Очередь (Queue) целых чисел с методами enqueue (добавление в конец очереди)  и dequeue (выбор с удалением из начала очереди) *(про очередь погуглите)*. Можете написать реализацию очереди или на массиве, или на связном списке - на ваш выбор.

# Honework03

1. Определить класс `Student` с несколькими полями (напр., имя, фамилия, номер группы и т. д.). Для класса `Student` переопределить метод `equals()`. Написать класс `Group`, хранящий список студентов в массиве в упорядоченном виде. В `Group` реализовать метод `add()`  для добавления в нужное место студента. Написать не менее треъ компараторов для студентов
2. Изменить `SimpleMap` так, чтобы при заполнении массива `entries[]`, выполнялось "динамическое расширение массива". Затем обработать текстовый документ (просмотреть все слова из файла) так, чтобы получить SimpleMap с парами ключ - значение, где ключи - это все (уникальные) слова из книги, а значения - это количество вхождений слова в текстовый файл. Способ проверки содержимого SimpleMap'а выбрать самостоятельно (например, можно сделать метод `K[] getKeys()` для получения всех ключей, можно по-другому - на ваш выбор).
3. (опционально) Написать `SortedSimpleMap`, которая реализует `Map<K, V>` и хранит свои entries в отсортированном по ключу виде (как сортировать - должно задаваться компаратором, переданным в конструктор при создании экземпляра словаря). При поиске по ключу использовать бинарный поиск. Применть `SortedSimpleMap`для решения задачи номер 2 и сравнить, какая из реализаций (SortedSimple или Simple) работает быстрее.
4. Реализовать методы из BinarySearchTree
5. Написать метод
	```
	public static <T> List<T> getMany(Class<T> aClass, int count, Object... params) {
	```
	Так, чтобы можно было получить список из 100 студентов с одинаковыми именами  одинаковым возрастом:
	```
	List<SimpleStudent> list = SuperBestAwesomeFramework.getManyWithCons(SimpleStudent.class, 100, "John", 40);
	```

# Homework 14

Сделать задачу с thread'ами

# Homework 16

Написать не менее 7 полезных разных тестов на вашу собственную реализацию LinkedList'а

