exp = str(raw_input('digite um valor '))
pilha = []
for simb in exp:
    if simb == '(':
        pilha.append('(')
    elif simb == ')':
        if len(pilha)>0:
            pilha.pop()
        else:
            pilha.append(')')
            break
if len(pilha) == 0:
    print('A expressao esta correta ')
else:
    print('A expressao nao esta incorreta ')