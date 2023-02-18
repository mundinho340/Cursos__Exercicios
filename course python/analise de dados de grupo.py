tot18 = totH = totM20 =0
while True:
    idade = int(input('IDADE: '))
    sexo = ' '
    while sexo not in 'MF':
        sexo = str (raw_input ('SEXO [M/F] '))
        if idade >=18:
            tot18+=1
        if sexo == 'M':
            totH+=1
        if sexo == 'F' and idade<20:
            totM20+=1
            resp = ' '
            while resp not in 'SN':
                resp = str(raw_input('QUER CONTINUAR ? [S/N]')).strip().upper()[0]
            if resp == 'N':
                break
print('TOTAL DE PESSOAS COM MAIS DE 18 ANOS: {} '.format(tot18))
print('A TODO TEMOS {} HOMENS CADASTRADOS '.format(totH))
print('E temos {} mulheres com menos de 20anos'.format(totM20))





