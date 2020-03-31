/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        Scanner scanner = new Scanner(System.in);
        // taking only 7 inputs for simple demonstration with value 1,2,3,4,5,6,7
        int i = 7;
        while (i > 0) {
            tree.add(scanner.nextInt());
            i--;
        }
        tree.preOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);

    }
}