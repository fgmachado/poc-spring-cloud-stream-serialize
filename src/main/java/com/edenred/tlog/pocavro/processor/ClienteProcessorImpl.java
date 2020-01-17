package com.edenred.tlog.pocavro.processor;

import io.confluent.connect.avro.ClienteAvroDto;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@EnableBinding(ClienteProcessor.class)
public class ClienteProcessorImpl {

    @StreamListener(ClienteProcessor.CLIENTES)
    public void receive(ClienteAvroDto payload) {
        System.out.println(payload);
    }

}
