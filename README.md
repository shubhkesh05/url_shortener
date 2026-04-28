<img width="1892" height="870" alt="image" src="https://github.com/user-attachments/assets/b031e545-39fe-4464-b0f5-ad0bdbbebfbc" />

# 🔗 URL Shortener (Spring Boot)

A simple and efficient URL Shortener built using Spring Boot.
This application converts long URLs into short links and redirects users to the original URL.

---

## 🚀 Features

* Convert long URLs into short links
* Redirect short URL to original URL
* REST API based backend
* Lightweight and fast

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* REST API
* Maven

---

## 📌 API Endpoints

### 1. Shorten URL

* **URL:** `/shorten`
* **Method:** POST
* **Params:**

  * `url` (String)

**Example:**
/shorten?url=https://google.com

**Response:**
abc123

---

### 2. Redirect to Original URL

* **URL:** `/{shortCode}`
* **Method:** GET

**Example:**
/abc123

👉 This will redirect to the original URL.

---

## ▶️ How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/url-shortener.git
   ```

2. Navigate to project folder:

   ```bash
   cd url-shortener
   ```

3. Run the application:

   ```bash
   mvn spring-boot:run
   ```

4. Open browser:

   ```
   http://localhost:8080/
   ```

---

## ⚠️ Note

* Make sure Java and Maven are installed
* Add a home endpoint (`/`) to avoid 404 error

---

## 📷 Example Flow

1. Send POST request to shorten URL
2. Receive short code
3. Open short URL in browser
4. Redirect to original website

---

## 🤝 Contributing

Feel free to fork this repository and contribute.

---

## 📄 License

This project is open-source and free to use.
