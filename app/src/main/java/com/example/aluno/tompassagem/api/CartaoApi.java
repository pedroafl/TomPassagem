package com.example.aluno.tompassagem.api;

/**
 * Created by aluno on 25/06/2018.
 */

public class CartaoApi extends Api {
    public String Cartao(String numero, String mes, String ano, String tarja, String valor) throws Exception {
        String JSONresult = this.Execute("cartao/"+numero+"/"+mes+"/"+ano+"/"+tarja+"/"+valor+"",  null, null, "GET");
        return JSONresult;


    }
}