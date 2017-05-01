import java.util.Scanner;
public class TicTacToe56131778
{
  public static Scanner tam = new Scanner(System.in);

  public static void main(String[] args)
  {
	 String tenAnhHung = new String();
	 Scanner boNhap = new Scanner(System.in);
    final int MAX = 3;
    char[][] BanCo = new char[MAX][MAX]; 

    NapbanCo(BanCo); 

    System.out.println("::::::::::::::::::::: CHÀO MỪNG ĐẾN VỚI ĐẤU TRƯỜNG TIC-TAC-TOE!! :::::::::::::::::::::\n");
    HienThiBanCo(BanCo);
    System.out.println("XIN VUI LÒNG NHẬP TÊN ANH HÙNG: \n");
    tenAnhHung = boNhap.nextLine();
    System.out.print("  XIN MỜI ANH HÙNG CHON ĐỘI:  \"x\" or \"o\"? ");
    char anhHungKiTu = tam.next().toLowerCase().charAt(0);
    char mayKiTu = (anhHungKiTu == 'x') ? 'o' : 'x';

    System.out.println();
    System.out.print("  BẠN CÓ MUỐN ĐI TRƯỚC (c/k)? ");
    char ketQua = tam.next().toLowerCase().charAt(0);

    int coHieu;  // trang thai luot choi 0 - nguoi, 1 - may
    int Dem = MAX * MAX; 

    if (ketQua == 'c') {
      coHieu = 0;
      LuotChoiCuaAnhHung(BanCo, anhHungKiTu); 
    }
    else {
      coHieu = 1;
      LuotChoiCuaMayTinh(BanCo, mayKiTu); 
    }
    HienThiBanCo(BanCo);
    Dem--;

    
    boolean ketThuc = false;
    int chienThang = -1;

    while (!ketThuc && Dem > 0) {
      ketThuc = kiemTraKetThuc(BanCo, coHieu, anhHungKiTu, mayKiTu);

      if (ketThuc)
        chienThang = coHieu; 
      else {
        coHieu = (coHieu + 1 ) % 2;

        if (coHieu == 0)
          LuotChoiCuaAnhHung(BanCo, anhHungKiTu);
        else
          LuotChoiCuaMayTinh(BanCo, mayKiTu);

        HienThiBanCo(BanCo);
        Dem--;
      }
    }

    if (chienThang == 0)
      System.out.println("\n.::::::: XIN CHÚC MỪNG " + tenAnhHung +"! " + tenAnhHung +" ĐÃ THẰNG! CÔNG LÝ THUỘC VỀ " + tenAnhHung +" :::::::.");
    else if (chienThang == 1)
      System.out.println("\n.::::::: RẤT TIẾC CHO " + tenAnhHung +"! " + tenAnhHung +" ĐÃ THUA, CHÚC " + tenAnhHung +" MAY MẮN LẦN SAU");
    else
    	System.out.println("\n.::::::: XIN CHÚC MỪNG " + tenAnhHung +"! " + tenAnhHung +" ĐÃ HÒA! MỘT NỬA CÔNG LÝ THUỘC VỀ " + tenAnhHung +" :::::::.");
    
  }

  public static void NapbanCo(char[][] banCoTam)
  {
    for (int i = 0; i < banCoTam.length; i++)
      for (int j = 0; j < banCoTam[0].length; j++)
        banCoTam[i][j] = ' ';
  }

  public static void HienThiBanCo(char[][] banCoTam)
  {
    int hangSo = banCoTam.length;
    int coSo = banCoTam[0].length;

    System.out.println();

    System.out.print("    ");
    for (int i = 0; i < coSo; i++)
      System.out.print(i + "   ");
    System.out.print('\n');

    System.out.println(); 

    for (int i = 0; i < hangSo; i++) {
      System.out.print(i + "  ");
      for (int j = 0; j < coSo; j++) {
        if (j != 0)
          System.out.print("|");
        System.out.print(" " + banCoTam[i][j] + " ");
      }

      System.out.println();

      if (i != (hangSo - 1)) {
        // separator line
        System.out.print("   ");
        for (int j = 0; j < coSo; j++) {
          if (j != 0)
            System.out.print("+");
          System.out.print("---");
        }
        System.out.println();
      }
    }
    System.out.println();
  }

  public static void LuotChoiCuaAnhHung(char[][] banCoTam, char kiTuAnhHung)
  {
    System.out.print("\nNhập chỉ số hàng và cột mà bạn muốn đánh: ");
    int hang = tam.nextInt();
    int cot = tam.nextInt();

    while ( hang < 0 || hang > 2 || cot < 0 || cot > 2  || (banCoTam[hang][cot] != ' ')) 
    {
      System.out.print("\n!! Bạn không thể đánh ô này.\nNhập chỉ số hàng và cột mà bạn muốn đánh: ");
      hang = tam.nextInt();
      cot = tam.nextInt();
    }
   
    banCoTam[hang][cot] = kiTuAnhHung;
  }

  public static void LuotChoiCuaMayTinh(char[][] banCoTam, char kiTuMayTinh)
  {
    for (int i = 0; i < banCoTam.length; i++) {
      for (int j = 0; j < banCoTam[0].length; j++) {
        if (banCoTam[i][j] == ' ') { 
          banCoTam[i][j] = kiTuMayTinh;
          return;
        }
      }
    }
  }

  public static boolean kiemTraKetThuc(char[][] banCoTam, int coHieu, char kiTuAnhHung, char kiTuMayTinh)
  {
    char tmpkiTu;
    if (coHieu == 0)
      tmpkiTu = kiTuAnhHung;
    else
      tmpkiTu = kiTuMayTinh;

    int i, j;
    boolean kiemTra = false;

    for (i = 0; i < banCoTam.length && !kiemTra; i++) {
      for (j = 0; j < banCoTam[0].length; j++) {
        if (banCoTam[i][j] != tmpkiTu)
          break;
      }
      if (j == banCoTam[0].length)
        kiemTra = true;
    }

    for (j = 0; j < banCoTam[0].length && !kiemTra; j++) {
      for (i = 0; i < banCoTam.length; i++) {
        if (banCoTam[i][j] != tmpkiTu)
          break;
      }
      if (i == banCoTam.length)
        kiemTra = true;
    }

    if (!kiemTra) {
      for (i = 0; i < banCoTam.length; i++) {
        if (banCoTam[i][i] != tmpkiTu)
          break;
      }
      if (i == banCoTam.length)
        kiemTra = true;
    }

    if (!kiemTra) {
      for (i = 0; i < banCoTam.length; i++) {
        if (banCoTam[i][banCoTam.length - 1 - i] != tmpkiTu)
          break;
      }
      if (i == banCoTam.length)
        kiemTra = true;
    }

    return kiemTra;
  }
}