package com.github.siilas.apa.service;

import org.springframework.stereotype.Component;

import com.github.siilas.apa.enums.Algoritmos;

@Component
public class HeapSort implements Sortable {

    @Override
    public Integer[] specificSort(Integer[] vetor) {
        int tamanho = vetor.length;
        int troca;
        for (int indice = tamanho / 2; indice >= 0; indice--) {
            constroiHeap(vetor, tamanho, indice);
        }
        while (tamanho > 0) {
            troca = vetor[0];
            vetor[0] = vetor[tamanho];
            vetor[tamanho] = troca;
            constroiHeap(vetor, --tamanho, 0);
        }
        return vetor;
    }

    @Override
    public Algoritmos getAlgoritmo() {
        return Algoritmos.HEAP_SORT;
    }

    private void constroiHeap(Integer[] vetor, int tamanho, int indiceRaiz) {
        int ramificacao, valor;
        valor = vetor[indiceRaiz];
        while (indiceRaiz <= tamanho / 2) {
            ramificacao = 2 * indiceRaiz;
            if (ramificacao < tamanho && vetor[ramificacao] < vetor[ramificacao + 1]) {
                ramificacao++;
            }
            if (valor >= vetor[ramificacao]) {
                break;
            }
            vetor[indiceRaiz] = vetor[ramificacao];
            indiceRaiz = ramificacao;
        }
        vetor[indiceRaiz] = valor;
    }

}
