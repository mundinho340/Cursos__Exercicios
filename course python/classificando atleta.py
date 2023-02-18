from datetime import date
ano = int(input('ano de nascimento '))
idade = date.today().year - ano
if idade <=9 :
    print('''o atleta tem {} anos 
CLASSIFICACAO : MERIM'''.format(idade))

elif idade <= 14:
    print('''O ATLETA TEM {} ANOS 
          CLASSIFICACAO : INFANTIL'''.format(idade))
elif idade <=19:
    print('''O ATLETA TEM {} ANOS 
           CLASSIFICACAO : JUNIOR'''.format(idade))
elif idade <=25:
    print('''O ATLETA TEM {} ANOS 
            CLASSIFICACAO : SENIOR '''.format(idade))
elif idade > 25:
    print('''O ATLETA TEM {} ANOS 
           CLASSIFICACAO : MESTRE '''.format(idade))