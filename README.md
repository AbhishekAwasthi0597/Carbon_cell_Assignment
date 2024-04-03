## Customer CRUD Application with Spring Boot and JWT Authentication

This project offers a REST API for managing customer data, built with Spring Boot, MySQL, and secured using JWT authentication.

**Features:**

* Create, update, and delete customer records.
* Fetch a list of customers with options for pagination, sorting, and searching.
* Retrieve individual customer details by ID.
* Secure API access through JWT token-based authentication.

**Tech Stack:**

* Backend:
    * Spring Boot
    * Spring Data JPA
    * MySQL
    * Spring Security
    * JJWT

**Getting Started:**

1. Clone the project repository.
2. Install Maven or Gradle (if required).
3. Set up and configure your MySQL database.
4. Update `application.properties` with your database credentials.
5. Run the application:
    * Maven: `mvn spring-boot:run`

**API Endpoints:**

* **Create Customer:** `POST /api/customers` (RequestBody: Customer object)
* **Update Customer:** `PUT /api/customers/{id}` (RequestBody: Customer object)
* **Get Customers:** `GET /api/customers` (QueryParams: page, size, sortField, sortDirection, searchTerm)
* **Get Customer by ID:** `GET /api/customers/{id}`
* **Delete Customer:** `DELETE /api/customers/{id}`

**Authentication:**

JWT token-based authentication safeguards your API endpoints. Users acquire tokens through login credentials, granting access to protected resources.

**Documentation:**

Detailed information about API usage and implementation can be found within the code comments and relevant project files.

**Additional Notes:**

* Unit testing and exception handling are highly recommended for robust application development.

**Contributions:**

We welcome pull requests and suggestions for improvements and additional features.

This concise README focuses on the core functionalities of the backend, providing a clear starting point for integrating the API into your desired workflows. Remember, the code itself offers further insights into the implementation details.
