package com.example.WalletService.Util;

import com.example.WalletService.Model.Wallet;

public class WalletValidator {
    public boolean validateWalletRequest(Wallet wallet){
        if(wallet.getWallet_type()==null || wallet.getUser_id()<=0)
            return false;
        return true;
    }
}
