package org.netty.provider;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.netty.publicinterface.impl.HelloServiceImpl;

public class HelloServerHandler extends ChannelInboundHandlerAdapter{
    @Override
    public void channelRead(ChannelHandlerContext ctx,Object msg) {
        System.out.println("server channelRead..");
        System.out.println(ctx.channel().remoteAddress() + "->Server:"+ msg.toString());
        ctx.write("server write," + "Hello,I get message:" + msg);
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx,Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
