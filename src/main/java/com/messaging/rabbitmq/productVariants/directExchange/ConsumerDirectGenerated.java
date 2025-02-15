package com.messaging.rabbitmq.productVariants.directExchange;


import com.messaging.rabbitmq.traits.ChannelTraits;
import com.messaging.rabbitmq.traits.ConsumerTraits;
import com.messaging.rabbitmq.traits.ExchangeTraits;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class ConsumerDirectGenerated {

    public static void main(String[] argv) throws Exception {

        ExchangeTraits exchangeTraits = new ExchangeTraits() {};
        ChannelTraits channelTraits = new ChannelTraits() {};
        ConsumerTraits consumerTraits = new ConsumerTraits() {};

        ConnectionFactory factory = null;

        Connection connection = null;
        Channel channel = null;

        exchangeTraits.declareExchange(channel, null, null);

        channelTraits.channelQueueBind(channel, null, null, null);

        consumerTraits.consume(channel, null, false);
    }
}