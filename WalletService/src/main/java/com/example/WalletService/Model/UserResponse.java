package com.example.WalletService.Model;

import com.example.WalletService.Model.User;

import java.util.List;

public class UserResponse {
    private List<User> list;

    public List<User> getList(){
        return list;
    }
    public void setList(List<User> list){
        this.list=list;
    }
}
