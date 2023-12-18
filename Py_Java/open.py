import socket
import cv2
import numpy as np

# Set up the server socket
server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server_socket.bind(('localhost', 8888))
server_socket.listen(1)

print("Server is listening on port 8888")

# Accept a connection from a client
client_socket, client_address = server_socket.accept()
print(f"Accepted connection from {client_address}")

# Capture video from the webcam using OpenCV
cap = cv2.VideoCapture(0)

while True:
    # Read a frame from the webcam
    ret, frame = cap.read()

    # Convert the frame to bytes
    frame_bytes = frame.tobytes()

    # Send the frame size first
    client_socket.sendall(len(frame_bytes).to_bytes(4, byteorder='big'))

    # Send the frame data
    client_socket.sendall(frame_bytes)
