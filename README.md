# CartFlow — State Persistent Cart

A Spring Boot + MySQL shopping-cart prototype that keeps cart state on the server and exposes REST APIs for create, update, retrieve and delete operations.

## Stack
Java 17 · Spring Boot · Spring Data JPA · MySQL · HTML/CSS/JavaScript · Maven

## APIs
- GET `/api/cart/{cartId}`
- POST `/api/cart/{cartId}/items`
- PUT `/api/cart/{cartId}/items/{itemId}`
- DELETE `/api/cart/{cartId}/items/{itemId}`
- DELETE `/api/cart/{cartId}/clear`

## Run
1. Create/use MySQL. The application creates `cartflow_db` automatically.
2. Update credentials in `src/main/resources/application.properties` if needed.
3. Run `mvn spring-boot:run`.
4. Open `http://localhost:8080`.

The frontend uses a demo cart ID and communicates with the REST API without full-page refreshes.