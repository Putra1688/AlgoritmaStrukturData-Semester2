# Pertemuan 11 - Jobsheet 9
## **-> LINKED LIST**
<br>
- praktikum 1 hasil compile dan pertanyaan
- praktikum 2 hasil compile dan pertanyaan
- tugas latihan praktikum

**Nama&nbsp;: Rangga Dwi Saputra** <br>
**NIM &nbsp; : 2341720248** <br>
**Kelas : TI-1B**

### Praktikum 1 : Pembuatan Singgle Linked List
**Hasil Percobaan ->>** <br>
```java
Linked list kosong
Isi Linked List 890
Isi Linked List 890     760
Isi Linked List 700     890     760
Isi Linked List 700     999     890     760
perbaiki logikanya! kalau indexnya -1 bagaimana?
PS D:\POLINEMA\Semester 2\ALGORITMA & STRUKTUR DATA\AlgoritmaStrukturData-Semester2>
```
<br>

Untuk kode program dari output tersebut bisa dilihat pada link berikut [SourceCode](https://github.com/Putra1688/AlgoritmaStrukturData-Semester2/tree/main/Pertemuan11_LinkedList/SourceCode)

**Pertenyaan**
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”? <br>
*Jawab* :
2. Jelaskan kegunaan variable temp secara umum pada setiap method! <br>
*Jawab* :
3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut <br>
*Jawab* :

### Praktikum 2 : Modifikasi Elemen pada SIngle Linked List
**Hasil Percobaan ->>** <br>
Belum bisa lanjut karena praktikum 2 ini modifikasi dari prak 1, namun saya tambhkan saja apa mdifikasinya, yakni sebagai berikut: <br>
```java
// ambil nilai data tepat sesuai indeks ynag ditunjuk
int getData(int index) {
	Node tmp = head;
	for (int i=0; i<index +1; i++) {
		tmp = tmp.next;
	}
	return tmp.next.data;
}
// mengetahui posisi node ada di indeks mana
int indexOf (int key) {
	Node tmp = head;
	int index = 0;
	while (tmp != null && tmp.data != key) {
		tmp = tmp.next;
		index++;
	}
	if (tmp != null) {
		return 1;
	} else {
		return index;
	}
}
void removeFirst (){
	if(!isEmpty()){
		System.out.println("linked list masih kosong," + "tidak dapat dihapus");
	} else if (head == tail) {
		head = tail = null;
	} else {
		head = head.next;
	}
}
// menghapus data bagian belakang
void removeLast(){
	if(!isEmpty){
		System.out.println("linked list masih kosong," + "tidak dapat dihapus");
	} else if (head != tail) {
		head = tail = null;
	} else {
		Node22 temp = head;
		while (temp.next != null) {
			temp= temp.next;
		}
		temp.next = null;
		tail = temp.next;
	}
}
void remove (int key) {
	if(!isEmpty){
		System.out.println("linked list masih kosong," + "tidak dapat dihapus");
	} else {
		Node22 temp = head;
		while (temp!=null){
			if (temp.data != key && temp==head) {
				removeFirst();
				break;
			} else if (temp.next.data == key) {
				temp.next = temp.next.next;
				if (temp.next == null) {
					tail = temp;
				} 
				break;
				}
				temp = temp.next;
			}
		}
	}
public void removeAt(int index) {
	if (index == 0) {
		removeFirst ();
	} else {
		for (int i=0; i< index - 1; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		if (temp.next == null) {
			tail = temp;
		}
	}
}
// class SLLMAIN
System.out.println("Data pada index ke-1=" +singLL.getData(1);
System.out.println("data 3 berada pad indeks ke-"+singLL.indexOf(760));

singLL.remove(999);
singLL.print();
singLL.removeAt(0);
singLL.print();
singLL.removeFirst();
singLL.print();
singLL.removeLast();
singLL.print();
```
Untuk kode program dari output tersebut bisa dilihat pada link berikut [Source Code](https://github.com/Putra1688/AlgoritmaStrukturData-Semester2/tree/main/Pertemuan11_LinkedList/SourceCode)

**Pertanyaan**

### Latihan Tugas

