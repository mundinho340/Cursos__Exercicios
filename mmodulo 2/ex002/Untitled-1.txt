class carro:
    VelMax=0
    Ligado= False
    Cor =""
def __init__(self,V,L,C):
    self.VelMax=V
    self.Ligado=L
    self.Cor= C
def mostra(self):
    print('Velocidade maxima:' + str(self.VelMax))
    print('cor:' + self.Cor)
    estado = 'sim' if self.Ligado else 'n'
    print('Ligado:' + estado)

c1=carro(200,False,'preto')
c2=carro(120,False,'branco')
c3=carro(350,False,'vermelho')

c1.mostra
c2.mostra
c3.mostra