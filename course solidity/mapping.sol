//Hello guys my name is Krypthon, so yha , away

// SPDX-License-Indentifier: MIT
pragma solidity ^0.8.8;

contract SimpleStorage{

    mapping(string => uint256) public findPerson;

    struct People{
        string name;
        uint256 favoriteNumber;
    }

    People[] public people;

    function addPerson(string memory _name, uint256 _favoriteNumber) public {
        People memory newPerson = People({name: _name, favoriteNumber: _favoriteNumber});
        people.push(newPerson);
        findPerson[_name] = _favoriteNumber;
    
    }
}
