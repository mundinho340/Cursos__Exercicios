from threading import Thread
import socket

sock, peers = None, []

class IMS(object):
    MAX_CONNECTIONS = 5

    def __init__(self):
        self.setup()
        for i in range(IMS.MAX_CONNECTIONS):
            thread = IMS.Connection()
            thread.daemon = True
            thread.start()

    def setup(self):
        global sock
        sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        sock.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEPORT, 1)
        sock.bind(('localhost', 9999,))
        sock.listen(10)

    def send_message(self, message):
        for peer in peers:
            peer.sendall(message)

    class Connection(Thread):
        def __init__(self):
            Thread.__init__(self)
        def run(self):
            peer, addr = sock.accept()
            peers.append(peer)
            while True:
                message = peer.recv(1024)
                print(message)
                for other in peers:
                    if peer != other:
                        other.sendall(message)

ims = IMS()
try:
    while 1:
        message = raw_input('')
        ims.send_message(message)
except KeyboardInterrupt:
    sock.close()
    for peer in peers:
        peer.close()