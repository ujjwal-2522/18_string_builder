public class performance {
    public static void main(String[] args) {
        String series="";
        for (int i = 0; i <26 ; i++) {
            char ch =(char)('a'+i);
            series=series+ch;//series+=ch

            //since every time new object is created in series so there is lots of wastage of space
            //TC-o(n^2)
            // to remove this problem we use stringbuilder


        }
        System.out.println(series);
    }
}
