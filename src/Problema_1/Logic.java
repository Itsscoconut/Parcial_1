package Problema_1;
/*Diseñe un POO el cual calculara el costo de una llamada telefónica,
capturando la duración de la llamada en minutos y conociendo lo siguiente:
Cada minuto cuesta $3
Realice el Diagrama UML */

public class Logic {
    private float minutes;

    public void setMinutes(float minutes) {
        this.minutes = minutes;
    }

    public boolean verify(){
        if(minutes!=0&&minutes>0){
            return true;
        }else{
            return false;
        }
    }

    public float sss(){
        if(verify()){
            minutes=minutes*3;
        }else{
            minutes=0;
        }
        return minutes;
    }

    public float getMinutes() {
        return minutes;
    }
}
