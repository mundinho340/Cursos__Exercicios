//Hello
// SPDX-License-Indentifier: MIT
pragma solidity ^0.8.8;

contract SimpleStorage{

    

    struct People{
        string name;
        uint256 favoriteNumber;
    }

    People[] public people;

    function addPerson(string memory _name, uint256 _favoriteNumber) public {
        People memory newPerson = People({name: _name, favoriteNumber: _favoriteNumber});
        people.push(newPerson);
    
    }
}
