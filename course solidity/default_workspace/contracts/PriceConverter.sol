pragma solidity 0.8.8;

contract FoundMe {
    function fund() public {
        //want to be able to set a minimum fund amount in USD

        require(msg.value>1e18, "didn't sen anogh!");
    }

    // function withdraw
}