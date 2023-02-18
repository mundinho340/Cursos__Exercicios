from random import randint
from time import sleep
itens = ('pedra', 'papel', 'tesoura')
computador = randint(0, 2)
print('''opcoes 
[0] pedra
[1] papel
[2] tesoura ''')
jogador = int(input('QUAL E A SUA JOGADA : '))
print('jo')
sleep(1)
print('ken')
sleep(1)
print('po')
print('-='*11)
print('computador jogou {} '.format(itens[computador]))
print('jogador jogou {} '.format(itens[jogador]))
print ('-='*11)
if computador== 0: #computador jogou pedra
    if jogador==0:
        print('EMPATE')
    elif jogador==1:
        print('JOGADOR VENCE')
    elif jogador == 2:
        print('COMPUTADOR VENCE')
    else:
        print('JOGADA INVALIDA')
elif computador ==1: #oputador jogou papel
    if jogador==0:
        print('computador vence ')
    elif jogador == 1:
        print('EMPATE')
    elif jogador==2:
        print('jogador vence')
    else:
        print('JOGADA INVALIDA')
elif computador==2 : #computador jogou tesoura
    if jogador==0:
        print('JOGADOR VENCE')
    elif jogador==1:
        print('COMPUTADOR VENCE')
    elif jogador ==2:
        print('EMPATE')
    else:
        print('JOGADA INVALIDA')

