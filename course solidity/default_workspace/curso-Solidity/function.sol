pragma solidity 0.8.9;

contract meu_contrato{
  function soma(uint _a, uint _b) external pure returns(uint){
      return _a + _b;
  }
  string nome= "Raimundo";
  
  function verCalculo() external view returns(string memory){
      return nome;
  }
    mapping[address => uint] saldos;
  

  function insvestir() public payable returns (uint){
      saldos[msg.sender]+= msg.value;
      return saldos[msg.sender];
  }
}