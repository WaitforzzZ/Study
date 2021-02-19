package com.waitfor.study;

import org.assertj.core.util.Lists;

/**
 * 责任链模式测试
 *
 * @author zhouliang
 * @since 2021-2-19下午 4:50
 */
public class ChainTest {

    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(Lists.newArrayList(new HandlerA(),new HandlerB()));
        handlerChain.handle();

        HandlerChain2 handlerChain2 = new HandlerChain2();
        handlerChain2.addHandler(Lists.newArrayList(new HandlerA2(),new HandlerB2()));
        boolean resultFlag = handlerChain2.handle();
        if(!resultFlag){
            System.out.println("责任链中处理器不满足条件");
        }
    }
}
