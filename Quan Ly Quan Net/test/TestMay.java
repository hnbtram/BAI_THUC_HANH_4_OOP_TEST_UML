public class TestMay {
    public static void main(String[] args) {
        // 1. Tạo máy tính mới
        MayTinh may1 = new MayTinh("MT001");
        
        // 2. Kiểm tra trạng thái ban đầu
        System.out.println("Thông tin máy khi mới tạo:");
        System.out.println(may1.thongTinMay());
        
        // 3. Thêm phần mềm
        may1.themPhanMem("Windows 11");
        may1.themPhanMem("Google Chrome");
        System.out.println("\nDanh sách phần mềm sau khi thêm:");
        System.out.println(may1.getDanhSachPhanMem());
        
        // 4. Sử dụng máy
        System.out.println("\nBắt đầu sử dụng máy:");
        may1.batDauSuDung();
        
        // Giả lập thời gian chờ (1 giây)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // 5. Kết thúc sử dụng
        may1.ketThucSuDung();
        
        // 6. Kiểm tra thời gian và chi phí
        System.out.println("\nThông tin sau khi sử dụng:");
        System.out.println("- Thời gian sử dụng: " + may1.tinhThoiGianSuDung() + " phút");
        System.out.println("- Chi phí: " + may1.tinhChiPhi() + " VND");
    }
}
