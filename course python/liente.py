from threading import Thread
import socket

sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
sock.connect(('localhost', 9999,))


class ReplyHandler(Thread):
    def __init__(self):
        Thread.__init__(self)
    def run(self):
        while True:
            reply = sock.recv(1024)
            print(reply)

thread = ReplyHandler()
thread.daemon = True
thread.start()

while True:
    message = raw_input('')
    sock.sendall(message)