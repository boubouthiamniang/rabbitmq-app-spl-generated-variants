package com.messaging.rabbitmq.productVariants.CompetingConsumer;
import com.messaging.rabbitmq.traits.ChannelTraits;
import com.messaging.rabbitmq.traits.ConsumerTraits;
import com.messaging.rabbitmq.traits.QueueTraits;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class CompetingConsumerGenerated {

  public static void main(String[] argv) throws Exception {

      QueueTraits queueTraits = new QueueTraits() {};
      ChannelTraits channelTraits = new ChannelTraits() {};
      ConsumerTraits consumerTraits = new ConsumerTraits() {};

      ConnectionFactory factory = null;

      Connection connection = null;
      Channel channel = null;


      queueTraits.declareQueue(channel, null, false, false, false, null);

      channelTraits.channelBasicQos(channel, 0);

      consumerTraits.consumeCompeting(channel, null, false);
  }

}