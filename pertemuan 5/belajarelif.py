umur = input("masukan umur anda = ")
umur = int(umur)
if (umur >= 0 and umur <=5):
    print("Anda balita")
elif (umur > 5 and umur <= 19):
    print("Anda remaja")
elif (umur >=20 and umur <= 30):
    print("Anda Dewasa")
elif (umur >=31 and umur <= 100):
    print("Anda tua")
else:
    print("umur anda tidak valid")
print("Terima kasih sudah mengisi")
    