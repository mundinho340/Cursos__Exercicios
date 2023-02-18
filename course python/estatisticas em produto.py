total = totmil =menor =cont =0
barato = ' '
while True:
    produto = str(raw_input('NOME DO PRODUTO ')).strip().upper()[0]
    preco =float(input('PRECO '))
    cont +=1
    total+=preco
    if preco >1000:
        totmil+=1
    if cont ==1 or preco <menor :
        menor = preco
        barato = produto
    resp =' '
    while resp not in 'SN':
        resp = str(raw_input('QUER CONTINUAR ? [S/N] ')).strip().upper()[0]
    if resp == 'N':
            break
print('fim do programa')
print('o total da compra foi {} '.format(total))
print('temos {} produtos custando mais de 1000 rs'.format(totmil))
print('o produto mais barato foi {} que custou {} '.format(barato, menor))



