package com.game.lll.net;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture; 
import io.netty.channel.ChannelInitializer; 
import io.netty.channel.ChannelOption; 
import io.netty.channel.EventLoopGroup; 
import io.netty.channel.nio.NioEventLoopGroup; 
import io.netty.channel.socket.SocketChannel; 
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

public class GameServer {
    private static Log log = LogFactory.getLog(GameServer.class);

    public static void main(String[] args) throws Exception {
        int port = 8844;
        if(args!=null&&args.length>0)
        {
            try {
                port = Integer.valueOf(args[0]);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        log.info("服务器已启动");
        ////配置服务端的NIO线程组
        //work线程组
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        //I/O线程组
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap b = new ServerBootstrap();
            b.group(bossGroup, workerGroup).channel(NioServerSocketChannel.class)
                    .handler(new LoggingHandler(LogLevel.INFO))
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        public void initChannel(SocketChannel ch) throws Exception {
                            //ch.pipeline().addLast(new ProtobufVarint32FrameDecoder());
                            //ch.pipeline().addLast(new ProtobufVarint32LengthFieldPrepender());
                            ch.pipeline().addLast(new ServerChannelHandler());
                        }
                    }).option(ChannelOption.SO_BACKLOG, 128) //最大客户端连接数为128
                    .childOption(ChannelOption.SO_KEEPALIVE, true);
            //绑定端口，同步等待成功
            ChannelFuture f = b.bind(port).sync();
            //等待服务端监听端口关闭
            f.channel().closeFuture().sync();
        } finally {
            //优雅退出，释放线程池资源
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }
}