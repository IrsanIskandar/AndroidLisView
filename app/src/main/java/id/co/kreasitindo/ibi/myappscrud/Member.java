package id.co.kreasitindo.ibi.myappscrud;

import java.io.Serializable;

public class Member implements Serializable {
    public String namaLengkap;
    public String jnsKelamin;
    public String tmpLahir;
    public String tglLahir;
    public String alamatLengkap;

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getJnsKelamin() {
        return jnsKelamin;
    }

    public void setJnsKelamin(String jnsKelamin) {
        this.jnsKelamin = jnsKelamin;
    }

    public String getTmpLahir() {
        return tmpLahir;
    }

    public void setTmpLahir(String tmpLahir) {
        this.tmpLahir = tmpLahir;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getAlamatLengkap() {
        return alamatLengkap;
    }

    public void setAlamatLengkap(String alamatLengkap) {
        this.alamatLengkap = alamatLengkap;
    }

    /*public Member(String namaLengkap, String jnsKelamin, String tmpLahir, String tglLahir, String alamatLengkap) {
        this.namaLengkap = namaLengkap;
        this.jnsKelamin = jnsKelamin;
        this.tmpLahir = tmpLahir;
        this.tglLahir = tglLahir;
        this.alamatLengkap = alamatLengkap;
    }*/
}
