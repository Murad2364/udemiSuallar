package main;

import java.util.Scanner;

public class SuallarUdemy {
    public void sual1(){
//        Sual-1. 0-dan verilmish edede qeder butun 2-ye bolune bilen ededleri chap et. Ipucu: % ve / istifade edeceksiniz
        while(true) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            for (int i = 0; i <= a; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
            System.out.println("davam etmek ucun yes yazin eks halda sistemden cixis edilecek");
            Scanner sc1 = new Scanner(System.in);
            String davam = sc1.nextLine();
            if(!davam.equals("yes")){
                break;
            }
        }


    }

    public void sual2(){
//        2. 0-dan verilmish edede qeder sade ededleri chap et.
//        Eded ancaq ozune ve 1-e bolunurse edede sade eded deyilir. meselen: 3 reqemi 3-e yeni
//        ozune ve 1-e bolunur ancaq 4 reqemi 4-e yeni ozune, 1-e ve elave olaraq 2-ye de bolunur.
//        Ipucu: % ve / istifade edeceksiniz

        System.out.println("ededi daxil edin.");
        Scanner sc2 = new Scanner(System.in);
        int eded = sc2.nextInt();
        System.out.println("1");
        int count =0;
        for(int j=1;j<=eded+1;j++){
            if(count==2){
                System.out.println(j-1);
            }
            count=0;
            for (int i=1;i<=eded;i++) {
                if(j%i==0){
                    count++;
                }

            }
        }
    }

    public void sual3(){
//        Sual-3.Verilmish ededin butun ededleri cemini tap.
//
//Ipucu: %, / ve while istifade edeceksiniz Mes: 12345 olarsa 1+2+3+4+5
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int qaliq = 0;
        int tam = 0;
        while(a>0){
            qaliq=a%10;
            tam = tam+qaliq;
            a=(a-qaliq)/10;
        }
        System.out.println(tam);
    }

    public void sual4(){
//        4. 3-cu deyishenden istifade etmeden 2 deyishenin yerini deyishmek
        Scanner sc1 = new Scanner(System.in);
        System.out.println("a-ni daxil edin");
        int a = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("b-ni daxil edin");
        int b = sc2.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a=" +a);
        System.out.println("b=" +b);
    }

    public void sual5(){
//         Ededin reqemlerinin sayini tapin.//12345
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        // "neticeni" 1-den baslatmagimizin sebebi "netice" 10dan kicik oldugdan dongu sonlanacag ve
//        ededin reqemleri cemini 1 dene az verecek. Bunu aradan qaldirmag ucun "neticeni" 1-den basladiriq.
        int netice = 1;
        while(a>9){
            a=a/10;
            netice++;

        }
        System.out.println(netice);
    }

    public int sual6_1_faktorial(int a) {
//        .Fordan istifade etmeden Faktorial <- cox chetindir bu :) ama ugurlar
        int result = 0;
        if (a == 0) {
            result = 1;
        } else {
            result = a * sual6_1_faktorial(a - 1);
        }
        return result;

    }

    public void sual6_2() {
//        rekursiyadan istifade etmeden faktoriyal

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long factorial = 1;
        for(int i = 1; i < num+1; ++i){
            factorial = factorial * i;
            if(i==num){
                System.out.println(factorial);
            }
        }
    }

    public void sual7(){
//        7.Verilen string-in tersi ile duzunun bir birine beraber olub olmadigi.
//
//        Meselen "SOS" - "SOS" -> true
//
//        "Hello"-"olleH" -> false

        Scanner sc1 = new Scanner(System.in);
        String ilkSoz=sc1.nextLine();
        ilkSoz = ilkSoz.toLowerCase();

        for(int i=0; i<ilkSoz.length();i++){
            if(ilkSoz.charAt(0)!=ilkSoz.charAt(ilkSoz.length()-i-1)){
                System.out.println("Soz ters oxunusu ile eyni deyil.Netice yanlisdir");
                break;
            }
            else{
                System.out.println("Netice dogrudur.");
                break;
            }
        }


    }

    public void sual8() {
//8.Daxil edilen reqemlerin tersi ile duzunun eyni olub olmadigini teyin eden method yazin
//
//Meselen 545 ve 545 duzdur amma 574 475 sehvdir

        System.out.println("ededi daxil edin");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n2=n;
        int tersEded = 0;
        while (n != 0) {
            tersEded = tersEded * 10;
            tersEded = tersEded + n % 10;
            n = n / 10;
        }

        if (tersEded == n2) {
            System.out.println("eded tersi ile beraberdir");
        } else {
            System.out.println("eded tersi ile beraber deyil!");


        }
    }


    public void sual9(int a, char c, boolean altAlta){
//        9.Method 1 reqem, bir simvol ve 1 boolean qebul edir.
//
//public static void foo(int a, char c, boolean altAlta)
//
//a qeder c simvolunu chap etsin. altAlta dəyişəni true-dursa altAlta eks halda yan yana chap etsin
        if(altAlta=true){
            for(int i=0; i<a;i++){
                System.out.println(c);
            }

        }else{
            for(int i=0; i<a;i++){
                System.out.print(c);
            }
        }

    }

    public  void sual10(int a, int b, int c){
//        10.method 3 reqem qebul edir a,b,c,
//
//public static void foo(int a, int b, int c)
//
//a-dan b-ye qeder butun ededleri c qeder quvvete yukseldir Math.pow-dan istifadə edərək
//
//foo(1,5,2) -> 1^2=1; 2^2=4; 3^2=9, 4^2=16, 5^2=25
        for(int i=a;i<=b;i++){
            Math.pow(a,c);
            System.out.println(i);
        }
    }

