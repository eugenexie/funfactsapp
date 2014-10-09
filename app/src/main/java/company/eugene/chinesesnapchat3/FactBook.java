package company.eugene.chinesesnapchat3;

import java.util.Random;

/**
 * Created by Eugene on 07/10/2014.
 */
public class FactBook {

    private String fact = "";
    private String[] facts = {"Ostriches run faster than horses",
            "Ants stretch when they wake up in the morning",
            "Olympic gold medals are actually mostly silver"};

    public String getFact() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        // Update the label with the new fact

        fact = facts[randomNumber];

        return fact;

    }
}
