
import java.util.ArrayList;
import java.util.Arrays;

public class Sorting2{
    
    //merge sort algorithm 
    public void mergeSort(int[] arr, int low, int high){
        //base case 
        if(low>=high) return;
        int mid = (low+high)/2;
        //left arr - low,mid
        mergeSort(arr, low, mid);
        //right arr - mid+1,high
        mergeSort(arr, mid+1, high);
        //merge(arr,low,mid,high)
        merge(arr, low, mid, high);
    }

    private void merge(int[] arr, int low, int mid, int high){
        int left = low, right = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(left<=mid && right<=high){
        //    using ternary operator 
        // temp.add(arr[left]<=arr[right]? arr[left++]: arr[right++]);
        if(arr[left]<=arr[right]){
            temp.add(arr[left]);
            left++;
        }
        else{
            temp.add(arr[right]);
            right++;
        }
        }
        //adding remaining elements if anyone arr is completed

        //if right completed and left is still remaining elements
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }

        //if left completed and right is still remaining elements
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }

        //tranfering temp to arr[]
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i-low);
        }
    }


    //quick sort 
    public void quickSort(int[] arr, int low, int high){
        if(low<high){
            //current pivot in the right place in the array -- Index is 
            int partitionIndex = partition(arr, low, high);
            //left side sorting - values in the left are smaller
            quickSort(arr, low, partitionIndex-1);
            //right side sorting - values in the right are larger
            quickSort(arr, partitionIndex+1, high);
        }
    }

    private int partition(int[] arr, int low, int high){
        int i=low, j=high, pivot=arr[low], temp;//assigning pivot as first element
        //before i<j -- swap(arr[i],arr[j])  
        while(i<j){
            //compare arr[i] and pivot if lesser i++ 
            if(arr[i]<=pivot && i<=high-1)i++;
             //compare arr[j] and pivot if greater j-- 
            if(arr[j]>=pivot && j>=low+1)j--;
            //swap 1st greater of i and smaller of j
            if(i<j){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        //if j is less than i --> swap(arr[low],arr[j]) -- low is the pivot
        if(i>=j){
            temp=arr[low];
            arr[low]=arr[j];
            arr[j]=temp;
        }
        return j;
    }

    //recurssive bubble sort 
    public void recurssiveBubbleSort(int[] arr, int n){
        //base case 
        if(n==1) return; //n==1 --> for 0--> n-2

        boolean didSwap = false;
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                didSwap=true;
            }
        }

        if(didSwap==false) return;

        recurssiveBubbleSort(arr, n-1);
    }

    //recusrssive insertion sort
    public void recurssiveInsertionSort(int[] arr, int i, int n){
        //base case
        if(i==n)return;

        int j=i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            j--;
        }
        recurssiveInsertionSort(arr,i+1, n);
    }

    public static void main(String[] args) {
        Sorting2 sortObj = new Sorting2();
        int[] arr = {3,1,2,3,4};
        System.out.println("Before Merge sort: "+Arrays.toString(arr));
        sortObj.mergeSort( arr, 0, arr.length-1);
        System.out.println("After Merge sort: "+Arrays.toString(arr));
        System.out.println("");
        
        arr =new int[]{3,2,2,3,4}; //to reassign an array new int[] array to be used as while re-assigning it creates a new object
        System.out.println("Before Quick sort: "+Arrays.toString(arr));
        sortObj.mergeSort( arr, 0, arr.length-1);
        System.out.println("After Quick sort: "+Arrays.toString(arr));
        System.out.println("");

        arr =new int[]{3,2,1,5,4}; //to reassign an array new int[] array to be used as while re-assigning it creates a new object
        System.out.println("Before Bubble sort: "+Arrays.toString(arr));
        sortObj.recurssiveBubbleSort(arr, arr.length);
        System.out.println("After Bubble sort: "+Arrays.toString(arr));
        System.out.println("");

        
        arr =new int[]{3,2,1,5,8}; //to reassign an array new int[] array to be used as while re-assigning it creates a new object
        System.out.println("Before Insertion sort: "+Arrays.toString(arr));
        sortObj.recurssiveInsertionSort(arr, 0,arr.length);
        System.out.println("After Insertion sort: "+Arrays.toString(arr));
        System.out.println("");
    }
}