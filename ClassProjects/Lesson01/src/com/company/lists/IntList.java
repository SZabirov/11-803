package com.company.lists;

public interface IntList {
    /**
     * Adds number to the end of the list
     * @param elem number to add
     */
    void add(int elem);

    void add(int elem, int position);

    /**
     * Returns the element with specified index
     */
    int get(int index);

    //возвращает удаленный элемент
    int remove(int index);

    //возвращает кол-во эл-тов в списке
    int size();

    //возвращает содержимое списка в виде массива
    int[] toArray();

    //упорядочивает числа в списке по возрастанию
    void sort();

    //вставляет в данный список все элементы из list, начиная
    //с position в данном списке
    void addAll(IntList list, int position);

    //индекс последнего вхождения данного элемента в списке
    int lastIndexOf(int elem);
}




