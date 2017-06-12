package com.game.lll.net;

import com.game.lll.handler.GameProtobufVarint32FrameDecoder;
import com.game.lll.handler.PlayerReadTimeoutHandler;
import com.game.lll.protobuf.LCPacket;
import com.google.protobuf.Message;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;

public class ServerChannelHandler extends ChannelInitializer<SocketChannel>{
	private Message defaultInstance;

	@Override
	protected void initChannel(SocketChannel ch) throws Exception {
		//解码
		ch.pipeline().addLast("frameDecoder",new GameProtobufVarint32FrameDecoder());
		ch.pipeline().addLast("protobufDecoder",new ProtobufDecoder(LCPacket.Login.getDefaultInstance()));
		ch.pipeline().addLast("frameEncoder",new ProtobufVarint32LengthFieldPrepender());
		ch.pipeline().addLast("protobufEncoder",new ProtobufEncoder());
		ch.pipeline().addLast("readTimeOut",new PlayerReadTimeoutHandler(1200));
		ch.pipeline().addLast("handler",new ServerHandler());
	}
}
