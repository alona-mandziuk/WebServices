package hw_3.task_3;

import hw_3.task_3.entity.BankType;
import hw_3.task_3.entity.DepositType;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;


public class JAXBparsingBankDeposites {
    public static void main(String[] args) throws JAXBException {
        try {
            parseByJaxb("src/hw_1/task_1/BankDeposites.xml");
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    static void parseByJaxb(String source) throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(BankType.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        File xmlFile = new File(source);
        BankType bank = (BankType) jaxbUnmarshaller.unmarshal(xmlFile);

        for (DepositType deposit : bank.getDeposit()) {
            System.out.println("Deposit Type: " + deposit.getType());
            System.out.println("Deposit Name: " + deposit.getName());
            System.out.println("Country: " + deposit.getCountry());
            System.out.println("Depositor: " + deposit.getDepositor());
            System.out.println("Account ID: " + deposit.getAccountId());
            System.out.println("Amount: " + deposit.getAmount());
            System.out.println("Profitability: " + deposit.getProfitability());
            System.out.println("Time Constraints: " + deposit.getTimeConstraints());
            System.out.println();
        }
    }
}

