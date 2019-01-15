# spring-boot-rabbitmq-example

This project is an example spring boot and dockerized rabbit mq instance.

**Configuration**
* Spring-Boot is running at localhost:8081

**Starting the app**

`$ docker-compose -f docker-compose-rabbitmq.yml up -d`

`Starting rabbitmq ... done`

Then run the following command:

`$ gradle bootRun`

**Trying the app out**

When a new config object is saved, then it is pushed to queue. At the listener component, created config dto is logged 





