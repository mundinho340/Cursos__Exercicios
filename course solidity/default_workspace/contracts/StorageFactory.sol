//  SPDX-License-Identifier: MIT
pragma solidity ^0.8.8;


import "./SimpleStorage.sol";


contract StorageFactory{
   Storage[] public simpleStorageArray;

    function createSimpleStorageContract() public{
        Storage simpleStorage = new Storage();
        simpleStorageArray.push(simpleStorage);
    }

    //interacting with other contracts
    function sfStore(uint256 _simpleStorageIndex, uint256 _simpleStorageNumber) public {
        //adress
        //ABI - Application Binary Interface
        Storage simpleStorage =simpleStorageArray[_simpleStorageIndex].store[_simpleStorageNumber];
        simpleStorage.store(_simpleStorageNumber);
    } 

    function sfGet(uint256 _simpleStorageIndex) public view returns(uint256){
        return  simpleStorage = simpleStorageArray[_simpleStorageIndex].retrieve();;
    }
}

//inheritance & overrides