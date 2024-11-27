# `microsoft/kiota`


## execute main scenario
```
$ ./gradlew run
```

## generate schema
```
docker run -v $PWD/app/src/main/java/kiota:/app/output -v $PWD/../openapi.yaml:/app/openapi.yaml mcr.microsoft.com/openapi/kiota generate --language java -n none
```
