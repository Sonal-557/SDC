# Experiment 6: Node.js Core Modules Demo

This experiment demonstrates the use of core Node.js modules such as `http`, `os`, `path`, and `events` by creating a simple HTTP server and displaying system information.

---

## File Structure

```
Experiment6/
└── server.js
```

---

## What This Project Does

- **Creates a basic HTTP server** that responds with "Hello, World!" on every request.
- **Displays operating system information** (type, platform, architecture, CPU cores) in the console.
- **Shows the current working directory** using Node.js process features.
- **Uses the `path` module** to join directory paths and prints the result.
- **Demonstrates the `events` module** by emitting and handling a custom event.

---

## How to Run

1. **Open a terminal** and navigate to the project directory:
   ```sh
   cd C:\Users\sonam\OneDrive\Desktop\SDC\Experiment6
   ```

2. **Run the server:**
   ```sh
   node server.js
   ```

3. **Open your browser** and go to [http://127.0.0.1:3000](http://127.0.0.1:3000) to see the server response.

4. **Check the terminal** for OS information, path operations, and custom event output.

---

## Key Concepts Demonstrated

- **http module:** Creating a web server.
- **os module:** Fetching system information.
- **path module:** Handling and joining file paths.
- **events module:** Creating and handling custom events in Node.js.

---

## Example Output

When you run the server, you will see output similar to:

```
Server running at http://127.0.0.1:3000/
OS Type: Windows_NT
OS Platform: win32
OS Architecture: x64
CPU Cores: 4
Current Working Directory: C:\Users\sonam\OneDrive\Desktop\SDC\Experiment6
Joined Path: C:\Users\sonam\OneDrive\Desktop\SDC\Experiment6\public\images
Custom Event Triggered: { message: 'Hello from custom event!' }
```

---

## Requirements

- [Node.js](https://nodejs.org/) installed on your system.

---

*This experiment helps you understand the basics of Node.js core modules and how to use them in a simple application.*
![WhatsApp Image 2025-06-11 at 08 37 19_e18c4f51](https://github.com/user-attachments/assets/73ad6f31-6a9b-4b47-bf30-0e711baa3087)
