# Pertemuan 11 - Jobsheet 9
## **-> LINKED LIST**
<br>

**Nama&nbsp;: Rangga Dwi Saputra** <br>
**NIM &nbsp; : 2341720248** <br>
**Kelas : TI-1B**

### Praktikum 1 : Pembuatan Singgle Linked List
**Hasil Percobaan ->>**
Untuk kode program dari output tersebut bisa dilihat pada link berikut [Source Code](https://github.com/Putra1688/AlgoritmaStrukturData-Semester2/tree/main/Pertemuan11_LinkedList/SourceCode)

**Pertenyaan**

### Praktikum 2 : Modifikasi Elemen pada SIngle Linked List
**Hasil Percobaan ->>**
Untuk kode program dari output tersebut bisa dilihat pada link berikut [Source Code](https://github.com/Putra1688/AlgoritmaStrukturData-Semester2/tree/main/Pertemuan11_LinkedList/SourceCode)

**Pertanyaan**

### Latihan Tugas

#include <iostream>
using namespace std; 
#include <sys/types.h> 
#include <unistd.h>
#include <sys/wait.h>

int main(void) {
	pid_t chil d_pid;
	int status;
	pid_t wait_result;

	child_pid = fork(); 
	if (child_pid == 0) {
		cout << "I am a child and my pid = " << getpid() << endl;
		execl("fork3", "goose", NULL);
		cout << "Could not execl file fork3" << endl;
		exit(1);
	}
	else if (child_pid > 0) {
		cout << "I am the parent and my pid = " << getpid( << endl;
		cout << "My child has pid = " << child_pid << endl;
	}
	else {
		cout << "The fork system call failed to create a new process" << endl;
		exit(1);
	}
		cout << "I am a happy, healthy process and my pid = " << getpid() << endl;

	if (child_pid == 0) {
	printf("This code will never be executed!\n");
	}
	else {
		cout << "I am a parent and I am going to wait for my child" << endl;
		do {
			wait_result = wait(&status);
		} while (wait_result != child_pid);
		cout << "I am a parent and I am quitting." << endl;
	}
	return 0;
}
