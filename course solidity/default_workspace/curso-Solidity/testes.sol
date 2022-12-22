pragma solidity 0.8.8;

import "./SimpleStorage.sol";

contract meuContrato is Storage{
    function store(uint256 _favoriteNumber) public override{
        favoriteNumber = _favoriteNumber+3;
    }
}