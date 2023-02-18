maior = 0
menor = 0
for p in range(1, 6):
    peso = float(input('PESO DA {} PESSOA '.format(p)))
    if p == 1:
        maior= peso
        menor= peso
    else:
        if peso>maior:
            maior = peso
        if peso<menor :
            menor = peso
print('O PESO LIDO FOI DE {} KG'.format(maior))
print ('O PESO LIDO FOI DE {} KG '.format(menor))
