package com.jpmc.midascore;

import com.jpmc.midascore.foundation.Transaction;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionListener {

    @KafkaListener(topics = "transaction-topic", groupId = "midas")
    public void listen(Transaction transaction) {
        System.out.println("Received transaction: " + transaction);
        
    }
}
