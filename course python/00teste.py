from time import sleep
n1 = int(input('DIGITE UM VALOR '))
n2 = int(input('DIGITE UM VALOR '))
opcao = 0
while opcao!= 5:
    print('''    [ 1 ] SOMA 
    [ 2 ] MULTIPLICACAO
    [ 3 ] MAIOR 
    [ 4 ] NOVOS NUMEROS
    [ 5 ] SAIR DO PROGRAMA''')
    opcao = int(input('ESCOLHA UMA OPCAO VALIDA : '))
    if opcao == 1:
        soma = n1 + n2
        print('{} + {} = {}'.format(n1, n2, soma))
    elif opcao == 2:
        produto = n1*n2
        print('{} X {} = {}'.format(n1, n2, produto))
    elif opcao == 3:
        if n1 > n2:
            maior = n1
            print('ENTRE {} E {} O MAIOR NUMERO E {}'.format (n1, n2, maior))
        else:
            maior = n2
            print('ENTRE {} E {} O MAIOR NUMERO E {}'.format(n2, n1, maior))
    elif opcao == 4:
        n1 = int (input ('DIGITE UM VALOR '))
        n2 = int (input ('DIGITE UM VALOR '))
    elif opcao == 5:
        print ('FECHANDO O PROGRAMA ......')
    else:
        print('opcao invalida tente novamente')
        sleep(1)
print('PROGRAMA ENCERRADO , OBRIGADO POR USAR O NOSSO PROGRAMA')



