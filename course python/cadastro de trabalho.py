from datetime import datetime
dados = dict()
dados['nome']= str(raw_input('Nome: '))
nasc = int(input('Ano de nascimento '))
dados['idade']= datetime.now().year - nasc
dados['ctps'] = int(input('carteira de trabalho (0 nao tem'))
if dados['ctps'] !=0:
    dados['contratacao']= int(input('Ano de contratacao'))
    dados['salario']= float(input('salario R$'))
    dados['aposentadoria']= dados['idade']+((dados['contratacao'] + 35 )- datetime.now().year)
print('-='*30)
for k , v in dados.items():
    print('-{} tem o valor {}'.format(k, v))