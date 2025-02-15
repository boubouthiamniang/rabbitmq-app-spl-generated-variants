package com.messaging.rabbitmq.productVariants.fanoutExchange;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.messaging.rabbitmq.traits.ExchangeTraits;
import com.messaging.rabbitmq.traits.ProducerTraits;
import com.rabbitmq.client.Channel;

public class PublisherGenerated {

  public static void main(String[] argv) throws Exception {

      ExchangeTraits exchangeTraits = new ExchangeTraits() {};
      ProducerTraits producerTraits = new ProducerTraits() {};
      ConnectionFactory factory =null;

      Connection connection = null;
      Channel channel = null;
      
      exchangeTraits.declareExchange(channel, null, null);

      String message = "Thank you Mario, but our princess is in another castle";

      producerTraits.publish(channel, null, null, null);
  }
}
