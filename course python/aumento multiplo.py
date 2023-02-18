salario = int(input('qual e o seu salario  d funconario' ))
if salario <= 1250:
    p = salario + (salario * 15 / 100)


else:
     p = salario + (salario * 10 / 100)
print('O AUMENTO SERA DE {} '.format(p))
