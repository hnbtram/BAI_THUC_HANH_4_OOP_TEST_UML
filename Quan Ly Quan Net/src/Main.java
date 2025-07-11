public class Main {
    public static void main(String[] args) {
        QuanLyKhachHang qlkh = new QuanLyKhachHang();

        // Thêm khách hàng
        qlkh.themKhachHang(new KhachHang("KH001", "Nguyễn Văn A", "0912345678"));
        qlkh.themKhachHang(new KhachHang("KH002", "Trần Thị B", "0987654321"));

        // Sửa thông tin
        qlkh.suaKhachHang("KH001", "Nguyễn Văn An", "0911111111");

        // Nạp tiền
        qlkh.themNapTien("KH001", 500000);
        qlkh.themNapTien("KH001", 200000);
        qlkh.themNapTien("KH002", 1000000);

        // Hiển thị thông tin
        System.out.println("Danh sách khách hàng:");
        qlkh.hienThiTatCa();

        // Xem chi tiết 1 khách hàng
        System.out.println("\nThông tin chi tiết KH001:");
        KhachHang kh = qlkh.xemThongTin("KH001");
        System.out.println(kh);
        System.out.println("Lịch sử giao dịch:");
        kh.getLichSuGiaoDich().forEach(System.out::println);
    }
}