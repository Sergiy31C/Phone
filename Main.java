package sample;

public class Main {

	public static void main(String[] args) {
		Network vodafone  = new Network();
        Phone phone1 = new Phone("+380666666666");
        Phone phone2 = new Phone("+380665555555");
        Phone phone3 = new Phone("+380664444444");
        phone3.registerInNetwork(vodafone);
        phone1.outgoingCall("+380664444444");
	} 
    }


	


