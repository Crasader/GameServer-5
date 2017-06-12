package com.game.lll.handler;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.util.Attribute;

public class PlayerReadTimeoutHandler extends ReadTimeoutHandler {

	public PlayerReadTimeoutHandler(int timeoutSeconds) {
		super(timeoutSeconds);
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg)
			throws Exception {
		super.channelRead(ctx, msg);
	}

	@Override
	protected void readTimedOut(ChannelHandlerContext ctx) throws Exception {
		Channel channel = ctx.channel();
		super.readTimedOut(ctx);
	}

}
