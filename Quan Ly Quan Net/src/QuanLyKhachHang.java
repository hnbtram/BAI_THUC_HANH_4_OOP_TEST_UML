import java.util.HashMap;
import java.util.Map;

public class QuanLyKhachHang {
    private Map<String, KhachHang> danhSachKH;

    public QuanLyKhachHang() {
        this.danhSachKH = new HashMap<>();
    }

    // Thêm khách hàng mới
    public void themKhachHang(KhachHang kh) {
        danhSachKH.put(kh.getMaKH(), kh);
    }

    // Sửa thông tin khách hàng
    public void suaKhachHang(String maKH, String tenMoi, String soDTMoi) {
        KhachHang kh = danhSachKH.get(maKH);
        if (kh != null) {
            kh.setTenKH(tenMoi);
            kh.setSoDT(soDTMoi);
        }
    }

    // Xóa khách hàng
    public void xoaKhachHang(String maKH) {
        danhSachKH.remove(maKH);
    }

    // Thêm giao dịch nạp tiền
    public void themNapTien(String maKH, double soTien) {
        KhachHang kh = danhSachKH.get(maKH);
        if (kh != null) {
            kh.themGiaoDich("Nạp tiền: +" + soTien + " VND");
        }
    }

    // Xem thông tin khách hàng
    public KhachHang xemThongTin(String maKH) {
        return danhSachKH.get(maKH);
    }

    // Hiển thị tất cả khách hàng
    public void hienThiTatCa() {
        danhSachKH.values().forEach(System.out::println);
    }
}