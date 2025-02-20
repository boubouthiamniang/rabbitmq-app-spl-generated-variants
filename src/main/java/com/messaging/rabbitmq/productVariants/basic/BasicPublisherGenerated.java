package com.messaging.rabbitmq.productVariants.basic;
import com.rabbitmq.client.Connection;
import com.messaging.rabbitmq.traits.ChannelTraits;
import com.messaging.rabbitmq.traits.ConnectionTraits;
import com.messaging.rabbitmq.traits.ProducerTraits;
import com.messaging.rabbitmq.traits.QueueTraits;
import com.rabbitmq.client.Channel;

public class BasicPublisherGenerated {
    public static void main(String[] argv) throws Exception {

        ConnectionTraits connectionTraits = new ConnectionTraits() {};
        ChannelTraits channelTraits = new ChannelTraits() {};    
        QueueTraits queueTraits = new QueueTraits() {};
        ProducerTraits producerTraits = new ProducerTraits() {};

        Connection connection = null;
        Channel channel = null;

        String message = "";

        queueTraits.declareQueue(channel, message, false, false, false, null);
        producerTraits.publish(channel, null, null, null);
    }
}