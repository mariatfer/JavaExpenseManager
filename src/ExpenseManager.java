// This class manages a list of Expense objects and includes methods to add,
// list, and summarize expenses, as well as to validate inputs and handle file data.
public class ExpenseManager {
	
	private void valideInputData(String category) {
		if (category == null || category.trim().isEmpty()) {
			throw new RuntimeException("La categoría no puede estar vacía.");
		}
	}

	public void validateInputData(double amount, String category) {
		if (amount <= 0) {
			throw new RuntimeException("La cantidad debe ser mayor que cero.");
		}
		if (category == null || category.trim().isEmpty()) {
			throw new RuntimeException("La categoría no puede estar vacía.");
		}
	}
}
