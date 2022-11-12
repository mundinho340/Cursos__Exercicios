// SPDX-License-Indentifier: MIT
pragma solidity ^0.8.8;

contract SimpleStorage{
   uint256 public favoriteNumber ;

    //function blockChain

    function store(uint256 _favoriteNumber) public{
        favoriteNumber = _favoriteNumber; 
        uint256 testVar =5;
    }

    function retrieve() public view returns(uint256){
        return favoriteNumber;
    }

    
} 
//0xa131AD247055FD2e2aA8b156A11bdEc81b9eAD95