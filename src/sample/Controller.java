package sample;

public class Controller<Public> {

    Check[] lib = new Check[1];

    public Check[] Add(Check newCheck) {
        Check[] newlib = new Check[lib.length+1];
        System.arraycopy(lib, 0, newlib, 0, lib.length);
        newlib[newlib.length+1] = newCheck;
        return newlib;
    }

    static String SavingPath(String savePath) {
        return null;
    }


    public int get(int id){
        return lib[id].id;
    }

}
