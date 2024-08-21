package mx.edu.utez.proyectorecupera.repository;

import java.util.List;

public interface DaoRepository <T>{
    List<T> findAll();
    T findOne(Long id);
    String save(T object);
    String update(T object);
    String delete(Long id);
}
