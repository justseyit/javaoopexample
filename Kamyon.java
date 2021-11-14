public class Kamyon extends Arac {

    private int yukKapasitesi;
    private int tekerlekSayisi;

    public Kamyon(String modelAdi, int uretimYili, String yakitTuru, double motorHacmi, int maxHiz, int hiz, int yukKapasitesi, int tekerlekSayisi) {
        super(modelAdi, uretimYili, yakitTuru, motorHacmi, 120, hiz);
        this.yukKapasitesi = yukKapasitesi;
        this.tekerlekSayisi = tekerlekSayisi;
    }

    @Override
    public void aracCalistir() {
        super.setCalisiyor(true);
        System.out.println("Kamyon çalıştırıldı. Model: +"+ super.getModelAdi() +" Üretim yılı: "+ super.getUretimYili() +" Yakıt türü: "+ super.getYakitTuru() +" Motor hacmi: "+ super.getMotorHacmi() +" Max hız: "+ super.getMaxHiz() +" Hız: "+ super.getHiz());
    }

    @Override
    public void gaz() {
        if(super.isCalisiyor() && super.getHiz() < super.getMaxHiz()){
            System.out.println("Kamyon gazlandı.");
            super.setHiz(super.getHiz() + 5);
        }
        else{
            System.out.println("Kamyon gazlanamaz çünkü çalışmıyor.");
        }
    }

    @Override
    public void fren() {
        if(super.isCalisiyor() && super.getHiz() > 0){
            System.out.println("Kamyon frenlendi.");
            super.setHiz(super.getHiz() - 5);
        }
        else{
            System.out.println("Kamyon frenlenemez çünkü çalışmıyor.");
        }
    }

    public int getYukKapasitesi() {
        return yukKapasitesi;
    }

    public void setYukKapasitesi(int yukKapasitesi) {
        this.yukKapasitesi = yukKapasitesi;
    }

    public int getTekerlekSayisi() {
        return tekerlekSayisi;
    }

    public void setTekerlekSayisi(int tekerlekSayisi) {
        this.tekerlekSayisi = tekerlekSayisi;
    }

    @Override
    public String toString() {
        return super.toString() + "Yük kapasitesi: " + yukKapasitesi + " Tekerlek sayısı: " + tekerlekSayisi;
    }
    
}
