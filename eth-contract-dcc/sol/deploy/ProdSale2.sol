pragma solidity ^0.4.18;

import '../sales/PrivateSale.sol';

/**
 * ddc
 */
contract ProdSale2 is PrivateSale {

    function ProdSale() public PrivateSale(
        0xffc76f9e43ee85cbeb837dd63741ce24ef03205d, //walletAddress
        0xFFa93Aacf49297D51E211817452839052FDFB961, //tokenAddress
        0x2395e6cd89c702512de3f801ca3cdf95ec9f7901, //kycAndRateAddress
        (10 ** 18) * 2500000000, //_total
        (10 ** 18) * 100, //_lowerLimitWeiPerHand
        25, //_roundUnlockPercent
        60 * 60 * 24 * 60 //_roundCoolDown
    ) {
    }
}
