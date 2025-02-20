package com.messaging.rabbitmq.productVariants.basic;

import com.messaging.rabbitmq.traits.ChannelTraits;
import com.messaging.rabbitmq.traits.ConnectionTraits;
import com.messaging.rabbitmq.traits.ConsumerTraits;
import com.messaging.rabbitmq.traits.QueueTraits;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class BasicConsumerGenerated {

    public static void main(String[] argv) throws Exception {

        ConnectionTraits connectionTraits = new ConnectionTraits() {};
        ChannelTraits channelTraits = new ChannelTraits() {};    
        QueueTraits queueTraits = new QueueTraits() {};
        ConsumerTraits consumerTraits = new ConsumerTraits() {};

        Connection connection = null;
        Channel channel = null;

        queueTraits.declareQueue(channel, null, false, false, false, null);

        consumerTraits.consume(channel, null, false);
    }
}
