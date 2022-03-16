package services;

public interface Service<E> {
    void display();
    void add(E e);
    void edit(int id);
}
