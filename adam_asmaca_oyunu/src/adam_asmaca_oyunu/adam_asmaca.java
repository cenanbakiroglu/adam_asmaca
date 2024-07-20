package adam_asmaca_oyunu;
import java.util.Scanner;
import java.util.Random;
public class adam_asmaca {
	static Scanner oku =new Scanner(System.in);
	static Random rand = new Random();
	static String harf;
	
	static String esya[]= {"masa","telefon","bilgisayar"};
	static String meyve[]= {"karpuz","çilek","erik"};
	static String hayvan[]= {"eşek","ayı","inek","ördek"};
	
	
	

	public static void main(String[] args) {
		boolean kontrol;
		
		String cevap="e";
		int dogru,puan=0,hak;
		
		 do {
		 String tutulan_kelime=yeniden_oyna();
		String altcizgi[]= new String[tutulan_kelime.length()];
		
		hak=tutulan_kelime.length();
		dogru=0;
		kontrol=false;
		for(int i =0 ;i<tutulan_kelime.length();i++)
		{
			altcizgi[i]="_ ";
			System.out.print(altcizgi[i]);
		}
		
		while(hak>0)
		{
			System.out.print("\nBir harf giriniz : ");
			harf=oku.next();
			
			for(int i=0 ; i<tutulan_kelime.length();i++)
			{
				if(tutulan_kelime.charAt(i)==harf.charAt(0))
				{
					kontrol=true;
					altcizgi[i]=harf.charAt(0)+" ";
					puan+=10;
					dogru++;
				}
			}
			if(kontrol==false)
			{
				hak--;
				
			}
			else
			{
				kontrol=false;
			}
			
			if(hak==0)
			{
				System.out.println("Hakkınız bitmiştir!\nPuanınız : "+puan);
				System.out.println("Tutulan kelime : "+tutulan_kelime);
				System.out.print("Tekrar oynamak için e tuşuna basınız");
				cevap=oku.next();			}
			else
			{
				System.out.println("Kalan hakkınız : "+ hak);
			}
			
			for(int i=0;i<altcizgi.length;i++)
			{
				System.out.print(altcizgi[i]);
				
			}
			
			if(dogru==tutulan_kelime.length())
			{
				System.out.println("\nTebrikler bildiniz\nPuanınız : "+puan);
				System.out.print("Tekrar oynamak için e tuşuna basınız");
				cevap=oku.next();	
				break;
			}		
		}
		}while(cevap.equalsIgnoreCase("e"));
		
		
		
		}
	
	static String yeniden_oyna()
	{
		String kelime;
		int sec=rand.nextInt(3)+1;
		
		if(sec==1)
		{
			kelime=esya[rand.nextInt(esya.length)];
			
			System.out.println("Bir eşya tahmin ediniz");
			
		}
		else if(sec==2)
		{
			kelime=meyve[rand.nextInt(meyve.length)];
			
			System.out.println("Bir meyve tahmin ediniz");
			
		}
		else
		{
			kelime=hayvan[rand.nextInt(hayvan.length)];
			
			System.out.println("Bir hayvan tahmin ediniz");
		}
		return kelime;
	}

}
