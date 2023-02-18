n1 = (int(input('DIGITE UM NUMERO ')),
     int(input('DIGITE OUTRO NUMERO ')),
     int(input('OUTRO ')),
     int(input('O ULTIMO NUMERO ')))
tupla = (n1)
print ('o valor 9 apareceu {} veses '.format(n1.count(9)))
if 3 in n1:
    print('o valor 3 apareceu na {} posicao'.format(n1.index(3)+1))
else :
    print('nao foi encontrado o numero 3')
print('os valores pares foram ')
for n in n1:
    if  n %2 ==0 :
        print(n)
