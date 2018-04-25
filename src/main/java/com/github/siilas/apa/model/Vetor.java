package com.github.siilas.apa.model;

import com.github.siilas.apa.enums.Algoritmos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Vetor {

    private Long time;
    private Integer size;
    private Algoritmos algoritmo;
    private Integer[] vetorOriginal;
    private Integer[] vetorOrdenado;
    
}
