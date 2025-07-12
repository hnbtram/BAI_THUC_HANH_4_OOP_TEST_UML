import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThanhToan {
    private double giaTienGio = 15000; // 15,000 VND/giờ
    private Map<String, Double> dichVuDiKem = new HashMap<>();
    
    public ThanhToan() {
        // Khởi tạo các dịch vụ đi kèm và giá
        dichVuDiKem.put("Nước ngọt", 15000.0);
        dichVuDiKem.put("Mì gói", 20000.0);
        dichVuDiKem.put("Bánh snack", 10000.0);
    }
    
    // Tính tiền sử dụng máy
    public double tinhTienGioSuDung(Date batDau, Date ketThuc) {
        long thoiGianSuDung = ketThuc.getTime() - batDau.getTime();
        double soGio = thoiGianSuDung / (1000.0 * 60 * 60);
        return soGio * giaTienGio;
    }
    
    // Tính tiền dịch vụ đi kèm
    public double tinhTienDichVu(List<String> danhSachDichVu) {
        double tienDichVu = 0;
        for (String dv : danhSachDichVu) {
            tienDichVu += dichVuDiKem.getOrDefault(dv, 0.0);
        }
        return tienDichVu;
    }
    
    // Tính tổng tiền
    public double tinhTien(Date batDau, Date ketThuc, List<String> danhSachDichVu) {
        return tinhTienGioSuDung(batDau, ketThuc) + tinhTienDichVu(danhSachDichVu);
    }
    
    // In hóa đơn
    public void inHoaDon(String maMay, Date batDau, Date ketThuc, List<String> dichVu) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        double tienGio = tinhTienGioSuDung(batDau, ketThuc);
        double tienDichVu = tinhTienDichVu(dichVu);
        double tongTien = tienGio + tienDichVu;
        
        long thoiGianSuDung = ketThuc.getTime() - batDau.getTime();
        double soGio = thoiGianSuDung / (1000.0 * 60 * 60);
        
        System.out.println("======== HÓA ĐƠN THANH TOÁN ========");
        System.out.println("Máy: " + maMay);
        System.out.println("Thời gian bắt đầu: " + sdf.format(batDau));
        System.out.println("Thời gian kết thúc: " + sdf.format(ketThuc));
        System.out.printf("Thời gian sử dụng: %.2f giờ\n", soGio);
        
        System.out.println("\nDịch vụ sử dụng:");
        for (String dv : dichVu) {
            System.out.printf("- %s: %.0f VND\n", dv, dichVuDiKem.get(dv));
        }
        
        System.out.println("\nChi tiết thanh toán:");
        System.out.printf("- Tiền máy: %.0f VND (%.2f giờ x %.0f VND/giờ)\n", 
                         tienGio, soGio, giaTienGio);
        System.out.printf("- Tiền dịch vụ: %.0f VND\n", tienDichVu);
        System.out.printf("TỔNG CỘNG: %.0f VND\n", tongTien);
        System.out.println("===================================");
    }
    
    // Test chức năng
    public static void main(String[] args) {
        ThanhToan thanhToan = new ThanhToan();
        
        // Tạo dữ liệu test
        Date now = new Date();
        Date later = new Date(now.getTime() + 2 * 60 * 60 * 1000); // +2 giờ
        
        List<String> dichVu = new ArrayList<>();
        dichVu.add("Nước ngọt");
        dichVu.add("Bánh snack");
        
        // In hóa đơn
        thanhToan.inHoaDon("MT001", now, later, dichVu);
    }
}