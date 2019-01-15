# spring-boot-elastic-search-example

This project is an example spring boot and dockerized Elasticsearch instance.

**Configuration**
* Spring-Boot is running at localhost:8081
* Elasticsearch is running at localhost:9200, but receives direct communication from Spring via 9300

**Starting the app**

`$ docker-compose up -d`

`Starting elasticsearch_elasticsearch_1 ... done`

Then run the following command:

`$ gradle bootRun`

**Trying the app out**

You can post the sample data at book.json.
You can get sample books with the following example. Query is done according to title, author and description attribute.

`http://localhost:8081/books?searchTerm=JavaScript`



