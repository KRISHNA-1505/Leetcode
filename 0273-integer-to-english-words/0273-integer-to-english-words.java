class Solution {
    String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int n) {
        if(n == 0) {
            return "Zero";
        }
        return num(n).trim();
    }
    String num(int n) {
        if(n < 20) {
            return ones[n];
        }
        if(n < 100) {
            return new StringBuilder().append(tens[n / 10]).append(' ').append(ones[n % 10]).toString();
        }
        if(n < 1000) {//123
            return new StringBuilder().append(ones[n / 100]).append(" Hundred ").append(num(n % 100)).toString();
        }
        if(n < 1000_000) {
            return new StringBuilder().append(num(n / 1000).trim()).append(" Thousand ").append(num(n % 1000)).toString();
        }
        if(n < 1000_000_000) {
            return new StringBuilder().append(num(n / 1000_000).trim()).append(" Million ").append(num(n % 1000_000)).toString();
        }
        return new StringBuilder().append(num(n / 1000_000_000).trim()).append(" Billion ").append(num(n % 1000_000_000)).toString();
    }
}