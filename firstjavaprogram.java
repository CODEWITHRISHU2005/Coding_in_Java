public class firstjavaprogram{
        public static void main(String[] args) {
            int arr[] = {1,2,3,4};
            int x = 3;
            for(int i=0; i<arr.length; i++) {
                if(x == arr[i]) {
                    System.out.println("The first occurence of x is:" + i);
                    }
                else{
                    System.out.println("-1");
                    }
                }

        }
}
