package questao5.principal;

import questao5.model.Bicicleta;
import questao5.model.Carro;
import questao5.model.IMeioTransporte;
import questao5.model.Trem;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<IMeioTransporte> meioTransporteList = new ArrayList<>();
        meioTransporteList.add(new Carro("fiat",200));
        meioTransporteList.add(new Carro("ford",200));
        meioTransporteList.add(new Bicicleta("caloi",90));
        meioTransporteList.add(new Bicicleta("sense",200));
        meioTransporteList.add(new Trem("eurostar",400));
        meioTransporteList.add(new Trem("renfe",300));

        meioTransporteList.forEach((m) -> {
            System.out.println("------------------ ");
            for(int i = 0; i < 3; i++) {
                System.out.println("Acelerando: "+ m.acelerar());
            }
            for(int i = 0; i < 3; i++) {
                System.out.println("Freando: "+ m.frear());
            }
        });
    }
}
