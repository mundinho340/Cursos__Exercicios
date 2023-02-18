sexo = str(raw_input('INFORMA O SEU SEXO : [M/F]')).strip().upper()
while sexo not in 'MmFf':
    sexo = str(raw_input('DADOS INVALIDOS .POR FAVOR , INFORME SEU SEXO: ')).strip().upper()[0]
print('SEXO {} REGISTADO COM SUCESSO '.format(sexo))