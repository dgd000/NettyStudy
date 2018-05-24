package org.netty.provider;

public class ServerBootstrap {
    public static void main(String[] args) {
        NettyServer.startServer0("localhost",8088);
        System.out.print("Netty Server Start:" + "localhost:8088");
    }
}
