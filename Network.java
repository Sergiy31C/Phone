package sample;

import java.util.HashSet;
import java.util.Set;

public class Network {

    private Set<String> registeredPhones;

    public Network() {
        registeredPhones = new HashSet<>();
    }

    public void register(String number){
        registeredPhones.add(number);
    }
    public boolean isRegistered(String number){
        return registeredPhones.contains(number);
    }
}
