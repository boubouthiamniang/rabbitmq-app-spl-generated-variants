package com.messaging.rabbitmq.productVariants.PublisherConfirms;

import com.messaging.rabbitmq.traits.ChannelTraits;
import com.messaging.rabbitmq.traits.ExchangeTraits;
import com.messaging.rabbitmq.traits.ProducerConfirmsTraits;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class PublisherConfirmsGenerated {

    static final int MESSAGE_COUNT = 50000;

    public static void main(String[] args) throws Exception {

        ExchangeTraits exchangeTraits = new ExchangeTraits() {};
        ChannelTraits channelTraits = new ChannelTraits() {};
        ProducerConfirmsTraits producerConfirmsTraits = new ProducerConfirmsTraits() {};
        
        ConnectionFactory factory = null;
        Connection connection = null;
        Channel channel = null;

        String queue = "";
        
        exchangeTraits.declareExchange(channel, queue, queue);

        String message = "Thank you mario, but our princess is in another castle";

        channelTraits.channelConfirmSelect(channel);

        producerConfirmsTraits.publishMessagesIndividually(channel, queue, message, null);
    }
}
