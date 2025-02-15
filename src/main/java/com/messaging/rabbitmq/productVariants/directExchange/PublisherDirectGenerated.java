package com.messaging.rabbitmq.productVariants.directExchange;

import com.messaging.rabbitmq.traits.ExchangeTraits;
import com.messaging.rabbitmq.traits.ProducerTraits;
import com.messaging.rabbitmq.traits.QueueTraits;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class PublisherDirectGenerated {

    public static void main(String[] argv) throws Exception {

        ExchangeTraits exchangeTraits = new ExchangeTraits() {};
        ProducerTraits producerTraits = new ProducerTraits() {};

        ConnectionFactory factory = null;
        Connection connection = null;
        Channel channel = null;

        exchangeTraits.declareExchange(channel, null, null);

        String message = "Thank you mario, but our princess is in another castle";

        producerTraits.publish(channel, null, null, null);
    }
    
}
