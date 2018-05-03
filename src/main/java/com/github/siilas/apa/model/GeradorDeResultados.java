package com.github.siilas.apa.model;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;

import com.github.siilas.apa.exception.ServiceException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class GeradorDeResultados {

    public void gerarResultados(List<Vetores> resultados) {
        Workbook arquivo = new HSSFWorkbook();
        for (Vetores vetores : resultados) {
            Sheet panilha = arquivo.createSheet(vetores.getCaso().getDescricao());
            int contadorLinha = 0;
            int contadorColuna = 0;
            Row linha = panilha.createRow(contadorLinha++);
            linha.createCell(contadorColuna++).setCellValue("Algoritmo");
            linha.createCell(contadorColuna++).setCellValue("Tamanho");
            linha.createCell(contadorColuna++).setCellValue("Tempo (Nanosegundos)");
            for (Vetor vetor : vetores.getVetores()) {
                linha = panilha.createRow(contadorLinha++);
                contadorColuna = 0;
                linha.createCell(contadorColuna++).setCellValue(vetor.getAlgoritmo().getDescricao());
                linha.createCell(contadorColuna++).setCellValue(vetor.getSize());
                if (vetor.isNaoCalculado()) {
                    linha.createCell(contadorColuna++).setCellValue("-");
                } else {
                    linha.createCell(contadorColuna++).setCellValue(vetor.getTime());
                }
            }
        }
        File arquivoFinal = new File(System.getProperty("java.io.tmpdir") + File.separator + "resultados.xlsx");
        try (FileOutputStream outputStream = new FileOutputStream(arquivoFinal)) {
            arquivo.write(outputStream);
            arquivo.close();
        } catch (Exception e) {
            throw new ServiceException("Erro ao gerar resultados");
        }
        log.info("Arquivo com resultados: " + arquivoFinal.getAbsolutePath());
    }
    
}
