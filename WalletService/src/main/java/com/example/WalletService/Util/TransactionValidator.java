package com.example.WalletService.Util;

import com.example.WalletService.Model.Transaction;

public class TransactionValidator {
    public boolean validateRequest (Transaction request){
        if(request.getAmount()<=0)
            return false;
        return true;
    }
}
