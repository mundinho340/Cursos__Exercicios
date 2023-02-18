numeros = list()
while True:
    n = int(input('Digite um valor '))
    if n not in  numeros:
        numeros.append(n)
        print('valor adicionado com sucesso....')
    else:
        print('valor duplicado! Nao vou adicionar ....')
    r = str(raw_input('Quer continuar ? [S/N] '))
    if r in 'Nn':
            break
print('-='*30)
numeros.sort()
print('voce digitou os valores {}'.format(numeros))

