jogador = dict()
time = list()
partidas = dict()
soma =0
while True:
    jogador.clear()
    jogador['nome'] = raw_input('Nome: do jogador')
    tot = int(input('Quantas partidas {} jogou '.format(jogador['nome'])))

    for c in range(0, tot):
        tot= int(input('Quantos golos na partida {} ? '.format(c)))
        soma+=tot



    jogador['gols']= partidas.copy()
    jogador['total']= soma
    time.append(jogador.copy())
    while True:
        resp = raw_input('Quer continuar ? [S/N] ').upper()[0]
        if resp in 'SN':
            break
        print('ERRO, Digite apenas S ou N')
    if resp in 'N':
        break
for k , v in enumerate(time):
    print('{}'.format(k))
    for d  in v :
        print('{}'.format(v))



print '-='*30


















