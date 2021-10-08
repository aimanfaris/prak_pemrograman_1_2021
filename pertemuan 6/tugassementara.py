print("PROGRAM SIAKAD")
print("1. Tambah Data")
print("2. Edit Data")
print("3. Hapus Data")
print("4. Lihat Data")
print("5. Keluar")
menu = input("Menu yang Anda pilih = ")
menu = int(menu)

if (menu == 1) :
    print()
    print("1. Tambah Data Mahasiswa")
    print("2. Tambah Data Mata kuliah")
    print("3. Kembali")
    menu1 = input("Menu yang Anda pilih = ")
    menu1 = int(menu1)
    if (menu1 == 1) :
        print()
        nama = input("Masukan nama mahasiswa: ")
        nama = str(nama)
        print("Mahasiswa yang Anda tambah adalah " + nama)
    elif (menu1 == 2) :
        print()
        matKul = input("Masukan nama mata kuliah: ")
        matKul = str(matKul)
        print("Mata kuliah yang Anda tambah adalah " + matKul)
    elif (menu1 == 3) :
        print()
        print("Terima Kasih")
    else :
        print()
        print("Menu Tidak Ada")
elif (menu >= 2 and menu <= 5) :
    print()
    print("Fitur Belum Ada")
else :
    print()
    print("Menu Tidak Ada")

