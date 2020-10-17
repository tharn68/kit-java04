/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapjava;
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;
/**
 *
 * @author Phuong Gau
 */
public class BaiTapJava {
    //bai82 in max trong 3
//    static int timMaxTrong3(int a, int b, int c){
//        int max = a;
//        if(max<b){
//            max = b;
//            if(max<c){
//                return c;
//            }
//            if(max>c){
//                return a;
//            }
//        }
//        if(max>b){
//            if(max>c)
//                return max;
//            if(max<c)
//                return c;
//        }
//        return a;
//    }
    
    //bai83 kiem tra cung dau
//    static void kiemTraCungDau(float a, float b){
//        if(a!=0&&b!=0){
//            if(a*b<0)
//                System.out.println("a, b trai dau");
//            if(a*b>0)
//                System.out.println("a, b cung dau");
//        }
//        else
//            System.out.println("nhap lai");
//    }
    
    //bai 84 pt bac nhat ax+b=0
//    static void ptBacNhat(float a, float b){
//        System.out.println("pt bac nhat: " +a+ "x + " +b+ " = 0");
//        if(a==0){
//            if(b==0)
//                System.out.println("pt co vo so nghiem");
//            else
//                System.out.println("pt vo nghiem");
//        }
//        else{
//            if(b!=0)
//                System.out.println("pt co nghiem x = " +(-b/a));
//            else
//                System.out.println("pt co nghiem x = 0");
//        }
//    }
           
    //bai85 kiem tra thang thuoc quy nao
//    static void kiemtraThangThuocQuyMay(int thang){
//        if(thang==1||thang==2||thang==3)
//            System.out.println("thang " +thang+ " thuoc quy 1");
//        else if(thang==4||thang==5||thang==6)
//            System.out.println("thang " +thang+ " thuoc quy 2");
//        else if(thang==7||thang==8||thang==9)
//            System.out.println("thang " +thang+ " thuoc quy 3");
//        else if(thang==10||thang==11||thang==12)
//            System.out.println("thang " +thang+ " thuoc quy 4");
//        else
//            System.out.println("nhap lai");
//    }
    
    //bai86 tinh tong s(n) = 1^3+2^3+...+n^3
//    static int tinhTong(int n){
//        if(n==0){
//            return 0;
//        }
//        return tinhTong(n-1)+n*n*n;
//    }
    
    //bai87 tim n nguyen duong nn tm 1+2+..+n>10000
//    static void timNNhoNhat(){
//        int s = 0;
//        int n = 1;
//        while(s<=10000){
//            s+=n;
//            n++;
//        }
//        System.out.println("n = "+n);
//    }
    
    //bai88 xuat ki tu tu A den Z
//    static void xuatKitu(){
//        char i;
//        for(i = 'a'; i<='z'; i++){
//            System.out.println("i = "+i);
//        }
//    }
    
    //bai89 tinh tong cac gia tri le nguyen duong nho hon n
//    static void tongSoLe(int n){
//        int s = 0;
//        if(n>0){
//            for(int i=1;i<n;i+=2){
//                s+=i;
//            }
//        }
//        System.out.println("tong cac so le nho hon " +n+ " la: "+s);
//    }
    
    //bai91 in tat ca cac so le nguyen duong nho hon 100
//    static void inSole(){
//        System.out.println("cac so le < 100 la: ");
//        for(int i = 1; i<100; i++){
//            if(i%2==1)
//                System.out.println(""+i);
//        }
//    }
    
    //bai92 uoc chung lon nhat
//    static void UCLN(int a, int b){
//        int ucln = 0;
//        while(a!=b){
//            if(a>b){
//                for(int i = a; i<=a;i--){
//                    if(a%i==0&&b%i==0){
//                        ucln = i;
//                        break;
//                    }
//                }
//                System.out.println("uoc chung lon nhat cua "+a+ " va "+b+ " la: "+ucln);
//                break;
//            }
//            else if(a<b){
//                for(int j=b; j<=b; j--){
//                    if(a%j==0&&b%j==0){
//                        ucln = j;
//                        break;
//                    }
//                }
//                System.out.println("uoc chung lon nhat cua "+a+ " va "+b+ " la: "+ucln);
//                break;
//            }
//            System.out.println("nhap lai");
//        }
//    }
    
    //bai 93 kiem tra mot so co phai so nguyen to
//    static int kiemTraSNT(int n){
//        for(int i = 2; i<n; i++){
//            if(n%i==0)
//                return 0;
//        }
//        return 1;
//    }
    
    //bai94 in so le nho hon 100 tru 5, 7, 93
//    static void soLe(){
//        for(int i = 1; i<100; i++){
//            if(i%2==1&&i!=5&&i!=7&&i!=93){
//                System.out.println(i);
//            }
//        }
//    }
    
    //bai95 nhap 3 so thuc thay am thanh tri tuyet doi
//    static void triTuyetDoi(int a, int b, int c){
//        if(a<0){
//            System.out.println(-a+", "+b+", "+c);
//        }
//        if(b<0){
//            System.out.println(a+", "+-b+", "+c);
//        }
//        if(c<0){
//            System.out.println(a+", "+b+", "+-c);
//        }
//    }
    
    //bai96 tinh gia tri cua ham so
//    static void giaTriCuaHamSo(){
//        
//    }
//    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap = new Scanner(System.in);
//        System.out.println("so lon nhat la: "+timMaxTrong3(a, b, c));
//        kiemTraCungDau(a, b);
//        kiemtraThangThuocQuyMay(thang);
//        System.out.println("tong s = " +tinhTong(n));
//        timNNhoNhat();
//        xuatKitu();
//        tongSoLe(n);
//        timMLonNhat(n);
//        ptBacNhat(a, b);
//        inSole();
//        UCLN(a, b);
//        kiemTraSNT(n);
//        if(kiemTraSNT(n)==0){
//            System.out.println(n+" khong la snt");
//        }
//        else{
//            System.out.println(n+" la snt");
//        }
//        soLe();
        int a, b, c;
        a = nhap.nextInt();
        b = nhap.nextInt();
        c = nhap.nextInt();
        triTuyetDoi(a, b, c);
    }
}
