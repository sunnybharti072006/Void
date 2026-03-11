package network.steganography.Discovery;

import org.pcap4j.core.PcapNativeException;
import org.pcap4j.core.Pcaps;
import org.pcap4j.core.PcapNetworkInterface;
import java.util.List;

public class VoidDiscovery {
    public static void main(String[] args) throws PcapNativeException {

        List<PcapNetworkInterface> allDevs = Pcaps.findAllDevs();

        if (allDevs.isEmpty()) {
            System.out.println(" VOID Gateway not found. Check Npcap installation.");
            return;
        }

        System.out.println(" VOID Entry Points Found:");
        for (PcapNetworkInterface nif : allDevs) {
            System.out.println("NAME: " + nif.getName());
            System.out.println("DESC: " + nif.getDescription());
        }
    }
}
