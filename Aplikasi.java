/**
*PROGRAM APLIKASI
*031121
*/
import java.util.*;	
public class Aplikasi{
	public static void main(String[]args){
		login();}
		static void login(){ //method login
		String data[]={"aulia","202013037"};
		String nama,sandi;
		System.out.println("\t\t\t\t\t\t\t\t\t=========================");
		System.out.println("\t\t\t\t\t\t\t\t\t\t  LOGIN");
		System.out.println("\t\t\t\t\t\t\t\t\t=========================");
		System.out.println();
		Scanner login=new Scanner(System.in);
		System.out.print("\t\t\t\t\t\t\t\tNama Pengguna  : ");
		nama=login.nextLine();
		System.out.println();
		System.out.print("\t\t\t\t\t\t\t\tSandi Pengguna : ");
		sandi=login.nextLine();

		if(nama.equals(data[0])&&sandi.equals(data[1])){
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\tWELCOME");
			System.out.println();
			 menu();
		}
		else{
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t\tMaaf Users Tidak Ditemukan");
			System.out.println();
			login();	
	}
}

static void menu(){
		System.out.println("\t\t\t\t\t\t\t\t|============================================|");
		System.out.println("\t\t\t\t\t\t\t\t| 1. PROGRAM KASIR\t\t\t     |");
		System.out.println("\t\t\t\t\t\t\t\t|============================================|");
		System.out.println("\t\t\t\t\t\t\t\t| 2. PROGRAM PERHITUNGAN LUAS BANGUN DATAR   |");
		System.out.println("\t\t\t\t\t\t\t\t|============================================|");
		System.out.println("\t\t\t\t\t\t\t\t| 3. PROGRAM PERHITUNGAN VOLUME BANGUN DATAR |");
		System.out.println("\t\t\t\t\t\t\t\t|============================================|");
		System.out.println("\t\t\t\t\t\t\t\t| 4. KELUAR\t\t\t\t     |");
		System.out.println("\t\t\t\t\t\t\t\t|============================================|");
		Scanner apa=new Scanner(System.in);
		int menu;
		System.out.print("\t\t\t\t\t\t\t\tSilahkan Masukkan Menu : ");
		menu=apa.nextInt();
		if(menu==1){
			Kasir();
		}else if(menu==2){
			LuasBD();
		}else if(menu==3){
			VolumeBD();
		}else if(menu==4){
			System.exit(0);
		}else{
			System.out.println("\t\t\t\t\t\t\t\tMaaf Inputan Tidak Ada!");
			menu();
		}
	}

static void Kasir(){
/*		int menu;
		Scanner input=new Scanner(System.in);
		String pilih[]={"KASIR", "Menu Utama", "Keluar"};
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\t|============================================|");
		System.out.println("\t\t\t\t\t\t\t\t|1. " +pilih[0]+ "\t\t\t\t     |");
		System.out.println("\t\t\t\t\t\t\t\t|============================================|");
		System.out.println("\t\t\t\t\t\t\t\t|2. " +pilih[1]+ "\t\t\t\t     |");
		System.out.println("\t\t\t\t\t\t\t\t|============================================|");
		System.out.println("\t\t\t\t\t\t\t\t|3. " +pilih[2]+ "\t\t\t\t     |");
		System.out.println("\t\t\t\t\t\t\t\t|============================================|");
		System.out.print("\t\t\t\t\t\t\t\tMasukkan menu pilihan : ");
		menu=input.nextInt();
		System.out.println();

		switch (menu){
			case 1:
			Scanner a=new Scanner(System.in);
			Scanner b=new Scanner(System.in);
			Scanner c=new Scanner(System.in);
			System.out.println("\t\t\t\t\t\t\t\t\t  ==============================");
			System.out.println("\t\t\t\t\t\t\t\t\t  |       SELAMAT DATANG       |");
			System.out.println("\t\t\t\t\t\t\t\t\t  |        WARUNG MAKAN        |");
			System.out.println("\t\t\t\t\t\t\t\t\t  ==============================");
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t\tMENU");
			System.out.println("\t\t\t\t\t\t\t\t1. IKAN BAKAR + NASI\t\t Rp. 25.000");
			System.out.println("\t\t\t\t\t\t\t\t2. NASI GORENG KAMPUNG\t\t Rp. 18.000");
			System.out.println("\t\t\t\t\t\t\t\t3. BIHUN PEDAS\t\t\t Rp. 15.000");
			System.out.println();
			System.out.print("\t\t\t\t\t\t\t\tMasukkan Jumlah Pesanan Yang Dibeli = ");
			int max=a.nextInt();
			System.out.println();
		
			String namaB[]=new String[max];
			int jumlahB[]=new int[max], hargaB[]=new int[max];
		
			for(int i=0;i<max;i++){

			System.out.print("\t\t\t\t\t\t\t\tPesanan "+(i+1)+"= ");
			namaB[i]=b.nextLine();
			System.out.print("\t\t\t\t\t\t\t\tJumlah Pesanan "+(i+1)+"= ");
			jumlahB[i]=c.nextInt();
			System.out.print("\t\t\t\t\t\t\t\tHarga Pesanan "+(i+1)+"= ");
			hargaB[i]=c.nextInt();
			System.out.println("\t\t\t\t\t\t\t\tPesanan "+(i+1)+" Telah Selesai");
			System.out.println();

			}
			for(int i=0;i<max;i++){
			System.out.println("\t\t\t\t\t\t\t\t"+(i+1)+"."+namaB[i]+"\t"+jumlahB[i]+""+hargaB[i]+"");
		}
			

			Kasir();
			break;

			case 2:
			menu();
			break;

			case 3:
			System.exit(0);
			break;
			default:
			System.out.println("\t\t\t\t\t\t\t\tMaaf Inputan Tidak ada!");
			Kasir();
	}*/
}

static void LuasBD(){
		Scanner terima=new Scanner(System.in);
		String perhitungan[]={"Luas", "Luas Segitiga", "Luas Persegi", "Luas Persegi Panjang", "Luas Layang-layang", "Luas Lingkaran", "Luas Jajar-genjang", "Luas Belah Ketupat", "Luas Trapesium", "Menu Utama", "Keluar"};
		System.out.println("\t\t\t\t\t\t\t\t-------------------------------------");
		System.out.println("\t\t\t\t\t\t\t\t=Program Menghitung Luas Bangun Datar");
		System.out.println("\t\t\t\t\t\t\t\t-------------------------------------");
		System.out.println("\t\t\t\t\t\t\t\tSilahkan Pilih Program yang ingin digunakan");
		for (int i=1;i<perhitungan.length; i++ ) {
			System.out.println("\t\t\t\t\t\t\t\t"+i+". "+perhitungan[i]);
		}
		System.out.print("\t\t\t\t\t\t\t\tPilih :");
		int pilih;
		pilih=terima.nextInt();

		switch(pilih){
			case 1:
				System.out.println("\t\t\t\t\t\t\t\t-------------------------");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Luas Segitiga");
				System.out.println("\t\t\t\t\t\t\t\t-------------------------");
				System.out.println(" ");
				int panjang, alas, luas;
				System.out.print("\t\t\t\t\t\t\t\tMasukkan Alas : ");
				alas=terima.nextInt();
				System.out.print("\t\t\t\t\t\t\t\tMasukkan Tinggi : ");
				panjang=terima.nextInt();
				luas=(panjang * alas)/2;
				System.out.println(" ");
				System.out.println("\t\t\t\t\t\t\t\tLuas Segitiga Anda adalah : "+luas+" cm^2");
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Selesai");
				LuasBD();
				break;			
			
			case 2:
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Luas Persegi");
				System.out.println("");
				System.out.println("");
				int sisi;
				System.out.print("\t\t\t\t\t\t\t\tMasukkan Panjang Sisi : ");
				sisi=terima.nextInt();
				luas=(sisi * 2);
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tLuas Persegi Anda adalah : "+luas+" cm^2");
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Selesai");
				LuasBD();
				break;				
			
			case 3:
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Luas Persegi Panjang");
				System.out.println("");
				System.out.println("");
				int lebar;
				System.out.print("\t\t\t\t\t\t\t\tMasukkan Panjang : ");
				panjang=terima.nextInt();
				System.out.print("\t\t\t\t\t\t\t\tMasukkan lebar : ");
				lebar=terima.nextInt();
				luas=(panjang * lebar);
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tLuas Persegi Panjang Anda adalah:"+luas+"cm^2");
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Selesai");
				LuasBD();
				break;			
			
			case 4:
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Luas Layang-layang");
				System.out.println("");
				System.out.println("");
				int diagonal_1, diagonal_2;
				System.out.print("\t\t\t\t\t\t\t\tMasukkan Panjang Diagonal 1 : ");
				diagonal_1=terima.nextInt();
				System.out.print("\t\t\t\t\t\t\t\tMasukkan Panjang Diagonal 2 : ");
				diagonal_2=terima.nextInt();
				luas=(diagonal_2*diagonal_1)/2;
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tLuas Layang-layang Anda adalah : "+luas+" cm^2");
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Selesai");
				LuasBD();
				break;
			
			case 5:
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Luas Lingkaran");
				System.out.println("");
				System.out.println("");
				int r;
				Double pi=3.14, luaslingkaran;
				System.out.println("\t\t\t\t\t\t\t\tMasukkan Jari-jari Lingkaran : ");
				r=terima.nextInt();
				luaslingkaran=(pi*r*r);
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tLuas Lingkaran Anda adalah : "+luaslingkaran+" cm^2");
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Selesai");
				LuasBD();
				break;	
			case 6:
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Luas Jajar Genjang");
				System.out.println("");
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tMasukkan Panjang Alas : ");
				panjang=terima.nextInt();
				System.out.println("\t\t\t\t\t\t\t\tMasukkan Tinggi : ");
				alas=terima.nextInt();
				luas=(panjang*alas);
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tLuas Jajar Genjang Anda adalah : "+luas+" cm^2");
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Selesai");
				LuasBD();
				break;	
			case 7:
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Luas Belah Ketupat");
				System.out.println("");
				System.out.println(" ");
				System.out.print("\t\t\t\t\t\t\t\tMasukkan Panjang Diagonal 1 : ");
				diagonal_1=terima.nextInt();
				System.out.print("\t\t\t\t\t\t\t\tMasukkan Panjang Diagonal 2 : ");
				diagonal_2=terima.nextInt();
				luas=(diagonal_2*diagonal_1)/2;
				System.out.println(" ");
				System.out.println("\t\t\t\t\t\t\t\tLuas Belah Ketupat Anda adalah : "+luas+" cm^2");
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Selesai");
				LuasBD();
				break;
			case 8:
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Luas Trapesium");
				System.out.println("");
				System.out.println("");
				int a, b, t;
				System.out.println("\t\t\t\t\t\t\t\tMasukkan Sisi Atas : ");
				a=terima.nextInt();
				System.out.println("\t\t\t\t\t\t\t\tMasukkan Sisi Bawah : ");
				b=terima.nextInt();
				System.out.println("\t\t\t\t\t\t\t\tMasukkan Tinggi : ");
				t=terima.nextInt();
				luas=t*(a+b)/2;
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tLuas Trapesium Anda adalah : "+luas+" cm^2");
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Selesai");
				LuasBD();
				break;	
			case 9:
				menu();
			case 10:
				System.out.println();
				System.out.println("\t\t\t\t\t\t\t\tKeluar Dari Program");
				System.exit(0);
				break;
			default:
				System.out.print("\t\t\t\t\t\t\t\tMaaf tidak ada Menu untuk inputan Anda");
				LuasBD();
		}
}

static void VolumeBD(){
		/*Scanner terima=new Scanner(System.in);
		String perhitungan[]={"Volume", "Volume Prisma Segitiga","Volume Limas Segi Empat", "Volume Limas Segitiga", "Volume Kubus","Volume Balok","Volume Tabung","Volume Kerucut", "Volume Bola", "Menu Utama", "Keluar"};
		System.out.println("\t\t\t\t\t\t\t\t============================================================================");
		System.out.println("\t\t\t\t\t\t\t\t=                    Program Menghitung Luas Bangun Datar                  =");
		System.out.println("\t\t\t\t\t\t\t\t============================================================================");
		System.out.println("\t\t\t\t\t\t\t\tSilahkan Pilih Program yang ingin digunakan");
		for (int i=1;i<perhitungan.length; i++ ) {
			System.out.println(i+". "+perhitungan[i]);
		}
		System.out.print("\t\t\t\t\t\t\t\tPilih :");
		int pilih;
		pilih=terima.nextInt();

		switch(pilih){
			case 1:
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Volume Prisma Segitiga");
				System.out.println("");
				System.out.println("");
				int panjang, alas, tinggi, volume;
				System.out.print("\t\t\t\t\t\t\t\tMasukkan Tinggi Segitiga : ");
				alas=terima.nextInt();
				System.out.print("\t\t\t\t\t\t\t\tMasukkan Alas Segitiga : ");
				panjang=terima.nextInt();
				System.out.print("\t\t\t\t\t\t\t\tMasukkan tinggi Prisma Segitiga : ");
				tinggi=terima.nextInt();
				volume=(panjang * alas*tinggi)/2;
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tLuas Prisma Segitiga Anda adalah : "+volume+" cm^3");
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Selesai");
				VolumeBD();
				break;			
			
			case 2:
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Volume Limas Segi Empat");
				System.out.println("");
				System.out.println("");
				int lebar;
				System.out.print("\t\t\t\t\t\t\t\tMasukkan Panjang segi empat : ");
				panjang=terima.nextInt();
				System.out.print("\t\t\t\t\t\t\t\tMasukkan lebar segi empat : ");
				lebar=terima.nextInt();
				System.out.print("\t\t\t\t\t\t\t\tMasukkan tinggi limas  : ");
				tinggi=terima.nextInt();
				volume=(panjang*lebar*tinggi)/3;
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tLuas Limas Segi empat Anda adalah : "+volume+" cm^3");
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Selesai");
				VolumeBD();
				break;				
			
			case 3:
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Volume Limas Segitiga");
				System.out.println("");
				System.out.println(" ");
				System.out.print("\t\t\t\t\t\t\t\tMasukkan Tinggi Segitiga : ");
				alas=terima.nextInt();
				System.out.print("\t\t\t\t\t\t\t\tMasukkan Alas Segitiga : ");
				panjang=terima.nextInt();
				System.out.print("\t\t\t\t\t\t\t\tMasukkan tinggi limas Segitiga : ");
				tinggi=terima.nextInt();
				volume=tinggi*((alas*panjang)/2)/3;
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tvolume limas segitiga Anda adalah : "+volume+" cm^3");
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Selesai");
				VolumeBD();
				break;			
			
			case 4:
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Volume Kubus");
				System.out.println("");
				System.out.println("");
				int sisi;
				System.out.print("\t\t\t\t\t\t\t\tMasukkan Panjang Sisi :");
				sisi=terima.nextInt();
				volume=(sisi * 3);
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tLuas Kubus Anda adalah : "+volume+"cm^3");
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Selesai");
				VolumeBD();
				break;
			
			case 5:
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Volume Balok");
				System.out.println("");
				System.out.println(" ");
				System.out.println("\t\t\t\t\t\t\t\tMasukkan Panjang :");
				panjang=terima.nextInt();
				System.out.print("\t\t\t\t\t\t\t\tMasukkan Lebar :");
				lebar=terima.nextInt();
				System.out.print("\t\t\t\t\t\t\t\tMasukkan Tinggi :");
				tinggi=terima.nextInt();
				volume=(panjang * lebar * tinggi);
				System.out.println(" ");
				System.out.println("\t\t\t\t\t\t\t\tLuas Balok Anda adalah : "+volume+" cm^3");
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Selesai");
				VolumeBD();
				break;	
			case 6:
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Volume Tabung");
				System.out.println("");
				System.out.println("");
				int r;
				Double pi, volumed;
				pi=3.14;
				System.out.println("\t\t\t\t\t\t\t\tMasukkan Jari-jari: ");
				r=terima.nextInt();
				System.out.println("\t\t\t\t\t\t\t\tMasukkan Tinggi : ");
				tinggi=terima.nextInt();
				volumed=(pi*r*r*tinggi);
				System.out.println(" ");
				System.out.println("\t\t\t\t\t\t\t\tLuas Jajar Genjang Anda adalah : "+ volumed +" cm^3");
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Selesai");
				VolumeBD();
				break;	
			case 7:
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Volume Kerucut");
				System.out.println("");
				System.out.println();
				pi=3.14;
				System.out.println("\t\t\t\t\t\t\t\tMasukkan Jari-jari: ");
				r=terima.nextInt();
				System.out.println("\t\t\t\t\t\t\t\tMasukkan Tinggi kerucut: ");
				tinggi=terima.nextInt();
				volumed=(pi*r*r*tinggi)/3;
				System.out.println(" ");
				System.out.println("\t\t\t\t\t\t\t\tLuas Belah Ketupat Anda adalah : "+volumed+" cm^3");
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Selesai");
				VolumeBD();
				break;
			case 8:
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Volume Bola");
				System.out.println("");
				System.out.println(" ");
				pi=3.14;
				System.out.println("\t\t\t\t\t\t\t\tMasukkan Jari-jari Bola : ");
				r=terima.nextInt();
				volumed=(4*pi*r*r*r)/3;
				System.out.println(" ");
				System.out.println("\t\t\t\t\t\t\t\tLuas Trapesium Anda adalah : "+volumed+" cm^3");
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\tPerhitungan Selesai");
				VolumeBD();
				break;				
			case 9:
				menu();
			case 10:
				System.out.println();
				System.out.println("\t\t\t\t\t\t\t\tKeluar Dari Program");
				System.exit(0);
				break;
			default:
				System.out.print("\t\t\t\t\t\t\t\tMaaf tidak ada Menu untuk inputan Anda");
				VolumeBD();
		}*/
}

}
