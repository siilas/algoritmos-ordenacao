package com.github.siilas.apa.service;

import java.util.concurrent.TimeUnit;

import com.github.siilas.apa.enums.Algoritmos;
import com.github.siilas.apa.model.Vetor;
import com.google.common.base.Stopwatch;

import lombok.val;

public interface Sortable {
    
    public default void sort(Vetor vetor) {
        val time = Stopwatch.createStarted();
        val vetorOrdenado = specificSort(vetor.getVetorOriginal().clone());
        val tempoDeExecucao = time.stop().elapsed(TimeUnit.MILLISECONDS);
        vetor.setAlgoritmo(getAlgoritmo());
        vetor.setTime(tempoDeExecucao);
        vetor.setVetorOrdenado(vetorOrdenado);
    }
    
    Integer[] specificSort(Integer[] vetor);

    Algoritmos getAlgoritmo();

}
