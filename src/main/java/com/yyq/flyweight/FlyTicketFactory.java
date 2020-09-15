package com.yyq.flyweight;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: 布里巴
 * @date: 2020/9/11
 */
public class FlyTicketFactory {
    public static final ConcurrentHashMap<String, FlyTicket> pool= new ConcurrentHashMap<String, FlyTicket>();
    ITicket queryTicket(String from,String to){
        String str = from +"->" +to;
        if(pool.containsKey(str)){
            return pool.get(str);
        }
        FlyTicket flyTicket = new FlyTicket(from, to);
        pool.put(str,flyTicket);
        return flyTicket;
    }
}
