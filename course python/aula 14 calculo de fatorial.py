from time import sleep
from datetime import date
r = date.today().isoformat()
sexo = str(raw_input('QUAL E O TEU SEXO [M/F] : ')).strip().upper()[0]
p = 0
while sexo not in 'MmFf':
    print('SEXO INCORRETO TENTE NOVAMENTE')
    sexo = str(raw_input('TENTE NOVAMENTE : ')).strip().upper()[0]
    p+=1
print('tiveste {} tentativas '.format(p))
print('REGISTOU O SEXO {} COM SUCESSO'.format(sexo))
print('REGISTOU AOS {} '.format(r))

