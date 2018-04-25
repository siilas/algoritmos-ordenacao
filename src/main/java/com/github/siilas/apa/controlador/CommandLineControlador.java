package com.github.siilas.apa.controlador;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.siilas.apa.enums.Casos;
import com.github.siilas.apa.exception.ServiceException;
import com.github.siilas.apa.model.GeradorDeResultados;
import com.github.siilas.apa.model.Vetor;
import com.github.siilas.apa.model.Vetores;
import com.github.siilas.apa.strategy.SortableStrategy;

import lombok.val;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class CommandLineControlador {

    @Autowired
    private SortableStrategy sortableStrategy;
    
    @Autowired
    private GeradorDeResultados geradorResultados;
    
    public void executar() {
        try {
            log.info("Início da ordenação");
            
            val resultados = new ArrayList<Vetores>();
            for (Casos caso : Casos.values()) {
                log.info("Caso: " + caso.getDescricao());
                
                Vetores vetores = caso.getGerador().gerarVetores();
                for (Vetor vetor : vetores.getVetores()) {
                    log.info("Tamanho: " + vetor.getVetorOriginal().length);
                    
                    log.info("Ordenação: " + vetor.getAlgoritmo().getDescricao());
                    sortableStrategy.getStrategy(vetor.getAlgoritmo()).sort(vetor);
                }
                resultados.add(vetores);
            }
            log.info("Fim da ordenação e gerando resultados");
            geradorResultados.gerarResultados(resultados);
            log.info("Concluído");
        } catch (ServiceException e) {
            log.error(e.getMessage());
        } catch (Exception e) {
            log.error("Erro ao executar algoritmos", e);
        }
    }

}
