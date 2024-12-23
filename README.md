# Send-SMS-Using-Rest-API-on-JAVA

This project demonstrates how to send SMS messages using a REST API with Java. The code utilizes Java's `HttpURLConnection` to make HTTP GET requests to the SMS gateway API endpoint.

---

## Features

- Sends SMS messages using REST API.
- URL encoding for message content.
- Displays API response and status codes.

---

## Requirements

- Java Development Kit (JDK) 8 or higher
- IDE (e.g., NetBeans, IntelliJ IDEA, or Eclipse)

---

## Project Structure

```
├── build/classes/sendsms
├── lib
├── nbproject
├── src/sendsms
│   └── Sendsms.java
├── README.md
├── build.xml
└── manifest.mf
```

---

## Getting Started

### 1. Clone the Repository

```
git clone https://github.com/ThaminduDisnaZ/Send-SMS-Using-Rest-API-on-JAVA.git
```

### 2. Open the Project

- Use an IDE like NetBeans or IntelliJ IDEA to open the project.

### 3. Replace API Token and Phone Number

Edit the `Sendsms.java` file:

```java
String token = "<your-api-token>";
String to = "<recipient-phone-number>";
String from = "<sender-id>";
String message = "<your-message>";
```

### 4. Build and Run

- Compile the project.
- Run the main method in `Sendsms.java`.

---

## API Reference

### Endpoint

```
https://send.lk/sms/send.php
```

### Parameters

- `token` - API token for authentication.
- `to` - Recipient's phone number.
- `from` - Sender ID.
- `message` - URL-encoded message text.

---

## Example Response

```
Response Code: 200
Response: {"status": "success", "message": "SMS sent successfully"}
```

---

## License

This project is licensed under the MIT License. See the LICENSE file for more details.

---

## Author

**Thamindu Disna**

- GitHub: [ThaminduDisnaZ](https://github.com/ThaminduDisnaZ)
- Email: [thamindudisna121@gmail.com](mailto\:thamindudisna121@gmail.com)




