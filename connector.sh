#!bin/bash

curl -i -X POST -H "Content-Type: application/json" -d @connectors/clientes.json http://localhost:8003/api/kafka-connect-1/connectors