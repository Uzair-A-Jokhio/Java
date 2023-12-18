import socket

# Set up the server socket
server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server_socket.bind(('localhost', 8888))
server_socket.listen(1)

print("Server is listening on port 8888")

# Accept a connection from a client
client_socket, client_address = server_socket.accept()
print(f"Accepted connection from {client_address}")

# Send data to the Java client
data_to_send = "Hello from Python!"
client_socket.sendall(data_to_send.encode())

# Close the connection
client_socket.close()
server_socket.close()
