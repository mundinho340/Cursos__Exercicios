pragma solidity 0.8.8;


contract Foundme{
    uint256 public minimumUSD=50;
    function found() public payable{
        
        require(msg.value >= minimumUSD, "didn't send enough");
    }
}