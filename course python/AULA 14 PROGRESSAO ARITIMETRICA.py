primeiro =int(input('valor '))
raz = int(input('a razao '))
cont = 1
termo = primeiro
while cont< 10:
    print('{}'.format(termo))
    termo += raz
    cont += 1
print('acabou')
