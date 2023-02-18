valor = []
maior = 0
menor =0
for c in range (0, 5):
    valor.append(int(input('Digite um valor ')))
    if c == 0:
        menor = maior = valor[c]
    else:
        if valor[c]> maior:
            maior = valor[c]
        if menor > valor[c]:
            menor = valor[c]
print '-='*30
print ('voce digitou os valores {}'.format(valor))
print('O maior valor e {} na posicao'.format(maior))
for i, v in enumerate (valor):
    if maior == v:
        print (i)
print('O menor valor e {} '.format(menor))
for i, v in enumerate (valor):
    if menor == v:
        print(i)