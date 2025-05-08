package maths;

import java.util.*;

public class QuadraticRoots {

    public List<Double> quadraticRoots(int a, int b, int c) {
        int discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            return List.of(-1.0); // Imaginary roots
        }

        double sqrtVal = Math.sqrt(discriminant);
        double root1 = (-b + sqrtVal) / (2.0 * a);
        double root2 = (-b - sqrtVal) / (2.0 * a);

        return Arrays.asList(root1, root2);
    }

    public static void main(String[] args) {
        QuadraticRoots qr = new QuadraticRoots();

        System.out.println(qr.quadraticRoots(1, -2, 1));  // Output: [1.0, 1.0]
        System.out.println(qr.quadraticRoots(1, -7, 12)); // Output: [4.0, 3.0]
        System.out.println(qr.quadraticRoots(1, 1, 1));   // Output: [-1.0]
    }
}
