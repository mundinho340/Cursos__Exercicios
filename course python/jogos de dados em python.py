from random import randint
from time import sleep
from operator import itemgetter
jogo = {'jogador 1': randint(1, 6),
        'jogador 2': randint(1, 6),
        'jogador 3': randint(1, 6),
        'jogador 4': randint(1, 6)}
raking = []
for k, v in jogo.items():
    print('-{} tirou {} no dado'.format(k, v))
    sleep(1)
print '-='*30
print('==RAKING DOS JOGADORES==')
raking = sorted(jogo.items(), key=itemgetter(1), reverse=True)
for i, v in enumerate(raking):
    print('{} lugar {} com {}'.format(i+1, v[0], v[1]))
    sleep(1)
