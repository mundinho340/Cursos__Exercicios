from time import sleep
def maior(*num):
    print('Analizando os valores anteriores....')
    cont = maior = 0
    for valor in num:
        if cont ==0:
            maior = valor
            sleep(0.3)
        else:
            if valor> maior:
                maior =  valor
        cont+=1
    print('Os valores foram no total {} valores'.format(cont))
    print('O maior valor foi {}'.format(maior))


maior(2, 3, 5,9 , 3)
maior(2, 8, 6, 7)
maior(5, 2)
maior (6)
maior()






