exp =str(raw_input('Digita a expressao '))
pilha = list()
for simb in exp:
    if simb == '(':
        pilha.append('(')
    elif simb == ')':
        if len(pilha)> 0:
            pilha.pop()
        else:
            pilha.append(')')
            break
if len(pilha) == 0:
    print('A EXPRESSAO ESTA CORRETA ')
else:
    print('A expressao esta incorreta incorreta')
