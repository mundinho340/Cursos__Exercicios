jogador = dict()
partidas = list()
jogador['nome'] = str(raw_input('Nome: '))
tot = int(input('Quantas partidas {} jogou '.format(jogador['nome'])))
for c in range(0, tot):
    partidas.append(int(input('{} Quantos golos '.format(c))))
jogador['gols']= partidas[:]
jogador['total'] = sum(partidas)
print('-='*30)
print(jogador)
print('-='* 30)
for k, v in jogador.items():
    print('o campo {} tem o valor {} '.format(k , v))
print('-='*30)
print('O jogador {} jogou {} partidas'.format(jogador['nome'], len(jogador['gols'])))
for i, v in enumerate(jogador['gols']):
    print('<= Na partida {}, fez {} gols'.format(i, v))
print('foi um total de {} '.format(jogador['total'], jogador['gols']))
