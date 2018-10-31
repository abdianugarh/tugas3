import java.util.ArrayList;
import java.util.Collections;

public class arraylistobject {

	private String kelas,nama,alamat,nim;
	private int mahasiswa;
	
		public arraylistobject(String nama,String nim,String kelas,String alamat){
			this.nama=nama;
			this.nim=nim;
			this.kelas=kelas;
			this.alamat=alamat;
			
		}
		public String getnama(){
			return nama;
		}
		public void setnama(String nama){
			this.nama=nama;
		}
		public String getkelas(){
			return kelas;
		}
		public void setkelas(String kelas){
			this.kelas=kelas;
		}
		public String getalamat(){
			return alamat;
		}
		public void setalamat(String alamat){
			this.alamat=alamat;
		}
		public String getnim(){
			return nim;
		}
		public void setnim(String nim){
			this.nim=nim;
		}
		 public int getmahasiswa() {
				return mahasiswa;
			    }
			    public void setStudentage(int mahasiswa) {
			 	this.mahasiswa = mahasiswa;
			    }	
		 public int compareTo(arraylistobject comparestu) {
		        int compareage=((arraylistobject)comparestu).getmahasiswa();
		        return this.mahasiswa-compareage;

		        
		    }
	 public String toString () {
	         return "[nama =" + nama + ", nim =" + nim + ", kelas =" + kelas + "]";
	 }
	public static void main(String[] args) {
		ArrayList<arraylistobject>isi=new ArrayList<arraylistobject>();
		isi.add(new arraylistobject("abdianugrah","20217531","informatika E","desaparappe"));
		isi.add(new arraylistobject("muhammadqadei","d0217541","informatika E","pare-pare"));
		isi.add(new arraylistobject("aliftaufik","d021545","informatika E","majene"));
		   for(arraylistobject str: isi){
				System.out.println(str);

	}}

}
