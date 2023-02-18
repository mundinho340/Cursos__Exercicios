print('{:=^40}'.format('LOJAS RAIMUNDO'))
preco = float(input('preco das compras MTS: '))
print('''FORMAS DE PAGAMENTO
[1] A VISTA DINHEIR / CHEQUE
[2] A VISTA CARTAO
[3] 2X NO CARTAO 
[4] 3X OU MAIS NO CARTAO 
QUAL E A OPCAO ?''')
opcao = int(input('qual  e a opcao que vais escolher '))

if opcao ==1:
    desc = preco-(preco * 10 / 100)

elif opcao == 2:
    desc = preco - (preco * 5 /100)
elif opcao == 3:
    desc = preco
elif opcao == 4:
    parcela = int(input('quantas parcelas : '))
    desc = (preco * 20/100) + preco
    total = desc / 10
    print ('SUA COMPRA SERA PARCELADA EM {}X DE {:.1f} COM JURUS'.format(parcela, total))
print('sua compra de {:.1f} mts vai custar {:.1f} mts no final'.format (preco, desc))
