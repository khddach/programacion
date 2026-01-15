package prepar;

public class ex1 {
    public static void main(String[] args) {

        int[][] matrix = {
                {2, 5},
                {1, 3}
        };

        int sum = 0;
        int max = matrix[0][0];
        int target = 3;
        System.out.println("عناصر المصفوفة هي:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");

                // --- التصحيح هنا ---
                // نستخدم علامة % (باقي القسمة)
                // إذا كان باقي القسمة على 2 لا يساوي 0، فهذا يعني أنه فردي
                if (matrix[i][j] % 2 != 0) {
                    sum += matrix[i][j];
                }

                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
                if (matrix[i][j] == target) {
                    System.out.println("Found 3 at row: " + i + " column: " + j);
                }
            }
            System.out.println();
        }

        System.out.println("----------------");
        System.out.println("مجموع الأرقام الفردية فقط هو: " + sum); // النتيجة ستكون 9
        System.out.println("----------------");
        System.out.println(max);
    }
}