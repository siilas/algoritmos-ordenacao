package com.github.siilas.apa.model;

import java.util.Arrays;
import java.util.Random;

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
            vetor.setSize(size);
            Arrays.sort(vetorGerado);
            vetor.getVetores().add(Vetor.builder().vetorOriginal(vetorGerado).build());
        }
        return vetor;
    }
    
}
