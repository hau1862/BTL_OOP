package thongtin;

/**
 * Lớp GiaoDich lưu trữ các thông tin về giao dịch trong ngày
 *
 * @author
 */
public class GiaoDich {
    private long khoiLuongKhopLenh, khoiLuongThoaThuan, giaTriKhopLenh, giaTriThoaThuan;

    public GiaoDich(long khoiLuongKhopLenh, long khoiLuongThoaThuan, long giaTriKhopLenh, long giaTriThoaThuan){
        this.setKhopLenh(khoiLuongKhopLenh, giaTriKhopLenh);
        this.setThoaThuan(khoiLuongThoaThuan, giaTriThoaThuan);
    }

    public void setKhopLenh(long khoiLuongKhopLenh, long giaTriKhopLenh){
        this.khoiLuongKhopLenh = khoiLuongKhopLenh;
        this.giaTriKhopLenh = giaTriKhopLenh;
    }
    public void setThoaThuan(long khoiLuongThoaThuan, long giaTriThoaThuan) {
        this.khoiLuongThoaThuan = khoiLuongThoaThuan;
        this.giaTriThoaThuan = giaTriThoaThuan;
    }


    public long getTongKhoiLuong(){
        return getKhoiLuongKhopLenh() + getKhoiLuongThoaThuan();
    }
    public long getTongGiaTri(){
        return getGiaTriKhopLenh() + getGiaTriThoaThuan();
    }

    public long getKhoiLuongKhopLenh(){
        return khoiLuongKhopLenh;
    }
    public long getGiaTriKhopLenh(){
        return giaTriKhopLenh;
    }
    public long getKhoiLuongThoaThuan(){
        return khoiLuongThoaThuan;
    }
    public long getGiaTriThoaThuan(){
        return giaTriThoaThuan;
    }

}
