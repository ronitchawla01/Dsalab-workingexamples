public class insert_at_the_end {
    static int insertEnd(int arr[], int n, int key, int capacity){
        if(n>=capacity)
            return n;
        arr[n]= key;
        return (n + 1);
    }
    public static void main(String[] args){
        int [] arr= new int[20];
        arr[0]=12;
        arr[1]=16;
        arr[2]=20;
        arr[3]=40;
        arr[4]=50;
        arr[5]=70;
        int capacity = 20;
    int n =6;
    int i;
    int key=26;
        System.out.println("before insertion");
    for(i=0; i<n; i++)
        System.out.println(arr[i] + "");
    n= insertEnd(arr, n , key, capacity);
        System.out.println("/n after insertion");
        for(i=0; i<n; i++)
            System.out.println(arr[i]+"");
    }
}
