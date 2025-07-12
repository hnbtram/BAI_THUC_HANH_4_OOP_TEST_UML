import java.util.*;

public class TestThanhToan {
    public static void main(String[] args) {
        ThanhToan tt = new ThanhToan();
        Date now = new Date();
        Date later = new Date(now.getTime() + 2 * 60 * 60 * 1000); // +2 tiếng
        
        // Test 1: Tính tiền giờ
        double tienGio = tt.tinhTienGioSuDung(now, later);
        System.out.println("Tiền 2 giờ: " + tienGio + " (Dự tính: 30000)");
        
        // Test 2: Tính tiền dịch vụ
        List<String> dichVu = Arrays.asList("Nước ngọt", "Bánh snack");
        double tienDV = tt.tinhTienDichVu(dichVu);
        System.out.println("Tiền dịch vụ: " + tienDV + " (Dự tính: 25000)");
        
        // Test 3: In hóa đơn
        System.out.println("\nHóa đơn mẫu:");
        tt.inHoaDon("MT01", now, later, dichVu);
    }
}