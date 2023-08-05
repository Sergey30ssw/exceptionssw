package ru.netology.javaqa;

public class NotFoundException extends RuntimeException { //Класс исключения NotFoundException, наследуемый от RuntimeException

    public NotFoundException(String s) { //конструктор с параметром-сообщением, вызывающий суперконструктор предка
        super(s);
    }
}