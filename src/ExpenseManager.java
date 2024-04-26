// This class manages a list of Expense objects and includes methods to add,
// list, and summarize expenses, as well as to validate inputs and handle file data.
import java.io.;
import java.util.;

public class ExpenseManager extends Expense {
    private List<Expense> expenses;


    public ExpenseManager(double amount, String category) {
        super(amount, category);
        this.expenses = new ArrayList<>(); {
        this.expenses = new ArrayList<>();
    }
}

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public double summarizeExpensesByCategory(String category) {
        double total = 0;
        for (Expense expense : expenses) {
            if (expense.getCategory().equals(category)) {
                total += expense.getAmount();
            }
        }
        return total;
    }
}
