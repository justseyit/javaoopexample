public class Minibus extends Arac implements OtomatikKapi, Klima {

    private int yolcuKapasitesi;

    public Minibus(String modelAdi, int uretimYili, String yakitTuru, double motorHacmi, int hiz, int yolcuKapasitesi) {
        super(modelAdi, uretimYili, yakitTuru, motorHacmi, 160, hiz);
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    @Override
    public void aracCalistir() {
        super.setCalisiyor(true);
        System.out.println("Minibüs çalıştırıldı. Model: +"+ super.getModelAdi() +" Üretim yılı: "+ super.getUretimYili() +" Yakıt türü: "+ super.getYakitTuru() +" Motor hacmi: "+ super.getMotorHacmi() +" Max hız: "+ super.getMaxHiz() +" Hız: "+ super.getHiz());
    }

    @Override
    public void gaz() {
        if(super.isCalisiyor() && super.getHiz() < super.getMaxHiz()){
            System.out.println("Minibüs gazlandı.");
            super.setHiz(super.getHiz() + 10);
        }
        else{
            System.out.println("Minibüs gazlanamaz çünkü çalışmıyor.");
        }
    }
    @Override
    public void fren() {
        if(super.isCalisiyor() && super.getHiz() > 0){
            System.out.println("Minibüs frenlendi.");
            super.setHiz(super.getHiz() - 10);
        }
        else{
            System.out.println("Minibüs frenlenemez çünkü çalışmıyor.");
        }
    }

    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }
    
}
