
package lab5;
public class NhanVien {
    public String ten;
    public long luong;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }
    
    public NhanVien() {
        //khởi tạo mặc định
    }
    
    public NhanVien(String ten) {
        this.ten = ten;
        System.out.println("Ten nhan vien: " + ten);
    }
    
    public void loaiNhanVien(String loaiNhanVien) {
    }
    
    public void tinhLuong() {
    }
    
    public void xuatThongTin() {
        System.out.println("thong tin...");
    }
    
    public class NhanVienFullTime extends NhanVien {
        public int loaiChucVu;
        public int LamThem;
        private final int ngayLamThem;

        public int getLoaiChucVu() {
            return loaiChucVu;
        }

        public void setLoaiChucVu(int loaiChucVu) {
            this.loaiChucVu = loaiChucVu;
        }

        public int getLamThem() {
            return LamThem;
        }

        public void setLamThem(int LamThem) {
            this.LamThem = LamThem;
        }
        
        public NhanVienFullTime(String ten, int ngayLamThem, int loaiChucVu) {
            this.ten = ten;
            this.ngayLamThem = ngayLamThem;
       }
        @Override
        public void loaiNhanVien(String loaiNhanVien){
        }
        
        @Override
        public void tinhLuong(){
        }
    }
    public class NhanVienPartTime extends NhanVien{
        public int gioLamViec;

        public int getGioLamViec() {
            return gioLamViec;
        }

        public void setGioLamViec(int gioLamViec){
            this.gioLamViec = gioLamViec;
        }
            
        public void NhanVienPartTime(String ten, int gioLamViec){
            this.ten = ten;
            this.gioLamViec = gioLamViec;
        }
            
        @Override
        public void loaiNhanVien(String loaiNhanVien){
        }
        @Override
        public void tinhLuong(){
        }
    }
    
    public class Mainclass{
        public static void main(String[] args){
            NhanVien nv = new NhanVien();
            nv.tinhLuong();
        }
    }
}


