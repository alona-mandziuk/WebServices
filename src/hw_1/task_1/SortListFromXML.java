package hw_1.task_1;

import hw_1.task_1.entity.DepositType;

import java.util.Collections;
import java.util.List;

public class SortListFromXML {
    public void sortAndPrintDepByAmount(List<DepositType> deposites) {
        Collections.sort(deposites, ((o1, o2) -> (int) (o1.getAmount() - o2.getAmount())));
        System.out.println("------------------------------------");
        for (DepositType deposit : deposites) {
            System.out.println(deposit);
        }
    }
}