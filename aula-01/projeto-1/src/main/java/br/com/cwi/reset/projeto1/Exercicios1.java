package br.com.cwi.reset.projeto1;

import java.util.Arrays;
import java.util.List;

public class Exercicios1 {

    public Integer somarLista(List<Integer> numeros) {
        int aux = 0;
        for(int i = 0; i < numeros.size(); i++){
            aux += numeros.get(i);
        }
        return aux;
    }

    public Double calcularMedia(List<Integer> numeros) {
        int aux = 0;
        double media = 0.0;
        for(int i = 0; i < numeros.size(); i++) {
            aux += numeros.get(i);
        }
        media = aux / numeros.size();
        return media;
    }

    public Integer obterMaiorNumero(List<Integer> numeros) {
        int maior = Integer.MIN_VALUE;
        for(int i = 0; i < numeros.size(); i++) {
            if(numeros.get(i) > maior){
                maior = numeros.get(i);
            }
        }
        return maior;
    }

    public String obterPalavraInvertida(String palavra) {
        String palavaInvertida = "";
        for(int i = 0; i < palavra.length(); i++){
            palavaInvertida += palavra.charAt((palavra.length()) - i-1);
        }
        return palavaInvertida;
    }

    public List<Integer> ordenarLista(List<Integer> numeros) {
        Integer[] listaOrdenada = numeros.toArray(new Integer[0]);
        Integer aux;
        for (int i = 0; i < numeros.size()-1; ++i){
            for (int j = 0; j < numeros.size()-i-1; ++j){
                if (listaOrdenada[j+1] < listaOrdenada[j]){
                    aux = listaOrdenada[j];
                    listaOrdenada[j] = listaOrdenada[j+1];
                    listaOrdenada[j+1] = aux;
                }
            }
        }
        return Arrays.asList(listaOrdenada);
    }
}

