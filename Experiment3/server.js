const express = require('express');
const axios = require('axios');
const app = express();
const port = 3000;

app.use(express.static('public'));

app.get('/weather/:city', async (req, res) => {
  const { city } = req.params;

  try {
    const apiKey = 'c97c0c1086d42990e89d64d76f50bb61'; // Use your own key
    const response = await axios.get(
      `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${apiKey}&units=metric`
    );

    const temperature = response.data.main.temp;
    res.json({ temperature });
  } catch (error) {
    console.error('Error fetching weather data:', error);
    res.status(500).json({ error: 'Error fetching weather. Make sure the city name is correct.' });
  }
});

app.listen(port, () => {
  console.log(`✅ Server listening at http://localhost:${port}`);
});
//cd C:\Users\sonam\OneDrive\Desktop\SDC\Experiment3
//node server.js
