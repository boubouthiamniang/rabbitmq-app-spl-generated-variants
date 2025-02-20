package com.messaging.rabbitmq.productVariants.topicExchange;

import com.messaging.rabbitmq.traits.ChannelTraits;
import com.messaging.rabbitmq.traits.ConnectionTraits;
import com.messaging.rabbitmq.traits.ExchangeTraits;
import com.messaging.rabbitmq.traits.ProducerTraits;
import com.messaging.rabbitmq.traits.QueueTraits;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class PublisherTopicGenerated {

    public static void main(String[] argv) throws Exception {

        ConnectionTraits connectionTraits = new ConnectionTraits() {};
        ChannelTraits channelTraits = new ChannelTraits() {};    
        QueueTraits queueTraits = new QueueTraits() {};
        ExchangeTraits exchangeTraits = new ExchangeTraits() {}; 
        ProducerTraits producerTraits = new ProducerTraits() {};

        Connection connection = null;
        Channel channel = null;

        exchangeTraits.declareExchange(channel, null, null);

        String message = "";

        producerTraits.publish(channel, null, null, message);
    }
    
}
