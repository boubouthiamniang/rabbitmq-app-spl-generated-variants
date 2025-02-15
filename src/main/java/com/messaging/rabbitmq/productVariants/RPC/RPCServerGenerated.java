package com.messaging.rabbitmq.productVariants.RPC;

import com.messaging.rabbitmq.traits.ChannelTraits;
import com.messaging.rabbitmq.traits.QueueTraits;
import com.messaging.rabbitmq.traits.RPCServerTraits;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class RPCServerGenerated {
    public static void main(String[] argv) throws Exception {

        QueueTraits queueTraits = new QueueTraits() {};
        ChannelTraits channelTraits = new ChannelTraits() {};
        RPCServerTraits rpcServerTraits = new RPCServerTraits() {};
        
        ConnectionFactory factory = null;

        Connection connection = null; 
        Channel channel = null;
            
        queueTraits.declareQueue(channel, null, false, false, false, null);
        channelTraits.channelBasicQos(channel, 0);

        rpcServerTraits.handleMessage(channel, null, null, null);
    } 
}
