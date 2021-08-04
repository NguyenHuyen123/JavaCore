public class Baitap_Buoi2 {
    // Bt4: Nhap nam sinh tinh tuoi
    public static void Age(int newyear, int yearOfBirth) {
        int age = newyear - yearOfBirth;
        System.out.println("Bạn sinh năm "+yearOfBirth+" thì tuổi cuả bạn vào năm " + newyear + " là: " + age + " tuổi");
    }

    // bt5: Tính tổng, hiệu, tích, thương của 2 số
    public static void Arithmetic(int a, int b) {
        System.out.println("------");
        int add = a + b;
        System.out.println("Tổng của 2 số a và b: " + add);

        int sub = a - b;
        System.out.println("Hiệu của 2 số a và b: " + sub);

        int mul = a * b;
        System.out.println("Tích của 2 số a và b: " + mul);

        float div = (float) a / b;

        System.out.println("Thương của 2 số a và b: " + div);
    }

    // Bt6: Nhap ten SP, số lượng và đơn giá
    // a. tính tiền
    // b. thuế giá trị gia tăng
    String name;
    int soluong;
    int price;

    public void totalPrice() {
        System.out.println("------");
        System.out.println("Tên SP: " + name + ", số lượng: " + soluong + ", đơn giá: " + price + ", thành tiền: "
                + soluong * price);
    }

    public void tax() {

        System.out.println("Tên SP: " + name + ", số lượng: " + soluong + ", đơn giá: " + price
                + ", thành tiền có thuế: " + soluong * price * 0.1);
    }
    // bt7: điểm thi 3 môn toán, lí, hóa
    // tính điểm trung bình

    public static void Avg(int n, int math, int phys, int chemistry) {
        float avg = ((float) (math + phys + chemistry)) / n;
        double avg1 = Math.round(avg * 100.0) / 100.0;
        System.out.println("-----");
        System.out.println("Điểm môn toán " + math);
        System.out.println("Điểm môn Lí " + phys);
        System.out.println("Điểm môn Hóa " + chemistry);
        System.out.println("Điểm Trung bình của " + n + " môn: " + avg1);
    }

    // Bt8: Tính chu vi và diện tích hình tròn
    final static float PI = (float) 3.14;

    public static void CVvDT(float R) {
        float CV = 2 * PI * R;
        float CV1 = Math.round(CV * 100) / 100;
        System.out.println("-------");
        System.out.println("Chu vi hình tròn :" + CV1);

        float DT = R * R * PI;

        System.out.println("Diện tích hình tròn :" + DT);
    }

    // bt9: Nhập vào số xe của bạn (gồm tối đa 5 chữ số).
    // Cho biết số xe của bạn được mấy nút?
    public static void soXe(int n1, int n2, int n3, int n4, int n5) {
        System.out.println("--------------");
        System.out.println("Bảng số xe " + n1 + n2 + n3 + n4 + n5 + " có: " + (n1 + n2 + n3 + n4 + n5) % 10 + "nút");
    }

    //bt10: Nhập vào 2 số nguyên. Tính min và max của hai số đó.
    public static void minMax(int a, int b) {
        System.out.println("----------");
        if( a==b) {
            System.out.println("error");

        }else {if (a>b) {
            System.out.println("số min b là: "+ b+ ", số max a là: "+ a);
        } else {
            System.out.println("số min là a: "+ a+ ",số max b là: "+ b);

        }
        }
    }

    public static void main(String[] args) {
        Age(2021, 1998);
        Arithmetic(5, 2);
        Baitap_Buoi2 s = new Baitap_Buoi2();
        //
        s.name = "Chuột máy tính";
        s.soluong = 3;
        s.price = 12568;
        s.totalPrice();
        s.tax();
        Avg(3, 5, 6, 5);
        //
        CVvDT(5);
        //
        soXe(4, 6, 9, 2, 6);
        //
        minMax(20, 10);

    }

}
