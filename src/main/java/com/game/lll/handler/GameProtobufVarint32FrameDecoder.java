package com.game.lll.handler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;

import java.util.List;

public class GameProtobufVarint32FrameDecoder extends ProtobufVarint32FrameDecoder
{
    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out)
        throws Exception
    {
        super.decode(ctx, in, out);
    }
    
}
