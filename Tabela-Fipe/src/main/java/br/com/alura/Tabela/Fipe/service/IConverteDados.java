package br.com.alura.Tabela.Fipe.service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
