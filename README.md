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