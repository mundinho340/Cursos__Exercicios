num = int(input('digite um numero: '))
tot = 0
for c in range (1,num + 1):
    if num % c== 0:
        print ('\033[33m')
        tot +=1
    else:
        print('\033[31m')
    print(' {} '.format(c))
print('\n\033[m O NUMERO {} FOI DIVISIVEL {} VEZES '.format(num, tot))
if tot == 2:
    print('E POR ISSO ELE E PRIMO')
else:
    print('E POR ISSO ELE NAO E um numero PRIMO')



