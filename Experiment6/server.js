// Import required modules
const http = require('http');
const os = require('os');
const path = require('path');
const { EventEmitter } = require('events');

// Create an event emitter
const eventEmitter = new EventEmitter();

// Create the HTTP server
const server = http.createServer((req, res) => {
  res.writeHead(200, { 'Content-Type': 'text/plain' });
  res.end('Hello, World!\n');
});

// Define server port and hostname
const port = 3000;
const hostname = '127.0.0.1';

// Start the server
server.listen(port, hostname, () => {
  console.log(`Server running at http://${hostname}:${port}/`);
});

// Display OS information
console.log('OS Type:', os.type());
console.log('OS Platform:', os.platform());
console.log('OS Architecture:', os.arch());
console.log('CPU Cores:', os.cpus().length);

// Show current working directory
console.log('Current Working Directory:', process.cwd());

// Use path module to join directory path
const joinedPath = path.join(__dirname, 'public', 'images');
console.log('Joined Path:', joinedPath);

// Handle and emit a custom event
eventEmitter.on('customEvent', (data) => {
  console.log('Custom Event Triggered:', data);
});

eventEmitter.emit('customEvent', { message: 'Hello from custom event!' });
//cd C:\Users\sonam\OneDrive\Desktop\SDC\Experiment6
//node server.js




