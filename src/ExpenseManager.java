import java.io.*;
import java.util.*;
public class ExpenseManager {
private List<Expense> expenses;
private File file;
public ExpenseManager(String file) {
this.expenses = new ArrayList<>();
this.file = new File(file);
loadExpenses();
}
public void addExpense(double amount, String category) {
validateInputData(amount, category);
expenses.add(new Expense(amount, category));
System.out.println("Se han agregado correctamente los gastos.");
}
public void listExpenses() {
for (Expense expense : expenses) {
System.out.println("Monto: $" + expense.getAmount() + ", Categoría: "
+ expense.getCategory());
}
}
public void sumCategories(String category) {
valideInputData(category);
double sumq=0;
for(Expense expense : expenses) {
String ctg = expense.getCategory();
double amt = expense.getAmount();
if(ctg.equals(category))
sumq+=amt;
}
System.out.println("Total de gastos en la categoría " + category + " : $" +
sumq);
}
