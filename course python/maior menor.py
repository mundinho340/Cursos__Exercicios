resp = 'S'
soma = quant = media = maior = menor = 0
while resp in 'Ss':
    num =int(input('DIGITE UM NUMERO '))
    soma +=num
    quant +=1
    if quant == 1:
        maior = menor = num
    else:
        if num[0]>num []:
            maior = num
            if num<menor:
                menor = num[0]
    resp = str(raw_input('QUER CONTINUAR ? [S/N]')).upper().strip()[0]
print('VOCE DIGITOU {} NUMEROS E A MEDIA FOI {}'.format(quant, media))
print('O MAIOR VALOR FOI {} E O MENOR FOI {}'.format(maior, menor))
