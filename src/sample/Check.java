package sample;

public class Check {
    public int id;
    public int Price;
    public int Date;
    public String Comment;
    public boolean Online;

    public Check(String a) {
        int i = 0;
        while (a.charAt(i) != '/') {
            i++;
        }
        this.id = Integer.parseInt(a.substring(0, i - 1));
        int j = 0;
        while (a.charAt(j) != '!') {
            j++;
        }
        this.Price = Integer.parseInt(a.substring(i, j - 1));
        i = j;
        while (a.charAt(j) != '@') {
            j++;
        }
        this.Date = Integer.parseInt(a.substring(i, j - 1));
        i = j;
        while (a.charAt(j) != '^') {
            j++;
        }
        this.Comment = a.substring(i, j - 1);
        if (1 == Integer.parseInt(String.valueOf(a.charAt(j + 1)))) {
            this.Online = true;
        } else {
            this.Online = false;

        }
    }

    public Check Clone() throws CloneNotSupportedException {
        Check clone = this;
        return clone;
    }

    public String RollBack(){
        int i = 0;
        if (this.Online) i++;
        String out = this.id+'/'+this.Price+'!'+this.Date+'@'+this.Comment+'^'+i;
        return out;
    }
}
