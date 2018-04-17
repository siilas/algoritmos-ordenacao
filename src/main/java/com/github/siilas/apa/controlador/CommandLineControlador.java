package com.github.siilas.apa.controlador;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.siilas.apa.enums.Algoritmos;
import com.github.siilas.apa.enums.Casos;
import com.github.siilas.apa.exception.ServiceException;
import com.github.siilas.apa.model.Vetor;
import com.github.siilas.apa.model.Vetores;
import com.github.siilas.apa.service.ResultadosService;
import com.github.siilas.apa.strategy.SortableStrategy;

import lombok.val;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class CommandLineControlador {

    @Autowired
    private ResultadosService resultadosService;
    
    @Autowired
    private SortableStrategy sortableStrategy;
    
    public void executar() {
        try {
            val resultados = new ArrayList<Vetores>();
            for (Casos caso : Casos.values()) {
                Vetores vetores = caso.getGerador().gerarVetores();
                for (Vetor vetor : vetores.getVetores()) {
                    for (Algoritmos algoritmo : Algoritmos.values()) {
                        sortableStrategy.getStrategy(algoritmo).sort(vetor);
                    }
                }
                resultados.add(vetores);
            }
            resultadosService.gerarResultados(resultados);
        } catch (ServiceException e) {
            log.error(e.getMessage());
        } catch (Exception e) {
            log.error("Erro ao executar algoritmos", e);
        }
    }
    
}
