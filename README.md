
# Open API Example Microservice

This is an API example to test the API platform.
It has 3 endpoints, one for each level of authorisation (open, application-restricted and user-restricted).
Version 2.0 of this API uses multi-file OAS specification.

## hello-world
This is an open resource (hence it doesn't require any type of authorisation)

request:
```
GET /world
```
response:
```
{
    "message":"Hello World"
}
```

## hello-application
This is an application-restricted resource 

request:
```
GET /application
```
response:
```
{
    "message":"Hello Application"
}
```

## hello-user
This is a user-restricted resource

request:
```
GET /user
```
response:
```
{
    "message":"Hello User"
}
```

# Definition
API definition for this service will be available under `/api/definition` endpoint.
See definition in `/resources/public/api/definition.json` for the format.

# Run tests
```
sbt test
```

# Run locally
```
./run_local.sh
```
and test with
```
curl http://localhost:10500/world
```

# License

This code is open source software licensed under the [Apache 2.0 License]("http://www.apache.org/licenses/LICENSE-2.0.html")