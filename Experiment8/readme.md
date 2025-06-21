# Experiment 8: Weather App with Node.js and OpenWeatherMap API

This experiment demonstrates how to build a simple weather web application using Node.js, Express, and the OpenWeatherMap API. The app allows users to view a homepage and fetch current weather data for any city.

---

## Folder Structure

```
Experiment8/
├── index.html      # Main web page for the app
└── server.js       # Node.js server with weather API logic
```

---

## Features

- **Homepage:**  
  A styled HTML page welcoming users to the FBS e-Books website.

- **Weather API Endpoint:**  
  The server exposes `/weather/:city` which fetches the current temperature for the specified city using the OpenWeatherMap API.

- **Static File Serving:**  
  The server serves static files (like `index.html`) for the frontend.

---

## How to Run

1. **Install dependencies:**  
   In the `Experiment8` folder, run:
   ```sh
   npm install express axios
   ```

2. **Start the server:**  
   ```sh
   node server.js
   ```

3. **Open your browser:**  
   Go to [http://localhost:3000](http://localhost:3000) to view the homepage.

4. **Fetch weather data:**  
   Make a GET request to  
   `http://localhost:3000/weather/{city}`  
   replacing `{city}` with the name of any city (e.g., `London`).

---

## Example

- To get the weather for Hyderabad:
  ```
  http://localhost:3000/weather/Hyderabad
  ```
  Response:
  ```json
  {
    "temperature": 304.15
  }
  ```

---

## Notes

- The temperature returned is in Kelvin by default (as per OpenWeatherMap API).
- You can extend the frontend to allow users to enter a city and display the temperature.
- The API key for OpenWeatherMap is hardcoded in `server.js`. Replace it with your own if needed.

---

## Requirements

- [Node.js](https://nodejs.org/)
- [Express](https://expressjs.com/)
- [Axios](https://axios-http.com/)

---

*This experiment helps you understand how to build a simple web server, serve static files, and consume third-party APIs using Node.js and Express.*