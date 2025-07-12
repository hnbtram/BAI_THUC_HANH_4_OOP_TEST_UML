import java.util.ArrayList;
import java.util.List;

public class KhachHang {
    // Thông tin cá nhân
    private String maKhachHang;
    private String hoTen;
    private String soDienThoai;

    // Lịch sử và theo dõi
    private List<Double> lichSuNapTien;
    private List<String> cacDichVuDaSuDung;

    // Constructor
    public KhachHang(String maKhachHang, String hoTen, String soDienThoai) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.lichSuNapTien = new ArrayList<>();
        this.cacDichVuDaSuDung = new ArrayList<>();
    }

    // Phương thức thêm, sửa, xoá tên khách hàng (đối với tên thì là sửa)
    // Sửa tên khách hàng
    public void setHoTen(String newHoTen) {
        this.hoTen = newHoTen;
        System.out.println("Đã cập nhật tên khách hàng " + this.maKhachHang + " thành: " + newHoTen);
    }

    // Các phương thức lấy thông tin (Getters)
    public String getMaKhachHang() {
        return maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    // Xem lịch sử nạp tiền
    public void xemLichSuNapTien() {
        System.out.println("Lịch sử nạp tiền của " + hoTen + ": " + lichSuNapTien);
    }

    // Thêm tiền vào lịch sử nạp
    public void napTien(double amount) {
        if (amount > 0) {
            lichSuNapTien.add(amount);
            System.out.println(hoTen + " đã nạp thành công: " + amount + " VND");
        } else {
            System.out.println("Số tiền nạp phải lớn hơn 0.");
        }
    }

    // Theo dõi các dịch vụ đã sử dụng
    public void themDichVuDaSuDung(String service) {
        cacDichVuDaSuDung.add(service);
        System.out.println("Dịch vụ '" + service + "' đã được thêm vào lịch sử của " + hoTen);
    }

    public void xemCacDichVuDaSuDung() {
        System.out.println("Các dịch vụ " + hoTen + " đã sử dụng: " + cacDichVuDaSuDung);
    }

    // Để minh họa việc sử dụng các phương thức
    public static void main(String[] args) {
        // Tạo một khách hàng mới
        KhachHang khach1 = new KhachHang("KH001", "Nguyen Van A", "0912345678");

        // Xem thông tin ban đầu
        System.out.println("--- Thông tin Khách hàng 1 ---");
        System.out.println("Mã: " + khach1.getMaKhachHang());
        System.out.println("Tên: " + khach1.getHoTen());
        System.out.println("SĐT: " + khach1.getSoDienThoai());
        khach1.xemLichSuNapTien();
        khach1.xemCacDichVuDaSuDung();

        // Nạp tiền
        khach1.napTien(50000.0);
        khach1.napTien(100000.0);

        // Sử dụng dịch vụ
        khach1.themDichVuDaSuDung("Game Lien Minh");
        khach1.themDichVuDaSuDung("Internet 1 ngay");
        khach1.themDichVuDaSuDung("Cafe sua da");

        // Sửa tên khách hàng
        khach1.setHoTen("Nguyen Van An");

        // Xem lại thông tin sau khi thay đổi
        System.out.println("\n--- Thông tin Khách hàng 1 (sau khi cập nhật) ---");
        System.out.println("Mã: " + khach1.getMaKhachHang());
        System.out.println("Tên: " + khach1.getHoTen());
        System.out.println("SĐT: " + khach1.getSoDienThoai());
        khach1.xemLichSuNapTien();
        khach1.xemCacDichVuDaSuDung();

        
    }
}