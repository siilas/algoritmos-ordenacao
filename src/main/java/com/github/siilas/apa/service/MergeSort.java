package com.github.siilas.apa.service;

import org.springframework.stereotype.Component;

import com.github.siilas.apa.enums.Algoritmos;

@Component
public class MergeSort implements Sortable {

    @Override
    public Integer[] specificSort(Integer[] vetor) {
        ordena(vetor, 0, vetor.length);
        return vetor;
    }

    @Override
    public Algoritmos getAlgoritmo() {
        return Algoritmos.MERGE_SORT;
    }
    
    public void ordena(Integer[] vetor, int indiceInicio, int indiceFim) {
        if (vetor != null && indiceInicio < indiceFim && indiceInicio >= 0 &&
         indiceFim < vetor.length && vetor.length != 0) {
            int meio = ((indiceFim + indiceInicio) / 2);
            ordena(vetor, indiceInicio, meio);
            ordena(vetor, meio + 1, indiceFim);
            merge(vetor, indiceInicio, meio, indiceFim);
        }

    }
    
    public void merge(Integer[] array, int indiceInicio, int meio, int indiceFim) {
        Integer[] auxiliar = (Integer[]) new Comparable[array.length];
        for (int i = indiceInicio; i <= indiceFim; i++) {
            auxiliar[i] = array[i];
        }
        int i = indiceInicio;
        int j = meio + 1;
        int k = indiceInicio;
        while (i <= meio && j <= indiceFim) {
            if (auxiliar[i].compareTo(auxiliar[j]) < 0) {
                array[k] = auxiliar[i];
                i++;
            } else {
                array[k] = auxiliar[j];
                j++;
            }
            k++;
        }
        while (i <= meio) {
            array[k] = auxiliar[i];
            i++;
            k++;
        }
        while (j <= indiceFim) {
            array[k] = auxiliar[j];
            j++;
            k++;
        }
    }

}
