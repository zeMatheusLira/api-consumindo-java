package org.aplicacao;

import org.aplicacao.dto.EnderecoDto;
import org.aplicacao.servico.ApiServico;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ApiServico apiServico = new ApiServico();
        try {

            EnderecoDto enderecoDto = apiServico.getEndereco("57301130");
            System.out.println(enderecoDto.getLocalidade());

        } catch (IOException e){
            throw  new RuntimeException(e);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

    }
}

/* Criamos uma classe de serviço, dentro da classe criamos o metodo getEndereco
    que ele retorna o endereco dto e dentro do EnderecoDto temos os atributos necessarios
    para gravar as informacoes das requisicoes da API
    dentro do metodo getEndereco fizemos um try e catch onde dentro do try fizemos a requisicao completa da API
    passando o cep especifico que a gente quer gravando as informacoes retornadas da API dentro de um objeto
    do tipo enderecoDto tudo isso usando a biblioteca jackson (ObjectMapper e o metodo readValue)
    dentro da main a gente ta criando o objeto do tipo enderecoDto passando o valor como valor o que é retornado do metodo
    getEndereco

    Consumindo uma API em java --- https://www.youtube.com/watch?v=lwla8PWifBA&list=WL&index=1&t=24s (video de aprendizado do Shaulin)
 */