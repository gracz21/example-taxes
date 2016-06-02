package com.bartoszwalter.students.taxes;

import com.bartoszwalter.students.taxes.contracts.Contract;
import com.bartoszwalter.students.taxes.contracts.EmploymentContract;
import com.bartoszwalter.students.taxes.contracts.MandatoryContract;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaxCalculator {

	private static double podstawa = 0;
	private static char umowa = ' ';

	public static void main(String[] args) {
        getInputData();
        handleContract();
	}

    private static void getInputData() {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.print("Podaj kwotę dochodu: ");
            podstawa = Double.parseDouble(br.readLine());

            System.out.print("Typ umowy: (P)raca, (Z)lecenie: ");
            umowa = br.readLine().charAt(0);

        } catch (Exception ex) {
            System.out.println("Błędna kwota");
            System.err.println(ex);
            return;
        }
    }

    private static void handleContract() {
        Contract contract;
        try {
            if (umowa == 'P') {
                contract = new EmploymentContract(podstawa);
            } else if (umowa == 'Z') {
                contract = new MandatoryContract(podstawa);
            } else {
                throw new IllegalArgumentException();
            }
            contract.obliczWynagrodzenie();
            contract.printResult();
        } catch(IllegalArgumentException e) {
            System.out.println("Nieznany typ umowy!");
        }
    }
}