    public int sual12(){
//        12.methoda daxil edilen reqemin musbet, menfi yoxsa 0 oldugunu teyin eden method yazin.
//
//Eger menfidirse method geriye -1 qaytarsin, 0-dirsa 0, musbetdirse +1 qaytarsin.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0){
            return 1;
        }
        else if (a==0){
            return 0;
        }
        else{
            return -1;
        }
    }

    public boolean sual13(int a,int b, int c,int d){

//        13. Methoda 4 reqem daxil edilir eger bu
//        reqemlerden her hansisa 2-si bir birine beraberdirse geriye true qaytarsin

        int [] arr = {a,b,c,d};
        for (int i=0;i<3;i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }

    public boolean sual14(int a,int b, int c,int d){
//        14. Methoda 4 reqem daxil edilir.a,b,c,d eger ededler artan ardicilliqla daxil
//        edilibse geriye true qaytarsin eks halda false
        int [] arr = {a,b,c,d};
        for (int i=0;i<3;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public String sual15(int a, String str){
//        15. Method bir String ve bir int qebul edir ve hemin String-in hemin index-inde
//        olan simvolunu qaytarsin.
//Meselen: Salam, 4 a herfini return edecek
        String netice = "";
        if(str.length()>=a){
            netice = String.valueOf(str.charAt(a));
        } else{
            netice = "yanlis emeliyat!";
        }
        return netice;

    }

    public boolean sual16(String str,String str2){
//        16. Method 2 String qebul edir ve onlarin beraber olub olmadigini return edir true ve ya false
        if(str==str2){
            return true;
        }
        return false;
    }

    public String sual17(String s, char c, int count){
//        17.Method String s, char c, int count qebul edir. S-i count qeder c ile
//        birleshdirir ve geriye return edir
//
//foo(String s, char c, int count){}
//
//foo(“Soz”, ‘c’, 5); -> Sozccccc

        String netice = "";
        for (int i=0; i<count; i++){
            netice= netice + c;
        }
        s=s+netice;
        return s;

    }

    public boolean sual18(String a, String b, String c ){
//        18. Method 3 String qebul edir. String a, String b, String c.
//        A ve b-nin ichinde c varsa onda true eks halda false

        if(a.contains(c) && b.contains(c)){
            return true;

        }
        return false;
    }

    public void sual19(String a, int begin,int end){
//                19.method String a, int begin, int end daxil edilir. A-nin begin
//                ve end arasini alt alta chap edir.
        String b = a.substring(begin,end);
        System.out.println(b);
    }

    public String sual20(){
//        20. 2 soz daxil edilir uzunlugu boyuk olan String geriye return edilir.
//        “Hello”, Hello World” -> Hello World return olacaq
        String netice ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("ilk sozu daxil edin");
        String a=sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("ikinci sozu daxil edin");
        String b=sc.nextLine();

        if(a.length()>b.length()){
            netice= a;
        }
        else if(a.length()<b.length()){
            netice= b;
        }else{
            netice = "iki sozun de uzunlugu eynidir";
        }
        return netice;
    }

    public void sual21() {
//       21.Ele bir method yazin ki: HeLLo WorlD-> chevrilsin olsun hEllO wORLd.

        Scanner sc = new Scanner(System.in);
        System.out.println("cumleni daxil edin");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == Character.toUpperCase(str.charAt(i))) {
                System.out.print(Character.toLowerCase(str.charAt(i)));
            } else {
                System.out.print(Character.toUpperCase(str.charAt(i)));
            }
        }
    }


    public void sual22(){
//        22.”     Salam necesen ishler nece gedir      “
//        metnini “Salam necesen ishler nece gedir” halina getirin.

        Scanner sc = new Scanner(System.in);
        System.out.println("cumleni daxil edin");
        String a=sc.nextLine();
        a=a.trim();
        System.out.println(a);
    }

    public void ulduzluSual1(){
//        **********
//        **********
//        **********
//        **********
//        **********
        Scanner sc = new Scanner(System.in);
        String ulduz = sc.nextLine();
        for(int i = 0; i<5; i++){
            for(int j=0; j<10;j++){
                System.out.print(ulduz);
            }
            System.out.println();
        }
    }

    public void ulduzluSual2(){
//        *
//        **
//        ***
//        ****
//        *****
        Scanner sc = new Scanner(System.in);
        String ulduz = sc.nextLine();
        for(int i = 0; i<5; i++){
            for(int j=0; j<i+1;j++){
                System.out.print(ulduz);
            }
            System.out.println();
        }
    }

    public void ulduzluSual3(){
//            *
//           **
//          ***
//         ****
//        *****
        Scanner sc = new Scanner(System.in);
        String ulduz = sc.nextLine();
        for(int i = 5; i>0; i--){
            for(int j=1; j<=5;j++){
                if(j>=i){
                    System.out.print(ulduz);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void ulduzluSual4() {
//        *
//       ***
//      *****
//     *******
//    *********
        Scanner sc = new Scanner(System.in);
        System.out.println("simvol nece setirden ibaret olsun?");
        int setir = sc.nextInt();

        for (int i = 0; i < setir; i++) {
            for (int j = 0; j < (setir - i - 1); j++) {

                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public void ulduzluSual5(){
//        *********
//         *******
//          *****
//           ***
//            *

        Scanner sc=new Scanner(System.in);
        System.out.println("Setir sayini mueyyen edin");
        int setir=sc.nextInt();
        for(int i=0;i<setir;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=2*setir-1;k>(2*i);k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

