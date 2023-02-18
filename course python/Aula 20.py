def area(p):
    s = p[0] * p[1]
    print('A area de um terreno de {:} x {:} e de {:}m '.format(p[0], p[1], s))


p = list()
p.append(float(input('largura ')))
p.append(float(input('comprimento ')))
area(p)
