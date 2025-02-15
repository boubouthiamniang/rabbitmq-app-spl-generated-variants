package com.messaging.rabbitmq.productVariants.basic;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.messaging.rabbitmq.traits.ProducerTraits;
import com.messaging.rabbitmq.traits.QueueTraits;
import com.rabbitmq.client.Channel;

public class BasicPublisherGenerated {
    public static void main(String[] argv) throws Exception {

        QueueTraits queueTraits = new QueueTraits() {};
        ProducerTraits producerTraits = new ProducerTraits() {};

        ConnectionFactory factory =null;
        Connection connection = null;
        Channel channel = null;

        String message = "Thank you mario, but our princess is in another castle";

        queueTraits.declareQueue(channel, message, false, false, false, null);
        producerTraits.publish(channel, null, null, null);
    }
}