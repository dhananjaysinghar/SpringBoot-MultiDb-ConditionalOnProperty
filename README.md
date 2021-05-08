# SpringBoot-MultiDb-ConditionalOnProperty

## @ConditionalOnProperty(prefix = "app.database", name = "type", havingValue = "NOSQL")
~~~
curl --location --request POST 'http://localhost:8080/users' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id": "1",
    "name": "dhananjaya",
    "address": "Bangalore"
}'



curl --location --request GET 'http://localhost:8080/users'
~~~
