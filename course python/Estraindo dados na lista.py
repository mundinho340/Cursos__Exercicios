valor = []
c =0
while True:
    n =(int(input('Digite um valor  ')))
    c +=1
    valor.append(n)
    r = raw_input('Quer continuar ? [N/S]').upper()
    if 'N' in r:
        break
if 5 in valor :
        print('O valor 5 faz parte da lista  ')
else:
    print('O valor 5 nao faz parte da lista ')
valor.sort(reverse=True)
print('voce digitou {} elementos '.format(c))
print('Os valores em ordem decrescente {}'.format(valor))