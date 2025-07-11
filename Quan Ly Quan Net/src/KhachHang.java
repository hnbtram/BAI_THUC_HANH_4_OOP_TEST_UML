import java.util.ArrayList;
import java.util.List;

public class KhachHang {
    private String maKH;
    private String tenKH;
    private String soDT;
    private List<String> lichSuGiaoDich;

    public KhachHang(String maKH, String tenKH, String soDT) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.soDT = soDT;
        this.lichSuGiaoDich = new ArrayList<>();
    }

    // Thêm giao dịch vào lịch sử
    public void themGiaoDich(String giaoDich) {
        lichSuGiaoDich.add(giaoDich);
    }

    // Getter và Setter
    public String getMaKH() { return maKH; }
    public String getTenKH() { return tenKH; }
    public void setTenKH(String tenKH) { this.tenKH = tenKH; }
    public String getSoDT() { return soDT; }
    public void setSoDT(String soDT) { this.soDT = soDT; }
    public List<String> getLichSuGiaoDich() { return new ArrayList<>(lichSuGiaoDich); }

    @Override
    public String toString() {
        return "Mã KH: " + maKH + ", Tên: " + tenKH + ", SĐT: " + soDT;
    }
}