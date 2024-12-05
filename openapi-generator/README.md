# `openapi-generator`


## execute main scenario
```
$ ./gradlew run
```

## generate schema
```
docker run --rm -v $PWD:/local -v $PWD/../openapi.yaml:/openapi.yaml openapitools/openapi-generator-cli generate -i /openapi.yaml -g java -o /local/generated -c /local/openapi.json
cd generated
mvn install
mvn clean package
cp target/lib/* ../app/libs/
cp target/generated-0.0.1-SNAPSHOT.jar ../app/libs/
```
