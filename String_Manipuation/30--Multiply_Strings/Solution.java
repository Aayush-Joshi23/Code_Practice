class Solution {
    public String multiply(String num1, String num2) {

        if(num1.equals("0") || num2.equals("0") )
            return "0";


        int n1 = num1.length(), n2 = num2.length();
        
        
        int[] products = new int[n1 + n2];

        // Multiply each digit of num1 with each digit of num2
        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int d1 = num1.charAt(i) - '0';
                int d2 = num2.charAt(j) - '0';

                products[i + j + 1] += d1 * d2;
            }
        }

        // Process carries and finalize the products

        int carry = 0;
        for (int i = products.length - 1; i >= 0; i--) {
            int temp = (products[i] + carry) % 10;
            carry = (products[i] + carry) / 10;
            products[i] = temp;
        }
        
        int i =0;
        if(products[0] == 0)
            i = 1;

        StringBuilder sb = new StringBuilder();
        for (; i<products.length; i++) {
            sb.append(products[i]);
        }

        

        return sb.toString();
    }
}