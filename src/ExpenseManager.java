// This class manages a list of Expense objects and includes methods to add,
// list, and summarize expenses, as well as to validate inputs and handle file data.
void saveExpenses() {
    try (PrintWriter wr = new PrintWriter(new FileWriter(file))) {
    for (Expense expense : expenses) {
    wr.println(expense.getAmount() + "," + expense.getCategory());
    }
    System.out.println("Gastos guardados exitosamente en " + file);
    } catch (IOException e) {
    System.err.println("Error al guardar gastos: " + e.getMessage());
    }
    }
    private void loadExpenses() {
    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
    String line;
    while ((line = reader.readLine()) != null) {
    String[] parts = line.split(",");
    double amount = Double.parseDouble(parts[0]);
    String category = parts[1];
    expenses.add(new Expense(amount, category));
    }
    System.out.println("Gastos cargados exitosamente de " + file);
    } catch (IOException e) {
    System.err.println("Error al cargar gastos: " + e.getMessage());
    }
    }
    }
    
