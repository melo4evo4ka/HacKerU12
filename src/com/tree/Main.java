package com.tree;

public class Main {
    public static void main(String[] args) {
       Tree[] mastrees1 = {new AppleTree(), new BirchTree(), new ChristmasTree()} ;
        for (Tree tree : mastrees1) {
            System.out.println(tree.toString());
        }
        ConiferTree[] coniferTrees = {new ChristmasTree()};
        DeciduousTree[] deciduousTree = {new AppleTree(), new BirchTree()};
        Tree[][] mastrees2 = {deciduousTree,coniferTrees};

        for (Tree[] mastrees : mastrees2) {
            for (Tree t : mastrees) {
                System.out.println(t.toString());
            }
        }
    }
}
