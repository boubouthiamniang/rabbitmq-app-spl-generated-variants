package com.messaging.rabbitmq.productVariants.directExchange;

import com.messaging.rabbitmq.traits.ChannelTraits;
import com.messaging.rabbitmq.traits.ConnectionTraits;
import com.messaging.rabbitmq.traits.ExchangeTraits;
import com.messaging.rabbitmq.traits.ProducerTraits;
import com.messaging.rabbitmq.traits.QueueTraits;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class PublisherDirectGenerated {

    public static void main(String[] argv) throws Exception {

        ConnectionTraits connectionTraits = new ConnectionTraits() {};
        ChannelTraits channelTraits = new ChannelTraits() {};    
        ExchangeTraits exchangeTraits = new ExchangeTraits() {}; 
        ProducerTraits producerTraits = new ProducerTraits() {};
        QueueTraits queueTraits = new QueueTraits() {};

        Connection connection = null;
        Channel channel = null;

        exchangeTraits.declareExchange(channel, null, null);

        String message = "";

        producerTraits.publish(channel, null, null, null);
    }
    
}
