// Main application class that provides a console interface for managing expenses.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		ExpenseManager expenseManager = new ExpenseManager("expenses.txt");
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nElija una opción:");
			System.out.println("\n1. Agregar Gastos");
			System.out.println("2. Listar Gastos");
			System.out.println("3. Resumir Gastos por Categoría");
			System.out.println("4. Guardar gastos");
			System.out.println("5. Cargar gastos");
			System.out.println("6. Salir");
			System.out.print("Tu opción: ");
			int option = scanner.nextInt();

			switch (option) {
			case 1:
				System.out.print("Ingrese el monto del gasto: ");
				double amount = scanner.nextDouble();
				System.out.print("Ingrese la categoría del gasto: ");
				scanner.nextLine();
				String category = scanner.nextLine();
				expenseManager.addExpense(amount, category);
				break;
			case 2:
				expenseManager.listExpenses();
				break;
			case 3:
				System.out.print("Ingrese la categoría para sumarizar: ");
				scanner.nextLine();
				String categories = scanner.nextLine();
				expenseManager.sumCategories(categories);
				break;
			case 4:
				expenseManager.saveExpenses();
				break;
			case 5:
				expenseManager = new ExpenseManager("expenses.txt");
				break;
			case 6:
				System.out.println("¡Gracias por usar el sistema!");
				scanner.close();
				return;
			default:
				System.out.println("Opción inválida. Inténtelo de nuevo.");
			}
		}
	}
}
