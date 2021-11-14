abstract class Arac{
    private String modelAdi;
    private final int uretimYili;
    private String yakitTuru;
    private double motorHacmi;
    private final int maxHiz;
    private int hiz;
    private boolean calisiyor = false;

    public Arac(String modelAdi, int uretimYili, String yakitTuru, double motorHacmi, int maxHiz, int hiz) {
        this.modelAdi = modelAdi;
        this.uretimYili = uretimYili;
        this.yakitTuru = yakitTuru;
        this.motorHacmi = motorHacmi;
        this.maxHiz = maxHiz;
        this.hiz = hiz;
    }

    public String getModelAdi() {
        return modelAdi;
    }

    public void setModelAdi(String modelAdi) {
        this.modelAdi = modelAdi;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public String getYakitTuru() {
        return yakitTuru;
    }

    public void setYakitTuru(String yakitTuru) {
        this.yakitTuru = yakitTuru;
    }

    public double getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(double motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public int getMaxHiz() {
        return maxHiz;
    }

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    public boolean isCalisiyor() {
        return calisiyor;
    }

    public void setCalisiyor(boolean calisiyor) {
        this.calisiyor = calisiyor;
    }

    public abstract void aracCalistir();

    /*public void aracDurdur(){
        if(calisiyor){
            calisiyor = false;
            System.out.println("Arac durduruldu");
        }
    }*/

    public abstract void gaz();
    public abstract void fren();

    @Override
    public String toString() {
        return "Araç model: " + this.modelAdi + " Üretim yılı: " + this.uretimYili + " Yakıt türü: " + this.yakitTuru + " Motor hacmi: " + this.motorHacmi + " Max hız: " + this.maxHiz + " Hız: " + this.hiz;
    }
}