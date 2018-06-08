package org.netty.provider;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class SimpleHelloServerHandler extends SimpleChannelInboundHandler<String>{
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, String msg) throws Exception {
        System.out.println("Simple Server Read...\n");
        System.out.println(channelHandlerContext.channel().remoteAddress() + " get message "+msg);
        channelHandlerContext.write(msg);
        channelHandlerContext.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        System.out.println(cause.toString());
        super.exceptionCaught(ctx, cause);
    }
}
