// SPDX-License-Identifier: MIT

pragma solidity ^0.8.8;

/**
 * @title Storage
 * @dev Store & retrieve value in a variable
 * @custom:dev-run-script ./scripts/deploy_with_ethers.ts
 */
contract Storage {
    uint256 public favoriteNumber ;
    struct People{
        string name;
        uint256 favoriteNumber;
    }

    People[] public people;

    function addPerson(string memory _name, uint256 _favoriteNumber) public {
        People memory newPerson = People({name: _name, favoriteNumber: _favoriteNumber});
        people.push(newPerson);
    
    }
      function store(uint256 _favoriteNumber) public{
        favoriteNumber = _favoriteNumber; 
        uint256 testVar =5;
    }

    function retrieve() public view returns(uint256){
        return favoriteNumber;
    }

    
}