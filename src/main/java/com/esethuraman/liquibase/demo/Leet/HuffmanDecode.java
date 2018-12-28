package com.esethuraman.liquibase.demo.Leet;

import java.util.ArrayList;
import java.util.List;

public class HuffmanDecode {

    public static String decode(List<String> codes, String encoded) {

        HuffmanTreeNode root = constructHuffmanTree(codes);

        System.out.println(decryptUsingHuffmanTree(root, encoded));
        return decryptUsingHuffmanTree(root, encoded);
    }

    private static String decryptUsingHuffmanTree(HuffmanTreeNode root, String encoded) {
        int i = 0, startPosition, endPosition;
        String decoded = "";
        boolean isNewCharacter = true;
        HuffmanTreeNode currentNode = root;

        while(i < encoded.length()){
            while (isNotLeaf(currentNode)){
                if(encoded.charAt(i) == '1'){
                    currentNode = currentNode.right;
                }
                else{
                    currentNode = currentNode.left;
                }
                i++;
            }
            decoded += currentNode.value;
            currentNode = root;
        }

        return decoded;
    }

    private static boolean isNotLeaf(HuffmanTreeNode currentNode) {
        return !((currentNode.left == null) && (currentNode.right == null));
    }

    private static char getCharacterFromCodeContent(String character) {
//        because, new line is represented as '[new line]'
        if(character.length() > 1){
            return '\n';
        }
        else{
            return character.charAt(0);
        }
    }

    private static HuffmanTreeNode constructHuffmanTree(List<String> codes) {
        HuffmanTreeNode root = new HuffmanTreeNode();
        String[] codeContents;
        String actualCode;

        for(String code : codes){
            codeContents = code.split("\t");

            actualCode = codeContents[codeContents.length-1];
            HuffmanTreeNode rootCopy = root;

            for(int i =0; i<actualCode.length(); i++){

                if(actualCode.charAt(i) == '1'){
                    if(rootCopy.right == null){
                        rootCopy.right = new HuffmanTreeNode();
                    }
                    rootCopy = rootCopy.right;
                }

                else{
                    if(rootCopy.left == null){
                        rootCopy.left = new HuffmanTreeNode();
                    }

                    rootCopy = rootCopy.left;
                }
            }
            rootCopy.value = getCharacterFromCodeContent(codeContents[0]);
        }

        return root;
    }

    public static void main(String[] args) {
        List<String> codes = new ArrayList<>();
        codes.add("a    100100");
        codes.add("[newline]    111111");
        codes.add("b    100101");
        codes.add("c    110001");
        codes.add("p    111110");
        codes.add("q    000001");
        codes.add("d    100000");

        decode(codes, "111110000001100100111111100101110001111110");
    }

}


class HuffmanTreeNode {
    char value;
    HuffmanTreeNode left = null;
    HuffmanTreeNode right = null;
}