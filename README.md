# station-api-test
Provides Station REST API for use in interviews

## Endpoints
### GET stations
```java
curl https://my-json-server.typicode.com/broadcastplatforms/rest-api-test/stations
[
  {
    "id": 1,
    "name": "Capital FM"
  },
  {
    "id": 2,
    "name": "Capital Xtra"
  },
  {
    "id": 3,
    "name": "Classic FM"
  },
  {
    "id": 4,
    "name": "LBC London"
  },
  {
    "id": 5,
    "name": "Heart London"
  },
  {
    "id": 6,
    "name": "Smooth London"
  }
]
```
### GET station
```java
curl https://my-json-server.typicode.com/broadcastplatforms/rest-api-test/stations/1
{
  "id": 1,
  "name": "Capital FM"
}
```
### UPDATE station
```java
curl https://my-json-server.typicode.com/broadcastplatforms/rest-api-test/stations/1 -X PUT -d "{\"name\":\"Capital London\"}"
{
  "name":"Capital London",
  "id": 1
}
```

## Your task
Create a Rest Assured test for shell test methods in `src.test.java.StationApiTest`
