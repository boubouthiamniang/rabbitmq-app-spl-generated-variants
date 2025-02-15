package com.messaging.rabbitmq.productVariants.PublisherConfirms;

import com.messaging.rabbitmq.traits.ChannelTraits;
import com.messaging.rabbitmq.traits.ExchangeTraits;
import com.messaging.rabbitmq.traits.ProducerConfirmsTraits;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class PublisherConfirmsAsyncGenerated {

    public static void main(String[] args) throws Exception {

        ExchangeTraits exchangeTraits = new ExchangeTraits() {};
        ChannelTraits channelTraits = new ChannelTraits() {};
        ProducerConfirmsTraits producerConfirmsTraits = new ProducerConfirmsTraits() {};

        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        exchangeTraits.declareExchange(channel, null, null);

        channelTraits.channelConfirmSelect(channel);

        producerConfirmsTraits.handlePublishConfirmsAsynchronously(channel, null, null, null);
    }
}
