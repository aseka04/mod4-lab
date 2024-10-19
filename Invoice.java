package lab;

import java.util.List;

public class Invoice {
    public int Id;
    public List<Double> Items;
    public double TaxRate;

}

class Calculate{
    public double CalculateTotal(List<Item> Items, double TaxRate)
    {
        double subTotal = 0;
        for (var item : Items)
        {
            subTotal += item.Price;
        }
        return subTotal + (subTotal * TaxRate);
    }
}
class SaveDatabase{
    public void SaveToDatabase(List<Double> Items, int Id, double TaxRate)
    {
        Items.add(Id, TaxRate);
    }
}