from random import randint
from time import sleep
tenta = 0
computador =  randint(0, 10)
jogador = int(input('QUAL E O NUMERO QUE O COMPUTADOR ESCOLHEU'))
print('jo')
sleep (0.1)
print('KEN')
sleep (0.1)
print('po!!!!!')
print('o computador escolheu {}'.format (computador))
print('o jogador escolheu {}'.format (jogador))
while computador != jogador:
     s = int (input ('tente novamente'))
     if jogador != computador:
        print('jo')
        sleep (0.1)
        print('KEN')
        sleep (0.1)
        print('po!!!!!')
         if jogador == computador:
             print ()
             tenta += 1

print('o computador escolheu {} voce escolheu {}'.format (computador))
print('voce venceu com {} tentativas'.format (tenta))
print('jogador venceu ')
