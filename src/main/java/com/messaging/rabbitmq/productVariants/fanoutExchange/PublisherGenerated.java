package com.messaging.rabbitmq.productVariants.fanoutExchange;

import com.rabbitmq.client.Connection;
import com.messaging.rabbitmq.traits.ChannelTraits;
import com.messaging.rabbitmq.traits.ConnectionTraits;
import com.messaging.rabbitmq.traits.ExchangeTraits;
import com.messaging.rabbitmq.traits.ProducerTraits;
import com.messaging.rabbitmq.traits.QueueTraits;
import com.rabbitmq.client.Channel;

public class PublisherGenerated {

  public static void main(String[] argv) throws Exception {

      ConnectionTraits connectionTraits = new ConnectionTraits() {};
      ChannelTraits channelTraits = new ChannelTraits() {};    
      ExchangeTraits exchangeTraits = new ExchangeTraits() {}; 
      QueueTraits queueTraits = new QueueTraits() {};
      ProducerTraits producerTraits = new ProducerTraits() {};

      Connection connection = null;
      Channel channel = null;
      
      exchangeTraits.declareExchange(channel, null, null);

      String message = "";

      producerTraits.publish(channel, null, null, null);
  }
}
