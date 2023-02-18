num = int (input ('DIGITE O VALOR : '))
num2 = int (input ('DIGITE O VALOR: '))
opcao = 3
print('''OPCOES 
[1] SOMAR 
[2] MULTIPLICAR
[3] NOVOS NUMEROS 
[4] SAIR DO PROGRAMA''')
opcao = int (input ('escolha uma opcao: '))
while opcao not in 1 :
    num = int (input ('DIGITE O VALOR : '))
    num2 = int (input ('DIGITE O VALOR: '))
if opcao == 1:
    soma = num + num2
    print('{} + {} = {}'.format(num, num2, soma))
elif opcao == 2:
    multi =num * num2
    print('{} x {} = {}'.format(num, num2, multi))
else:
     print('FECHOU O PROGRAMA')



