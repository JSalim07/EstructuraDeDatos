/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondpartial;

/**
 *
 * @author justin
 */
public class LinearSearch {
    public int find(int number){
        int[] numbers = {10,9,8,7,6,5,4,3,2,1};
        
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == number) {
                return i;
            }
            
        }
        return -1;
    }
}
