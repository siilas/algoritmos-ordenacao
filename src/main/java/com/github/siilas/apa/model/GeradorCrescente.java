package com.github.siilas.apa.model;

import java.util.Arrays;
import java.util.Random;

import com.github.siilas.apa.enums.Algoritmos;
import com.github.siilas.apa.enums.Casos;

import lombok.val;

public class GeradorCrescente implements GeradorDeInformacoes {

    public Vetores gerarVetores() {
        val vetor = new Vetores();
        vetor.setCaso(Casos.CRESCENTE);
        for (Integer size : SIZE_OF_ARRAYS) {
            val gerador = new Random();
            val vetorGerado = new Integer[size];
            for (int i = 0; i < size; i++) {
                vetorGerado[i] = gerador.nextInt(Integer.MAX_VALUE);
            } 
            Arrays.sort(vetorGerado);
            for (Algoritmos algoritmo : Algoritmos.values()) {
                vetor.getVetores().add(Vetor.builder()
                        .vetorOriginal(vetorGerado)
                        .size(size)
                        .algoritmo(algoritmo)
                        .naoCalculado(false)
                        .build());
            }
        }
        return vetor;
    }
    
}
