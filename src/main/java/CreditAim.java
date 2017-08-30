
public enum CreditAim {

    FORSTUDY, FORCAR,FROHOUSE, FORHOMETECHNICS;

    @Override
    public String toString() {
       switch (this){
           case FORCAR:return "For car";
           case FORSTUDY:return "for study";
           case FROHOUSE:return "for house";
           case FORHOMETECHNICS:return "for home technics";
           default:return "no aim";
       }
    }
}
