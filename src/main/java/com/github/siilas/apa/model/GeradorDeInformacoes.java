package com.github.siilas.apa.model;

public interface GeradorDeInformacoes {
    
    Integer[] SIZE_OF_ARRAYS = { 1000, 5000, 10000, 15000, 20000, 25000 };
    
    Vetores gerarVetores();

}
