package com.messaging.rabbitmq.productVariants.topicExchange;

import com.messaging.rabbitmq.traits.ChannelTraits;
import com.messaging.rabbitmq.traits.ConnectionTraits;
import com.messaging.rabbitmq.traits.ConsumerTraits;
import com.messaging.rabbitmq.traits.ExchangeTraits;
import com.messaging.rabbitmq.traits.QueueTraits;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class ConsumerTopicGenerated {

    public static void main(String[] argv) throws Exception {

        ConnectionTraits connectionTraits = new ConnectionTraits() {};
        ChannelTraits channelTraits = new ChannelTraits() {};    
        ConsumerTraits consumerTraits = new ConsumerTraits() {};
        QueueTraits queueTraits = new QueueTraits() {};
        ExchangeTraits exchangeTraits = new ExchangeTraits() {}; 

        Connection connection = null;
        Channel channel = null;

        exchangeTraits.declareExchange(channel, null, null);
        channelTraits.channelQueueBind(channel, null, null, null);

        consumerTraits.consume(channel, null, false);
    }
}
