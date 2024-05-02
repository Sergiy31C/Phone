package sample;

public class Phone {
    private String number;
    private Network network;

    public Phone(String number) {
        this.number = number;
    }
    public void registerInNetwork(Network network) {
        this.network = network;
        this.network.register(number);
    }

    public void outgoingCall(String number){
        if(network == null || !network.isRegistered(this.number)){
            System.out.println("Телефон не прошел регистрацию в сети");
        }
        else{
            if(!network.isRegistered(number)){
                System.out.println("Телефон на который совершается звонок не прошел регистрацию в этой сети");
            }
            else{
                System.out.println("Вы звоните: " + number);
                incomingCall(this.number);
            }
        }
    }
    public void incomingCall(String number){
        System.out.println("Вам звонит: " + number);
    }
}