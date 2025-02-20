package com.messaging.rabbitmq.productVariants.RPC;



import com.messaging.rabbitmq.traits.ChannelTraits;
import com.messaging.rabbitmq.traits.ConnectionTraits;
import com.messaging.rabbitmq.traits.ExchangeTraits;
import com.messaging.rabbitmq.traits.QueueTraits;
import com.messaging.rabbitmq.traits.RPCCLientTraits;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class RPCClientGenerated {

    public static void main(String[] argv) throws Exception {

        ConnectionTraits connectionTraits = new ConnectionTraits() {};
        ChannelTraits channelTraits = new ChannelTraits() {};  
        ExchangeTraits exchangeTraits = new ExchangeTraits() {};   
        QueueTraits queueTraits = new QueueTraits() {};
        RPCCLientTraits rpcCLientTraits = new RPCCLientTraits() {};

        Connection connection = null;
        Channel channel = null;

        // Create properties with correlation ID and reply queue
        AMQP.BasicProperties props = null;

        String message = "";
        
        rpcCLientTraits.publishRPCRequest(channel, message, null, null, null, false, props, null);

    }
}
