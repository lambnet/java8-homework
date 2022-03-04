import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Invoice {
    List<Invoice> invoices = new ArrayList<>();
    List<Invoice> oracleAndTrainingInvoices = invoices
            .stream()
            .filter(inv -> inv.getCustomer() == Customer.ORACLE && inv.getTitle().contains("Training"))
            .sorted(Comparator.comparingDouble(Invoice::getAmount))
            .collect(Collectors.toList());

    List<Integer> ids = oracleAndTrainingInvoices.stream().collect(Collectors.toList(inv -> inv.getId));
    List<Integer> firstFiveIds = ids.stream().limit(5).collect(Collectors.toList());



}
