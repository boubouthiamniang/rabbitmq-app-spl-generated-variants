package com.messaging.rabbitmq.productVariants.RPC;

import com.messaging.rabbitmq.traits.ChannelTraits;
import com.messaging.rabbitmq.traits.ConnectionTraits;
import com.messaging.rabbitmq.traits.QueueTraits;
import com.messaging.rabbitmq.traits.RPCServerTraits;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class RPCServerGenerated {
    public static void main(String[] argv) throws Exception {

        ConnectionTraits connectionTraits = new ConnectionTraits() {};
        ChannelTraits channelTraits = new ChannelTraits() {};    
        QueueTraits queueTraits = new QueueTraits() {};
        RPCServerTraits rpcServerTraits = new RPCServerTraits() {};

        Connection connection = null; 
        Channel channel = null;
            
        queueTraits.declareQueue(channel, null, false, false, false, null);
        channelTraits.channelBasicQos(channel, 0);

        rpcServerTraits.handleMessage(channel, null);
    } 
}
