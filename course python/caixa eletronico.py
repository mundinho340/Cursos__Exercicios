valor = int(input('qual e o valor '))
total = valor
ced = 50
totced = 0
while True:
    if total >= ced:
        total -=ced
        totced +=1
    else:
        if totced>0:
             print('tens {} cedulas de {} mts'.format(totced , ced))
        if ced ==50:
            ced ==20
        elif ced ==20:
            ced ==10
        elif ced ==10:
            ced ==1
        totced =0
        if ced ==0:
            break





