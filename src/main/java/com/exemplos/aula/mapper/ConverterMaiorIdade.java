package com.exemplos.aula.mapper;

public class ConverterMaiorIdade {

    public static Boolean converter(String maiorIdade){
        var fullAge = Boolean.FALSE;

        if(maiorIdade.equals("Sim")){
            fullAge = Boolean.TRUE;
        }
        return fullAge;
    }

}
