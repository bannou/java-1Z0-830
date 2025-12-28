public class D03_SQLQueryDemo {
    public static void main(String[] args) {
        // Define table name, filter column, and minimum age
        String tableName = "users";
        String filterColumn = "age";
        int minAge = 21;

        // SQL query using a text block with proper concatenation
        String sqlQuery = """
            SELECT id, name, email
            FROM """ + " " + tableName + "\n" +
            """
            WHERE """ + " " + filterColumn + " > " + minAge + "\n" +
            """
            ORDER BY name ASC;
            """;
        
        String sqlQuery2 = String.format("""
            SELECT id, name, email
            FROM %s
            WHERE %s > %d
            ORDER BY name ASC;
            """, tableName, filterColumn, minAge);
                        

        // Print the generated SQL query
        System.out.println("Generated SQL Queries:");
        System.out.println(sqlQuery);
        System.out.println(sqlQuery2);
    }
}

