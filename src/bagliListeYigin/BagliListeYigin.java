package bagliListeYigin;

import java.util.Scanner;


public class BagliListeYigin {
	int size;
	int cnt;
	Eleman top;
	public BagliListeYigin(int size) {
		this.size = size;
		cnt=0;
		top=null;
	}
	void push(String isim, String soyisim, int telno, int dt) { // ekleme
		Eleman eleman=new Eleman(isim,soyisim,telno,dt);
		if( isFull()) {
			System.out.println("Stack Dolu");
		}else {
			if(isEmpty()) {
				top=eleman;
				System.out.println(top.isim+" yığına eklendi");
			}else {
				eleman.next=top;
				top=eleman;
				System.out.println(top.isim+" yığına eklendi");

			}
			cnt++;
		}
		
	}
	void printYigin() {
		if(isEmpty()) {
			System.out.println("Yığın boş yazdırılacak bir şey yok");
		}else {
			Eleman temp=top;
			System.out.println("Stackdeki veriler \n");
			while(temp!=null) {
				System.out.println(temp.isim+" "+temp.soyisim+" "+temp.dt+" "+temp.telno);
				temp=temp.next;
			}
			System.out.println("\n");
		}
	}
	void yiginBoyut() {
		System.out.println(cnt);
	}
	void pop() {
		if(isEmpty()) {
			System.out.println("Yığın boş çıkarılacak eleman yok");
		}else {
			System.out.println(top.isim+" Çıkarıldı");

				top=top.next;
				cnt--;
			
		}
	}
	boolean isFull() {
		return cnt==size;
	}
	boolean isEmpty() {
		return cnt==0;
	}
	
}
