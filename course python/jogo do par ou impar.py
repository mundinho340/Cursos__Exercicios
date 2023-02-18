from random import randint
v =0
while True:
    jogador = int(input('DIGA UM VALOR '))
    computador = randint(0,10)
    total = jogador + computador
    tipo = ' '
    while tipo not in 'PI':
        tipo = str(raw_input('PAR OU IMPAR ?[I/P]')).strip().upper()[0]
    print('voce jogou {} e o computador {} total  de {} '.format(jogador, computador, total))
    print('deu par ' if total % 2 == 0 else 'deu impar')
    if tipo == 'P':
        if total %2 ==0:
            print('VOCE VENCEU')
            v +=1
        else:
            print('voce perdeu')
            break
    elif tipo == 'I':
        if total %2 ==1:
            print('VOCE VENCEU')
            v+=1
        else:
            print('voce perdeu')
            break
    print('vamos jogar novamente')
print('GAME OVER! voce Venceu {} VEZES'.format(v))

