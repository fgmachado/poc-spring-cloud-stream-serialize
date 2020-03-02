package com.edenred.tlog.pocavro.processor;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ClienteProcessor {

    String CLIENTES = "clientes";

    @Input(CLIENTES)
    SubscribableChannel clientes();

}
