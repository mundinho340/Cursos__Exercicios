from time import sleep
n1 = int(input('DIGITE O PRIMEIRO VALOR'))
n2 = int(input('DIGITE O SEGUNDO VALOR '))
opcao = 0
while opcao !=5:
    print('''    [ 1 ] SOMAR 
    [ 2 ] ULTIPLIAR
    [ 3 ] MAIOR 
    [ 4 ] NOVOS NUMEROS 
    [ 5 ] SAIR DO PROGRAMA''')
    opcao = int(input('escolha uma opcao'))
    if opcao == 1:
        soma = n1 + n2
        print('{} + {} = {}'.format(n1, n2, soma))
    elif opcao ==2 :
        produto = n1 *n2
        print('{} X {} = {}'.format(n1, n2, produto))
    elif opcao ==3 :
        if n1 > n2:
           maior = n1
        else:
            maior = n2
            print('ENTRE {} E {} O MAIOR NUMERO E {}'.format(n1, n2, maior))
    elif opcao == 4:
        n1 = int (input ('DIGITE O PRIMEIRO VALOR'))
        n2 = int (input ('DIGITE O SEGUNDO VALOR '))

    elif opcao == 5:
        print('FINALIANDO O PROGRAMA....')
        sleep(1)
print ('PROGRAMA INCERADO OBRIGADO POR USAR O NOSSO PROGRMA')

