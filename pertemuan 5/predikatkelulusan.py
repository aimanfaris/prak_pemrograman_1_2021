nama = str(input("Masukan Nama Anda = "))
nim = str(input("Masukan NIM Anda = "))
pstudi = str(input("Masukan Program Studi Anda = "))
fakultas = str(input("Masukan Fakultas Anda = "))
ipk = str(input("Masukan IPK Anda = " ))
studi = str(input("Masukan Lama Studi Anda = "))

print("Berikut Data Diri Anda")
print("Nama Anda adalah = " + nama)
print("NIM Anda = " + nim)
print("Jurusan Anda = " + pstudi)
print("Fakultas = " + fakultas)
print("Dengan IPK = " + ipk)
print("Lama Studi = " + studi)

if (float(ipk) >= 3.51 and float(ipk) <= 4 and float(studi) <= 4): 
    print("Predikat Lulus Anda Adalah = Dengan Pujian (Summa CumLaude)")
elif (float(ipk) >= 3.51 and float(ipk) <= 4): 
    print("Predikat Lulus Anda Adalah = Dengan Pujian (CumLaude)")
elif (float(ipk) >= 3.01 and float(ipk) < 3.51): 
    print("Predikat Lulus Anda Adalah = Sangat Memuaskan")
elif (float(ipk) >= 2.76 and float(ipk) < 3.01): 
    print("Predikat Lulus Anda Adalah = Memuaskan")
elif (float(ipk) >= 2.00 and float(ipk) < 2.76): 
    print("Predikat Lulus Anda Adalah = Cukup")
elif (float(ipk) < 2.00): 
    print("Predikat Lulus Anda Adalah = Tidak Lulus")
elif (float(ipk) > 4.00 or float(ipk) < 0): 
    print("Predikat Lulus Anda = Tidak Valid")






