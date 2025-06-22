# Weather Chart App

This project is a simple web application that displays the current temperature of a city using a live-updating line chart. It uses Node.js with Express for the backend, Chart.js for charting, and the OpenWeatherMap API for weather data.

---

## Features

- **City Weather Search:** Enter any city name to fetch its current temperature.
- **Live Chart:** Each update adds a new point to the chart, showing temperature changes over time.
- **Error Handling:** Alerts if the city name is invalid or if there is a problem fetching data.
- **Modern UI:** Clean, responsive interface using HTML, CSS, and Chart.js.

---

## Folder Structure

```
Experiment3/
│
├── server.js
└── public/
    ├── index.html
    └── script.js
```

---

## How It Works

1. **Frontend (`public/index.html`, `public/script.js`):**
    - User enters a city name and clicks "Update Chart".
    - Sends a request to the backend to fetch the current temperature.
    - Displays the temperature on a line chart using Chart.js.

2. **Backend (`server.js`):**
    - Uses Express to serve static files and handle API requests.
    - On `/weather/:city`, fetches weather data from OpenWeatherMap API.
    - Returns the temperature as JSON.

---

## Setup & Usage

### 1. Prerequisites

- [Node.js](https://nodejs.org/) installed on your system.
- Internet connection (for fetching weather data and Chart.js CDN).

### 2. Installation

Open a terminal and run:

```sh
cd Experiment3
npm install express axios
```

### 3. Start the Server

```sh
node server.js
```

You should see:

```
✅ Server listening at http://localhost:3000
```

### 4. Open the App

- Open your browser and go to [http://localhost:3000](http://localhost:3000)
- Enter a city name and click "Update Chart" to see the temperature plotted.

---

## Configuration

- The OpenWeatherMap API key is hardcoded in [`server.js`](server.js) as `apiKey`.  
  Replace `'c97c0c1086d42990e89d64d76f50bb61'` with your own API key if needed.

---

## File Overview

- [`server.js`](server.js): Node.js Express server, handles API requests and serves static files.
- [`public/index.html`](public/index.html): Main HTML page with input, button, and chart canvas.
- [`public/script.js`](public/script.js): Handles user input, fetches weather data, and updates the chart.

---

## Example

1. Enter `London` in the input box.
2. Click **Update Chart**.
3. The chart will display the current temperature in London.
4. Each time you click, a new point (with current time) is added to the chart.

---

## Troubleshooting

- **API Key Error:** If you see errors about the API key, ensure it is valid and not expired.
- **City Not Found:** If you enter an invalid city, an alert will notify you.
- **Port in Use:** If port 3000 is busy, change the `port` variable in `server.js`.

---

## License

This project is for educational
![WhatsApp Image 2025-06-11 at 08 29 41_09f07243](https://github.com/user-attachments/assets/ce75f54a-8bf5-472c-bc3a-1febf615940b)
![WhatsApp Image 2025-06-11 at 08 29 42_043a8797](https://github.com/user-attachments/assets/5b3c7940-12a3-4ec5-82a3-22217b9f53d4)

