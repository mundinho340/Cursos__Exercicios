from datetime import date
actual = date.today().year
nasc = int(input('ano de nascimento '))
idade = actual - nasc
print ('Quem nasceu em {} tem {} anos em {}'.format(nasc, idade, actual))
if idade == 18:
    print('voce tem que se alistar emediatamente ')
elif idade <18:
    saldo = 18 - idade
    print('ainda faltam {} anos para o alistamento '.format(saldo))
    ano = actual + saldo
    print ('seu alistamento sera em {} '.format(ano))
elif idade > 18:
    saldo = idade - 18
    print('voce ja deveria ter se alistado a {} anos '.format(saldo))
    ano = actual - saldo
    print('alistamento foi em {} '.format(ano))






