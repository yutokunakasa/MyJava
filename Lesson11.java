class Lesson11 {
    // public static void main(String[] args) {
    //     for (int i = 0; i <= 4; i ++){
    //         System.out.println(i);
    //     }
    // }
    // public static void main(String[] args) {
    //     for (int i = 0; i <= 4; i ++){
    //         if (i==3){
    //             break;
    //         }
    //         System.out.println(i);
    //     }
    // }
    // public static void main(String[] args) {
    //     for(int i = 0; i <= 4; i ++){
    //         if(i == 3){
    //             continue;
    //         }
    //         System.out.println(i);
    //     }
    // // }
    // public static void main(String[] args) {
    //     for(int i = 0; i <= 2; i ++){
    //         for( int j = 0; j <= 2; j ++){
    //             System.out.println(i + "-" + j);
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     int arr[] = {2,4,6,8,10};

    //     for( int i =0; i <= 4; i ++){
    //         System.out.println(arr[i]);
    //     }
    // }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int sum = 0;
        for(int i = 0; i <= 4; i ++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
