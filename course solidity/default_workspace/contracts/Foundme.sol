pragma solidity 0.8.8;

contract Foundme {
    function fund() public payable{
        //want to be able to set a minimum fund amount in USD
        // 1. How do ewe send ETH to this contract? 
        require(msg.value>1e18, "didn't sen anogh!");
    }

    // function withdraw
}