package com.github.siilas.apa.service;

import java.util.concurrent.TimeUnit;

import com.github.siilas.apa.enums.Algoritmos;
import com.github.siilas.apa.model.Vetor;
import com.google.common.base.Stopwatch;

import lombok.val;

public interface Sortable {
    
    public default void sort(Vetor vetor) {
        val time = Stopwatch.createStarted();
        try {
            vetor.setVetorOrdenado(specificSort(vetor.getVetorOriginal().clone()));
        } catch (StackOverflowError e) {
            vetor.setNaoCalculado(true);
        }
        val tempoDeExecucao = time.stop().elapsed(TimeUnit.NANOSECONDS);
        vetor.setAlgoritmo(getAlgoritmo());
        vetor.setTime(tempoDeExecucao);
        
    }
    
    Integer[] specificSort(Integer[] vetor);

    Algoritmos getAlgoritmo();

}
