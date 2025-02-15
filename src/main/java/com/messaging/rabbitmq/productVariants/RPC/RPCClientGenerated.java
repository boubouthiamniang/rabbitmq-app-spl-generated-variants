package com.messaging.rabbitmq.productVariants.RPC;



import com.messaging.rabbitmq.traits.QueueTraits;
import com.messaging.rabbitmq.traits.RPCCLientTraits;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class RPCClientGenerated {

    public static void main(String[] argv) throws Exception {

        QueueTraits queueTraits = new QueueTraits() {};
        RPCCLientTraits rpccLientTraits = new RPCCLientTraits() {};

        ConnectionFactory factory = null;

        Connection connection = null;
        Channel channel = null;

        // Create properties with correlation ID and reply queue
        AMQP.BasicProperties props = null;

        String message = "myRequest";
        
        rpccLientTraits.publishRPCRequest(channel, message, message, message, message, false, props, message);

    }
}
