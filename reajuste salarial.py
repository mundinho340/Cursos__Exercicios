salario = float(input('qual e o seu salario : '))
aumento = salario + (salario * 15 / 100)
print('um funcionario que ganhava {:.2f}, com 15% de aumento, passam a ganhar {:.2f}'.format(salario, aumento))