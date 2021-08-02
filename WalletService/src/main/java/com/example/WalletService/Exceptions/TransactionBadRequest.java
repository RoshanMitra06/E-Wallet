package com.example.WalletService.Exceptions;

public class TransactionBadRequest extends RuntimeException{
    public TransactionBadRequest(){
        super("TransactionBadRequest");
    }
}
