aluno = dict()
aluno['nome']= str(raw_input('Nome: '))
aluno['media']= float(input('Media de {} '.format(aluno['nome'])))
if aluno['media'] >= 7:
    aluno['situacao '] = 'Aprovado'
elif 5 <= aluno['media'] <7:
    aluno['situacao']= 'Recuperacao'
else:
    aluno['situacao']= 'Reprovado'
print('-='*30)
for k, v in aluno.items():
    print('- {} e igual {} '.format(k, v))