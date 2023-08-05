package ru.netology.javaqa;

public class AlreadyExistsException extends RuntimeException { // класс AlreadyExistsException, наследующийся от предка
    public AlreadyExistsException(String message) { // конструктор с параметром-сообщением
        super(message); //, вызывающий конструктор предка
    }
}