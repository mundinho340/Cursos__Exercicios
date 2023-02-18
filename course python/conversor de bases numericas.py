num = int(input('digite o numero :'))
print(''' [1] conversao para binario
 [2] conversao para octal 
 [3] conversao para hexadecimal''')
opcao = int(input('escolha a opcao '))

if opcao ==  1:
    print('o valor {} convertido para binario e {}'.format(num, bin(num)[2:]))
elif opcao == 2 :
    print('o valor {} convertido para octal e {} '.format(num, oct(num)[2:]))
elif opcao == 3 :
    print('o valor {} convertido para hexadecimal {}'.format(num, hex(num)[2:]))
else :
    print ('opcao invalida . tente novamente ')