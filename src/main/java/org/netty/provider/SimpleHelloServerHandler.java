package org.netty.provider;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class SimpleHelloServerHandler extends SimpleChannelInboundHandler<ByteBuf>{
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws Exception {
        System.out.println("Server Read...\n");
        System.out.println(channelHandlerContext.channel().remoteAddress() + " get message "+byteBuf);
        channelHandlerContext.write(byteBuf);
        channelHandlerContext.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        System.out.println(cause.toString());
        super.exceptionCaught(ctx, cause);
    }
}
