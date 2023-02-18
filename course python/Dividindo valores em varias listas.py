num = list()
pares = list()
impares = list()
while True :
    num.append(int(input('Digite um numero ')))
    resp = str(raw_input('Quer continuar ? [S/N] ')).upper()
    if 'N' in resp:
        break
for i, v in enumerate(num):
    if v % 2 == 0:
        pares.append(v)
    elif v % 2 ==1:
        impares.append(v)
print('-='* 30)
print('A lista completa e {} '.format(num))
print('A lista de pares e {} '.format(pares))
print('A lista de impares e {}'.format(impares))