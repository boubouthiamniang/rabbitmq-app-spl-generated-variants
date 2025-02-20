package com.messaging.rabbitmq.productVariants.directExchange;


import com.messaging.rabbitmq.traits.ChannelTraits;
import com.messaging.rabbitmq.traits.ConnectionTraits;
import com.messaging.rabbitmq.traits.ConsumerTraits;
import com.messaging.rabbitmq.traits.ExchangeTraits;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class ConsumerDirectGenerated {

    public static void main(String[] argv) throws Exception {

        ConnectionTraits connectionTraits = new ConnectionTraits() {};
        ChannelTraits channelTraits = new ChannelTraits() {};    
        ExchangeTraits exchangeTraits = new ExchangeTraits() {}; 
        ConsumerTraits consumerTraits = new ConsumerTraits() {};

        Connection connection = null;
        Channel channel = null;

        exchangeTraits.declareExchange(channel, null, null);

        channelTraits.channelQueueBind(channel, null, null, null);

        consumerTraits.consume(channel, null, false);
    }
}