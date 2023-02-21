package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {

    Queue<Transport> queueOfCars = new LinkedList<>();

    public void addToQueue(Transport transport) {
        if (transport.getType() == Type.BUS) {
            System.out.println("Автобусам проходить диагностику не нужно.");
        } else queueOfCars.offer(transport);
    }

    public void conductOfTechnicalInspection() {
        Transport transport;
        while ((transport = queueOfCars.poll()) != null) {
            System.out.println("Автомобилю " + transport.toString2() + " проведен техосмотр.");
        }
    }
}

