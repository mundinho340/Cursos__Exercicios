casa = float(input('o valor da casa '))
salario = float(input('qual e o seu salario '))
ano = int(input('quantos anos vais pagar a casa '))
prestacao = casa /(ano * 12)
minimo = salario * 30 / 100
print('o salario para pagar uma casa de {:.2f} mts em {} anos '.format(casa, ano))
if minimo >= prestacao:
    print('emprestimo sera de {:.2f} mts e foi concebido '.format(prestacao))
else:
    print(' o emprestimo sera de {:.2f} mts e excede 30% do seu salario '.format(prestacao))
