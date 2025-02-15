package com.messaging.rabbitmq.productVariants.basic;

import com.messaging.rabbitmq.traits.ConsumerTraits;
import com.messaging.rabbitmq.traits.QueueTraits;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class BasicConsumerGenerated {

    public static void main(String[] argv) throws Exception {

        QueueTraits queueTraits = new QueueTraits() {};
        ConsumerTraits consumerTraits = new ConsumerTraits() {};

        ConnectionFactory factory = null;

        Connection connection = null;
        Channel channel = null;

        queueTraits.declareQueue(channel, null, false, false, false, null);

        consumerTraits.consume(channel, null, false);
    }
}
