package com.roman31x.proyecto.Modelo;

/**
 *
 * @author Roman31X
 */
public class DatosPersonajes {
    private int grupo;
    private int personaje;
    public String[] facil = {"BARDOCK","BROLY","GINE","GOKU","NAPPA","PARAGUS","RADITZ","VEGETA","TURLES","TOOMA"};
    public String[] normal = {"BULMA","CHAOZ","CHICHI","KRILIN","LUNCH","MARON","MUTAITO","VIDEL","YAJIROBE","YAMCHA"};
    public String[] dificil = {"FREEZA","CELL","MORO","DODORIA","BABY","BABBIDI","COOLA","SLUG","TAOPAIPAI","MAJINBUU"};
    public String[] dios = {"ARAK","BEERUS","CHAMPA","RUMOOSH","SIDRA","JEREZ","QUITELA","GEEN","VERMOUD","MULE"};

    public DatosPersonajes() {
    }

    public int getGrupo() {
        return grupo;
    }
    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }
    public int getPersonaje() {
        return personaje;
    }
    public void setPersonaje(int personaje) {
        this.personaje = personaje;
    }
    
    public String SeleccionTipo(int grupo){
        String tipo = "";
        switch(grupo){
            case 1: tipo = "SAYAJIN"; break;
            case 2: tipo = "TERRICOLA"; break;
            case 3: tipo = "VILLANO"; break;
            case 4: tipo = "DIOSES DESTRUCCION"; break;
        }
        return tipo;
    }
    
    public int TipoArreglo(String grupo){
        int numero = 0;
        switch(grupo){
            case "SAYAJIN": numero = 1; break;
            case "TERRICOLA": numero = 2; break;
            case "VILLANO": numero = 3; break;
            case "DIOSES DESTRUCCION": numero = 4; break;
        }
        return numero;
    }
    public char[] Nombre(int grupo,int personaje){
        char[] letras = null;
        switch(grupo){
            case 1: letras = facil[personaje].toCharArray(); break;
            case 2: letras = normal[personaje].toCharArray(); break;
            case 3: letras = dificil[personaje].toCharArray(); break;
            case 4: letras = dios[personaje].toCharArray(); break;
        }
        return letras;
    }
}
