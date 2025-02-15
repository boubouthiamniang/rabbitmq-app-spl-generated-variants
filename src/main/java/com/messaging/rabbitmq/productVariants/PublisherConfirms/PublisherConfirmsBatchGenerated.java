package com.messaging.rabbitmq.productVariants.PublisherConfirms;

import com.messaging.rabbitmq.traits.ChannelTraits;
import com.messaging.rabbitmq.traits.ExchangeTraits;
import com.messaging.rabbitmq.traits.ProducerConfirmsTraits;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class PublisherConfirmsBatchGenerated {
    public static void main(String[] args) throws Exception {

        ExchangeTraits exchangeTraits = new ExchangeTraits() {};
        ChannelTraits channelTraits = new ChannelTraits() {};
        ProducerConfirmsTraits producerConfirmsTraits = new ProducerConfirmsTraits() {};
        
        ConnectionFactory factory = null;
        
        Connection connection = null;
        Channel channel = null;

        exchangeTraits.declareExchange(channel, null, null);

        channelTraits.channelConfirmSelect(channel);

        producerConfirmsTraits.publishMessagesInBatch(channel, null, null, null, 0);
    }
}
