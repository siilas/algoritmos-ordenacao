package com.github.siilas.apa.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

import com.github.siilas.apa.model.Sorted;
import com.google.common.base.Stopwatch;

@Component
public class BubbleSort implements Sortable {

    @Override
    public Sorted sort(Integer[] vetor) {
        Stopwatch time = Stopwatch.createStarted();
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                System.out.println("Comparação: " + vetor[i] + " - " + vetor[j]);
                if (vetor[i] < vetor[j]) {
                }
            }
        }
        time.stop();
        System.out.println("Tempo: " + time.elapsed(TimeUnit.MILLISECONDS));
        return null;
    }

}
