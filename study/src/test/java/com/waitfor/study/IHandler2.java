package com.waitfor.study;

import java.util.ArrayList;
import java.util.List;

public interface IHandler2 {
    boolean handle();
}

class HandlerA2 implements IHandler2{

    @Override
    public boolean handle() {
        boolean result = false;
        System.out.println("执行HandlerA2");
        return result;
    }
}

class HandlerB2 implements IHandler2{

    @Override
    public boolean handle() {
        boolean result = true;
        System.out.println("执行HandlerB2");
        return result;
    }
}

class HandlerChain2 {
    List<IHandler2> handlerList = new ArrayList<>();

    public void addHandler(List<IHandler2> handlers){
        handlerList.addAll(handlers);
    }

    public boolean handle(){
        boolean resultFlag = true;
        for(IHandler2 each:handlerList){
            if(!each.handle()){
                resultFlag = false;
                break;
            }
        }
        return resultFlag;
    }
}
