package com.messaging.rabbitmq.productVariants.PublisherConfirms;

import com.messaging.rabbitmq.traits.ChannelTraits;
import com.messaging.rabbitmq.traits.ConnectionTraits;
import com.messaging.rabbitmq.traits.ProducerConfirmsTraits;
import com.messaging.rabbitmq.traits.QueueTraits;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class PublisherConfirmsBatchGenerated {
    public static void main(String[] args) throws Exception {

        ConnectionTraits connectionTraits = new ConnectionTraits() {};
        ChannelTraits channelTraits = new ChannelTraits() {};    
        QueueTraits queueTraits = new QueueTraits() {};
        ProducerConfirmsTraits producerConfirmsTraits = new ProducerConfirmsTraits() {};
        
        Connection connection = null;
        Channel channel = null;

        queueTraits.declareQueue(channel, null, false, false, false, null);
        channelTraits.channelConfirmSelect(channel);

        String message = "";

        producerConfirmsTraits.publishMessagesInBatch(channel, null, message, null, 0);
    }
}
