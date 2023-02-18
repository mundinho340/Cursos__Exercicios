print('GERADOR PA')
print('-='*12)
primeiro = int(input('VALOR '))
raz = int(input('A RAZAO '))
termo = primeiro
mais = 10
cont = 1
total = 0
while mais!= 0:
    total= total+mais
    while cont <=total:
        print('{}'.format(termo))
        termo+= raz
        cont+=1
    print('PAUSA')
    mais = int(input('QUANTOS TERMOS VOCE QUER MOSTRAR'))
print('PROGRAMA FINALIZADO COM {} TERMOS MOSRADOS '.format(total))