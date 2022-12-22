pragma solidity 0.8.9;


contract meuContrato{
    uint numero =20;

    function add() external returns(uint){
        return numero;
    }

    function addView() external view returns(uint){
        return numero;
    }

    function soma(uint a, uint b) external pure returns(uint){
        return a+b;
    }
}