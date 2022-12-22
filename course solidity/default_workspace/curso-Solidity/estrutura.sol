pragma solidity 0.8.9;

contract estrutura{
    mapping(nome => string) saldos;


    struct usuarios{
        string nome;
        uint id;
        address endereco_carteira;
    }

    enum cores{
        vermelho,
        verde,
        preto
    }

    cores.preto;
}

