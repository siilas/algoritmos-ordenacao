package com.github.siilas.apa.service;

public interface SortableTest {
    
    Integer[] ARRAY_ORDENADO = { 5, 10, 17, 25, 50, 72, 89 };
    Integer[] ARRAY_ALEATORIO = { 10, 5, 25, 17, 50, 89, 72 };
    Integer[] ARRAY_CRESCENTE = { 5, 10, 17, 25, 50, 72, 89 };
    Integer[] ARRAY_DECRESCENTE = { 89, 72, 50, 25, 17, 10, 5 };
    
    void deveOrdenarNumerosAleatorios();
    
    void deveOrdenarNumerosCrescentes();
    
    void deveOrdenarNumerosDecrescentes();

}
