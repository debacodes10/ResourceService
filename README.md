# RESOURCE MICROSERVICE

## RESOURCE APIs

### API EXAMPLES

- CREATE (POST) RESOURCE (/api/resource/)
```bash
curl -X POST http://localhost:8081/api/resource/ \
-H "Content-Type: application/json" \
-d '{
  "name": "Main Hall",
  "resource": "ROOM",
  "bookings": []
}'
```

- GET ALL RESOURCES (/api/resource/)
```bash
curl -X GET http://localhost:8081/api/resource/
```

- GET RESOURCE BY _id (/api/resource/{id})
```bash
curl -X GET http://localhost:8081/api/resource/{_id}
```

- GET RESOURCE BY NAME (/api/resource/name/{name})
```bash
curl http://localhost:8081/api/resource/name/Main%20Hall
```

- UPDATE RESOURCE BY _id (/api/resource/{_id})
```bash
curl -X PUT http://localhost:8081/api/resource/{_id} \
-H "Content-Type: application/json" \
-d '{
  "name": "Updated Room",
  "resource": "ROOM",
  "bookings": []
}'
```

- DELETE RESOURCE BY _id (/api/resource/{_id})
```bash
curl -X DELETE http://localhost:8081/api/resource/{_id}
```

## BOOKING APIs

### API EXAMPLES

- CREATE (POST) BOOKING (/api/booking/)
```bash
curl -X POST http://localhost:8081/api/booking/ \
-H "Content-Type: application/json" \
-d '{
  "resourceId": "res123",
  "clubId": "club456",
  "eventId": "event789",
  "requestedBy": {
    "userId": "user001",
    "name": "John Doe",
    "email": "john@example.com"
  },
  "startTime": "2025-06-01T10:00:00",
  "endTime": "2025-06-01T12:00:00",
  "status": "PENDING"
}'
```

- GET ALL BOOKINGS (/api/booking/)
```bash
curl http://localhost:8081/api/booking/
```

- GET BOOKING BY _id (/api/booking/{_id})
```bash
curl http://localhost:8081/api/booking/{_id}
```

- GET BOOKING BY RESOURCE ID (/api/booking/resource/{resourceId})
```bash
curl http://localhost:8081/api/booking/resource/{resourceId}
```

- GET BOOKING BY CLUB ID (/api/booking/club/{clubId})
```bash
curl http://localhost:8081/api/booking/club/{clubId}
```

- GET BOOKING BY EVENT ID (/api/booking/event/{eventId})
```bash
curl http://localhost:8081/api/booking/event/{eventId}
```

- GET BOOKING BY STATUS (/api/booking/status/{status})
```bash
curl http://localhost:8081/api/booking/status/{status}
```

- GET BOOKING BY TIME BETWEEN (/api/booking/time-between)
```bash
curl "http://localhost:8081/api/booking/time-between?startTime=2025-06-01T00:00:00&endTime=2025-06-01T23:59:59"
```

- GET BOOKING BY REQUESTED BY USER ID (/api/booking/requested-user/{userId})
```bash
curl http://localhost:8081/api/booking/requested-user/{userId}
```

- UPDATE BOOKING BY _id (/api/booking/{_id})
```bash
curl -X PUT http://localhost:8081/api/booking/{_id} \
-H "Content-Type: application/json" \
-d '{
  "resourceId": "res123",
  "clubId": "club456",
  "eventId": "event789",
  "requestedBy": {
    "userId": "user001",
    "name": "John Doe",
    "email": "john@example.com"
  },
  "startTime": "2025-06-01T13:00:00",
  "endTime": "2025-06-01T14:00:00",
  "status": "APPROVED"
}'
```

- DELETE BOOKING BY _id (/api/booking/{_id})
```bash
curl -X DELETE http://localhost:8081/api/booking/{_id}
```