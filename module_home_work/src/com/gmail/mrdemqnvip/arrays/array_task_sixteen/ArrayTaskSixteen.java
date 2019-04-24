package com.gmail.mrdemqnvip.arrays.array_task_sixteen;


public class ArrayTaskSixteen {

    public static void main(String[] args) {
        int[] arraySixteen = {45, 84, 95, 37, 91, 35, 81, 29, 22, 11};
        for (int i = 0; i < arraySixteen.length; ++i) {
            if(i == 0){
                arraySixteen[i] = 1;
            } else {
                arraySixteen[i] = arraySixteen[i];
            }
        }

        for(int r: arraySixteen){
            System.out.print(r + " ");
        }

        System.out.println();
        for(int i = 0;i <= arraySixteen.length/2; i++){
           int arr = arraySixteen[i];
            arraySixteen[i] = arraySixteen[arraySixteen.length - i - 1];
            arraySixteen[arraySixteen.length - 1 - i] = arr;
        }
        for(int i = 0;i < arraySixteen.length;i++){
            System.out.print(arraySixteen[i] + " ");
        }



        //System.out.println("Random array - " + Arrays.toString(arraySixteen));
    }

}
