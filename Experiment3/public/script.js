const ctx = document.getElementById('weatherChart').getContext('2d');
let chart;

document.getElementById('updateBtn').addEventListener('click', async () => {
  const city = document.getElementById('cityInput').value.trim();
  if (!city) {
    alert("Please enter a city name.");
    return;
  }

  try {
    const res = await fetch(`/weather/${city}`);
    const data = await res.json();

    if (data.temperature === undefined) {
      alert(data.error || "Failed to fetch weather.");
      return;
    }

    const temp = data.temperature;

    const now = new Date();
    const label = now.toLocaleTimeString();

    if (!chart) {
      chart = new Chart(ctx, {
        type: 'line',
        data: {
          labels: [label],
          datasets: [{
            label: `Temperature in ${city} (°C)`,
            data: [temp],
            borderColor: 'rgba(0,123,255,1)',
            backgroundColor: 'rgba(0,123,255,0.1)',
            fill: true,
          }]
        },
        options: {
          scales: {
            y: {
              beginAtZero: false
            }
          }
        }
      });
    } else {
      chart.data.labels.push(label);
      chart.data.datasets[0].data.push(temp);
      chart.update();
    }

  } catch (err) {
    console.error(err);
    alert("Something went wrong while fetching weather.");
  }
});
