from random import randint
from time import sleep
jogador= int(input('QUAL E O SEU PALPITE'))
tenta = 0
computador=1
while computador != jogador:
     jogador = int(input ('tente novamente: '))
     computador = randint (0, 10)
     tenta += 1
     print('jo')
     sleep (0.1)
     print('KEN')
     sleep (0.1)
     print('po!!!!!')
     print('o computador escolheu {} voce escolheu {}'.format (computador, jogador))
print('voce venceu com {} tentativas'.format (tenta))
print('jogador venceu ')
