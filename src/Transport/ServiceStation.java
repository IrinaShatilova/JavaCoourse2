package Transport;

import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> queue;

    public ServiceStation(Queue<Transport> queue) {
        this.queue = queue;
    }
    public void addTransport(Transport transport) {
       if (transport.checkTransportNeedService())
                queue.add(transport);

        }
    public void technicalInspectionCar() {
        if (!queue.isEmpty()) {
            Transport transport = queue.poll();
            transport.toString();
        }
    }
}
