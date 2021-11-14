public class Otomobil extends Arac {

    private boolean havaYastigi;
    
    public Otomobil(String modelAdi, int uretimYili, String yakitTuru, double motorHacmi, int maxHiz, int hiz, boolean havaYastigi) {
        super(modelAdi, uretimYili, yakitTuru, motorHacmi, 180, hiz);
        this.havaYastigi = havaYastigi;
    }

    @Override
    public void aracCalistir() {
        super.setCalisiyor(true);
        System.out.println("Otomobil çalıştırıldı. Model: +"+ super.getModelAdi() +" Üretim yılı: "+ super.getUretimYili() +" Yakıt türü: "+ super.getYakitTuru() +" Motor hacmi: "+ super.getMotorHacmi() +" Max hız: "+ super.getMaxHiz() +" Hız: "+ super.getHiz());
    }

    @Override
    public void gaz() {
        if(super.isCalisiyor() && super.getHiz() < super.getMaxHiz()){
            System.out.println("Otomobil gazlandı.");
            super.setHiz(super.getHiz() + 20);
        }
        else{
            System.out.println("Otomobil gazlanamaz çünkü çalışmıyor.");
        }
    }
    @Override
    public void fren() {
        if(super.isCalisiyor() && super.getHiz() > 0){
            System.out.println("Otomobil frenlendi.");
            super.setHiz(super.getHiz() - 20);
        }
        else{
            System.out.println("Otomobil frenlenemez çünkü çalışmıyor.");
        }
    }

    public boolean getHavaYastigi() {
        return havaYastigi;
    }

    public void setHavaYastigi(boolean havaYastigi) {
        this.havaYastigi = havaYastigi;
    }

}
