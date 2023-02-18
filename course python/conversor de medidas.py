medida = float(input('uma distancia em metros '))
dm = medida*10
cm = medida*100
mm = medida*1000
dam = medida/10
hm = medida/100
km = medida/1000

print('a medida de {}m corresponde  {}dm {}cm {}mm {}dam {}hm {}km'.format(medida, dm, cm, mm, dam, hm, km))