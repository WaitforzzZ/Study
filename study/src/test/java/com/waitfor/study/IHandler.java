package com.waitfor.study;

import java.util.ArrayList;
import java.util.List;

public interface IHandler {
    void handle();
}

class HandlerA implements IHandler{

    @Override
    public void handle() {
        System.out.println("执行HandlerA");
    }
}

class HandlerB implements IHandler{

    @Override
    public void handle() {
        System.out.println("执行HandlerB");
    }
}

class HandlerChain {
    List<IHandler> handlerList = new ArrayList<>();

    public void addHandler(List<IHandler> handlers){
        handlerList.addAll(handlers);
    }

    public void handle(){
        handlerList.forEach(IHandler::handle);
    }
}
