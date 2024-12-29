

public class Sorting1{

    public int[] selectionSort(int arr[], int n){
        //find min and swap 
        int temp;
        for(int i = 0; i<n-1; i++){
            int min = i;
            for(int j=i; j<n; j++){
                if(arr[j]<arr[min]){
                    temp = arr[min];
                    arr[min]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    
    public int[] bubbleSort(int arr[], int n){
        //push max to last by adjacent swaps 
        for(int i=n-1; i>=0; i--){
            int didSwap=0;
            for (int j=0; j<i; i++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didSwap=1;
                }
            }
            if(didSwap==0){
                didSwap=1;
                break;
            }
        }
        return arr;
    }

    public int[] insertionSort(int arr[], int n){
        //takes an element and place it in correct position 
        //compares with previous element and till the prev is lesser than cur the swap happens 
        for(int i=0; i<n; i++){
            int j =i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Sorting1 s = new Sorting1();
        int arr[] = {13,99,12,88,2};
        int res[] = s.selectionSort(arr, 5);
        System.out.println("Insertion Sort: ");
        for(int r: res){
            System.out.print(r+" ");
        }
        System.out.println("");
        res = s.bubbleSort(arr, 5);
        System.out.println("Bubble Sort: ");
        for(int r: res){
            System.out.print(r+" ");
        }
        System.out.println("");
        res = s.insertionSort(arr, 5);
        System.out.println("Insertion Sort: ");
        for(int r: res){
            System.out.print(r+" ");
        }
    }
}