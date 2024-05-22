package dh.backend.dao;

import java.util.List;

public interface IDao <T> {
    T registar (T t);
    List<T> buscarTodos();
}
