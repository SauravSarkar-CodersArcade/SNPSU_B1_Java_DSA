package com.cs_is.dsa.dataStructures.nonLinear.tries;

import java.util.Arrays;
import java.util.List;

class TrieNode {
    TrieNode[] children;
    boolean wordEnd;
    TrieNode(){
        wordEnd = false;
        children = new TrieNode[26]; // Alphabets a to z [26]
    }
}
public class Trie {
    // insert & search
    // aryan -> {a, r, y, a, n}
    static void insertWord(TrieNode root, String word){
        /*
        We will start with root & check if the node exists
        If exists, we will traverse via the node
        If not, we will create the node
         */
        TrieNode curr = root;
        for (char ch : word.toCharArray()){
            if (curr.children[ch - 'a'] == null){
                // null means node is not present
                // So we create a node of that character
                curr.children[ch - 'a'] = new TrieNode();
            }
            // Move to the children node for the next character
            curr = curr.children[ch - 'a'];
        }
        curr.wordEnd = true; // We have inserted the word
    }
    static boolean searchWord(TrieNode root, String word){
        TrieNode curr = root;
        for (char ch : word.toCharArray()){
            if (curr.children[ch - 'a'] == null){
                // The first letter (node) doesn't exist
                // So the whole word is not present
                return false;
            }
            curr = curr.children[ch - 'a'];
        }
        return curr.wordEnd; // If true - exists or else false
    }
    static boolean startsWith(TrieNode root, String prefix){
        TrieNode curr = root;
        for (char ch : prefix.toCharArray()){
            if (curr.children[ch - 'a'] == null){
                // The first letter (node) doesn't exist
                // So the whole word is not present
                return false;
            }
            curr = curr.children[ch - 'a'];
        }
        return true; // Accenture
    }

    public static void main(String[] args) {
        TrieNode root = new TrieNode();
        List<String> inputWords = Arrays.
                asList("sidharth", "vaishnav", "sonika",
                        "darshan", "tejas", "sharanya");
        for (String word : inputWords){
            insertWord(root, word);
        }
        List<String> searchWords = Arrays.
                asList("sidharth", "saurav","vaishnav",
                        "nirmal","sonika", "ashank",
                        "darshan", "anup","tejas",
                        "raushan","sharanya");
        for (String word : searchWords){
            if (searchWord(root, word)){
                System.out.println(word + " present in Trie");
            }else {
                System.out.println(word + " not present in Trie");
            }
        }
        System.out.println(startsWith(root, "sid"));
        System.out.println(startsWith(root, "sau"));
        System.out.println(startsWith(root, "son"));
    }
}
