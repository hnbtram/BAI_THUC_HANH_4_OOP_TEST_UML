public class TestKhachHang{


    public static void main(String[] args) {
        // Tạo một khách hàng mới
        KhachHang khachHang = new KhachHang("KH001", "Nguyen Van A", "0123456789");

        // Hiển thị thông tin khách hàng
        System.out.println("Mã khách hàng: " + khachHang.getMaKhachHang());
        System.out.println("Họ tên: " + khachHang.getHoTen());
        System.out.println("Số điện thoại: " + khachHang.getSoDienThoai());

        // Sửa tên khách hàng
        khachHang.setHoTen("Tran Van B");

        // Nạp tiền vào tài khoản
        khachHang.napTien(100000);

        // Xem lịch sử nạp tiền
        khachHang.xemLichSuNapTien();

        // Thêm dịch vụ đã sử dụng
        khachHang.themDichVuDaSuDung("Internet");
    }
}